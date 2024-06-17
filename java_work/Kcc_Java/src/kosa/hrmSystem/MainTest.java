package kosa.hrmSystem;

import java.util.Scanner;

import kosa.hrmSystem.attendance.AttendanceMg;
import kosa.hrmSystem.dao.StaffDB;
import kosa.hrmSystem.employees.Employee;
import kosa.hrmSystem.employees.Executives;
import kosa.hrmSystem.employees.GeneralEmployee;
import kosa.hrmSystem.employees.HrStaff;
import kosa.hrmSystem.employees.JobSeeker;
import kosa.hrmSystem.enums.StateType;
import kosa.hrmSystem.executives_func.Approval;
import kosa.hrmSystem.hr.HumanResourceMg;

public class MainTest {
	public static void main(String[] args) {
		/*
		StaffDB db = new StaffDB();
		Login.login(db);
		System.out.println(db.toString());
		HumanResourceMg humanResourceMg = new HumanResourceMg(db);
		humanResourceMg.hrUpdate();
		Approval approval = new Approval();
		approval.hrApproval(db, humanResourceMg);
		*/
		Scanner sc = new Scanner(System.in);
		StaffDB db = new StaffDB();// ��üDB
		HumanResourceMg humanResourceMg = new HumanResourceMg(db);// �λ����
		Approval approval = new Approval();
		RecruitmentMg recruitmentMg = new RecruitmentMg();
		AttendanceMg attendanceMg = new AttendanceMg(db);
		
		System.out.println("1. �α���   2.ä������ ");
		String str = sc.nextLine();
		Employee user = Login.login(db);
		
		while (true) {
			//System.out.println("1. �α���   2.ä������");
			switch (str) {
			case "1":
				if (user instanceof HrStaff) {
					System.out.println("1. �λ�� ����  2. ���:");
					String hrInput = sc.nextLine();
					attendanceMg.startWork(user.getEmployeeId());
					// 1���λ�����, ����, ä��
					switch (hrInput) {
					case "1":
						
						humanResourceMg.hrUpdate();						
						break;
					case "2":
						attendanceMg.endWork(user.getEmployeeId());
						System.out.println("1. �α���   2.ä������");
						str = sc.nextLine();
						break;
					default:
						break;
					}
				}else if(user instanceof GeneralEmployee) {
					attendanceMg.startWork(user.getEmployeeId());
					// ��/���, �ް���û, ������ ��ȸ, ���� ������ȸ
					// System.out.println("������");//// ����
				}else if(user instanceof Executives) {
					attendanceMg.startWork(user.getEmployeeId());
					// 1.�λ����  2.ä�����  3.�ٿ�����
					// System.out.println("������");////����
					approval.hrApproval(db, humanResourceMg);
				}
				
				break;
			case "2":
				System.out.print("�̸��� �Է����ּ���.");
				String jobSeekerName = sc.nextLine();
				JobSeeker jobSeeker = new JobSeeker(jobSeekerName);
				jobSeeker.apply(recruitmentMg);
				System.out.println("���� �Ϸ�!");
				recruitmentMg.jobSeekerSearch();
				System.out.print("�հݽ�ų ���̵� �Է�: ");
				int id = sc.nextInt();
				sc.nextLine();
				recruitmentMg.jobSeekerPass(id);
				
				break;
			case "3":
				//attendanceMg.commute();
				attendanceMg.printAttendanceRecords();
				str = sc.nextLine();
				break;
			default:
				break;
			}
		}

	}
}
