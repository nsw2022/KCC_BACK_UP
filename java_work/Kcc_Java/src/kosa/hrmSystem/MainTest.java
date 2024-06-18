package kosa.hrmSystem;

import java.util.Scanner;

import kosa.hrmSystem.attendance.AttendanceMg;
import kosa.hrmSystem.dao.StaffDB;
import kosa.hrmSystem.employees.Employee;
import kosa.hrmSystem.employees.Executives;
import kosa.hrmSystem.employees.GeneralEmployee;
import kosa.hrmSystem.employees.HrStaff;
import kosa.hrmSystem.employees.JobSeeker;
import kosa.hrmSystem.enums.DepartmentType;
import kosa.hrmSystem.enums.StateType;
import kosa.hrmSystem.executives_func.Approval;
import kosa.hrmSystem.hr.HumanResourceMg;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StaffDB db = new StaffDB();  // 전체DB
        HumanResourceMg humanResourceMg = new HumanResourceMg(db);  // 인사결재
        AttendanceMg attendanceMg = new AttendanceMg(db);
        Approval approval = new Approval(db);
        RecruitmentMg recruitmentMg = new RecruitmentMg(approval);

        while (true) {
            System.out.println("1. 로그인   2.채용지원   3.근태기록 조회   4. 종료");
            String str = sc.nextLine();

            if (str.equals("4")) {
                break;  // 루프 탈출 조건
            }

            switch (str) {
                case "1":
                    Employee user = Login.login(db);
                    if (user != null) {
                        if (user instanceof HrStaff) {
                            hrStaffMenu(sc, humanResourceMg, attendanceMg, user);
                        } else if (user instanceof GeneralEmployee) {
                            generalEmployeeMenu(sc, attendanceMg, user);
                        } else if (user instanceof Executives) {
                            executivesMenu(sc, approval, humanResourceMg, attendanceMg, user);
                        }
                    } else {
                        System.out.println("로그인 실패. 다시 시도해주세요.");
                    }
                    break;
                case "2":  
                	// 채용지원
                    jobApplicationProcess(sc, recruitmentMg);
                    break;
                case "3":
                	// 얘는 여따가 두변안되긴하는데 임시 근태
                    attendanceMg.printAttendanceRecords();
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    break;
            }
        }
    }
    
    /*
     	무한 루프 로직 
     	스캐너를 파라미터로 값 받아와서 그때마다 제어 함수화하던 스캐너 자체값을 받아와도됨
    */

    // 인사과 직원기능 모아놓음
    private static void hrStaffMenu(Scanner sc, HumanResourceMg humanResourceMg, AttendanceMg attendanceMg, Employee user) {
        attendanceMg.startWork(user.getEmployeeId()); // 출근
        while (true) {
            System.out.println("1. 인사과 편집   2. 채용   3. 근태관리   4. 퇴근");
            String hrInput = sc.nextLine();
            if (hrInput.equals("4")) {
                attendanceMg.endWork(user.getEmployeeId());//퇴근
                break;
            }
            switch (hrInput) {
                case "1":
                    humanResourceMg.hrUpdate();
                    break;
                    
                // 채용추가해야함 - 영진햄 헬프  
                
                case "3":
                    
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    break;
            }
        }
    }

    // 전직원 모아높음
    private static void generalEmployeeMenu(Scanner sc, AttendanceMg attendanceMg, Employee user) {
        attendanceMg.startWork(user.getEmployeeId());
        while (true) {
            System.out.println("1. 휴가신청   2. 출장 신청   3. 외근 신청   4. 결재함 조회   5. 나의 근태 조회   6. 퇴근");
            String generalInput = sc.nextLine();
            if (generalInput.equals("6")) {
                attendanceMg.endWork(user.getEmployeeId());
                break;
            }
            handleGeneralEmployeeInput(generalInput, attendanceMg, user); // 일반직원 매니저같은느낌
        }
    }
    
    // 일반 직원 기능 처리
    private static void handleGeneralEmployeeInput(String input, AttendanceMg attendanceMg, Employee user) {
        switch (input) {
            case "1":
                attendanceMg.vacationReq(user.getEmployeeId());
                System.out.println("휴가 신청이 완료되었습니다.");
                break;
            case "2":
                attendanceMg.businessTripReq(user.getEmployeeId());
                System.out.println("출장 신청이 완료되었습니다.");
                break;
            case "3":
                attendanceMg.workQutsideReq(user.getEmployeeId());
                System.out.println("외근 신청이 완료되었습니다.");
                break;
            case "4":
                attendanceMg.showCase(user.getEmployeeId());
                break;
            case "5":
                // 나의 근태 조회 기능 추가
                break;
            default:
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                break;
        }
    }

    //임원 모음
    private static void executivesMenu(Scanner sc ,Approval approval, HumanResourceMg humanResourceMg, AttendanceMg attendanceMg, Employee user) {
        attendanceMg.startWork(user.getEmployeeId());
        // 1.인사결재  2.급여결재 3.채용결재 4.퇴근 
        
        while (true) {
            System.out.println("1.인사결재  2.급여결재 3.채용결재 4.퇴근 ");
            String executilInput = sc.nextLine();
            if (executilInput.equals("4")) {
                attendanceMg.endWork(user.getEmployeeId());
                break;
            }
            handleexEcutivesInput(executilInput, attendanceMg, approval,humanResourceMg ,user); // 임원직원 매니저같은느낌
        }
        
    }
    
    // 임원 기능 처리
    private static void handleexEcutivesInput(String executilInput, AttendanceMg attendanceMg,Approval approval ,HumanResourceMg humanResourceMg,Employee user) {
		switch (executilInput) {
		case "1":
			approval.hrApproval(humanResourceMg);
			break;
		case "2":
			break;

		 default:
             System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
             break;
		}
		
	}

	// 채용쪽 프로세스
    private static void jobApplicationProcess(Scanner sc, RecruitmentMg recruitmentMg) {
        System.out.print("이름을 입력해주세요: ");
        String jobSeekerName = sc.nextLine();
        JobSeeker jobSeeker = new JobSeeker(jobSeekerName);
        jobSeeker.apply(recruitmentMg);
        System.out.println("지원 완료!");
        recruitmentMg.jobSeekerSearch();
        System.out.print("합격시킬 아이디 입력: ");
        int id = sc.nextInt();
        sc.nextLine();  // 초기화
        recruitmentMg.jobSeekerPass(id);
    }
}

