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
		StaffDB db = new StaffDB();// 전체DB
		HumanResourceMg humanResourceMg = new HumanResourceMg(db);// 인사결재
		Approval approval = new Approval();
		RecruitmentMg recruitmentMg = new RecruitmentMg();
		AttendanceMg attendanceMg = new AttendanceMg(db);
		
		System.out.println("1. 로그인   2.채용지원 ");
		String str = sc.nextLine();
		Employee user = Login.login(db);
		
		while (true) {
			//System.out.println("1. 로그인   2.채용지원");
			switch (str) {
			case "1":
				if (user instanceof HrStaff) {
					System.out.println("1. 인사과 편집  2. 퇴근:");
					String hrInput = sc.nextLine();
					attendanceMg.startWork(user.getEmployeeId());
					// 1번인사편집, 근태, 채용
					switch (hrInput) {
					case "1":
						
						humanResourceMg.hrUpdate();						
						break;
					case "2":
						attendanceMg.endWork(user.getEmployeeId());
						System.out.println("1. 로그인   2.채용지원");
						str = sc.nextLine();
						break;
					default:
						break;
					}
				}else if(user instanceof GeneralEmployee) {
					attendanceMg.startWork(user.getEmployeeId());
					// 출/퇴근, 휴가신청, 결재함 조회, 나의 근태조회
					// System.out.println("전직원");//// 성공
				}else if(user instanceof Executives) {
					attendanceMg.startWork(user.getEmployeeId());
					// 1.인사결재  2.채용결재  3.근여결재
					// System.out.println("임직원");////성공
					approval.hrApproval(db, humanResourceMg);
				}
				
				break;
			case "2":
				System.out.print("이름을 입력해주세요.");
				String jobSeekerName = sc.nextLine();
				JobSeeker jobSeeker = new JobSeeker(jobSeekerName);
				jobSeeker.apply(recruitmentMg);
				System.out.println("지원 완료!");
				recruitmentMg.jobSeekerSearch();
				System.out.print("합격시킬 아이디 입력: ");
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
