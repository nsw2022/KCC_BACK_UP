package kosa.hrmSystem;

import java.util.Scanner;

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
		Approval approval = new Approval(db);
		RecruitmentMg recruitmentMg = new RecruitmentMg(approval);
		
		while (true) {
			System.out.println("1. 로그인   2.채용지원");
			String str = sc.nextLine();
			switch (str) {
			case "1":
				Employee user = Login.login(db);
				if (user instanceof HrStaff) {
					String hrInput = sc.nextLine();
					// 1번인사편집, 근태, 채용
					switch (hrInput) {
					case "1":
						humanResourceMg.hrUpdate();						
						break;

					default:
						break;
					}
				}else if(user instanceof GeneralEmployee) {
					// 출/퇴근, 휴가신청, 결재함 조회, 나의 근태조회
					// System.out.println("전직원");//// 성공
				}else if(user instanceof Executives) {
					// 1.인사결재  2.채용결재  3.근여결재
					// System.out.println("임직원");////성공
					approval.hrApproval(humanResourceMg);
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
			default:
				break;
			}
		}

	}
}
