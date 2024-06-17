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
        StaffDB db = new StaffDB();  // ��üDB
        HumanResourceMg humanResourceMg = new HumanResourceMg(db);  // �λ����
        AttendanceMg attendanceMg = new AttendanceMg(db);
        Approval approval = new Approval(db);
        RecruitmentMg recruitmentMg = new RecruitmentMg(approval);

        while (true) {
            System.out.println("1. �α���   2.ä������   3.���±�� ��ȸ   4. ����");
            String str = sc.nextLine();

            if (str.equals("4")) {
                break;  // ���� Ż�� ����
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
                            executivesMenu(approval, humanResourceMg, attendanceMg, user);
                        }
                    } else {
                        System.out.println("�α��� ����. �ٽ� �õ����ּ���.");
                    }
                    break;
                case "2":  
                	// ä������
                    jobApplicationProcess(sc, recruitmentMg);
                    break;
                case "3":
                	// ��� ������ �κ��ȵǱ��ϴµ� �ӽ� ����
                    attendanceMg.printAttendanceRecords();
                    break;
                default:
                    System.out.println("�߸��� �Է��Դϴ�. �ٽ� �õ����ּ���.");
                    break;
            }
        }
    }
    
    /*
     	���� ���� ���� 
     	��ĳ�ʸ� �Ķ���ͷ� �� �޾ƿͼ� �׶����� ���� �Լ�ȭ�ϴ� ��ĳ�� ��ü���� �޾ƿ͵���
    */

    // �λ�� ������� ��Ƴ���
    private static void hrStaffMenu(Scanner sc, HumanResourceMg humanResourceMg, AttendanceMg attendanceMg, Employee user) {
        attendanceMg.startWork(user.getEmployeeId()); // ���
        while (true) {
            System.out.println("1. �λ�� ����   2. ä��   3. ���°���   4. ���");
            String hrInput = sc.nextLine();
            if (hrInput.equals("4")) {
                attendanceMg.endWork(user.getEmployeeId());//���
                break;
            }
            switch (hrInput) {
                case "1":
                    humanResourceMg.hrUpdate();
                    break;
                    
                // ä���߰��ؾ��� - ������ ����  
                
                case "3":
                    // 
                    break;
                default:
                    System.out.println("�߸��� �Է��Դϴ�. �ٽ� �õ����ּ���.");
                    break;
            }
        }
    }

    // ������ ��Ƴ���
    private static void generalEmployeeMenu(Scanner sc, AttendanceMg attendanceMg, Employee user) {
        attendanceMg.startWork(user.getEmployeeId());
        while (true) {
            System.out.println("1. �ް���û   2. ���� ��û   3. �ܱ� ��û   4. ������ ��ȸ   5. ���� ���� ��ȸ   6. ���");
            String generalInput = sc.nextLine();
            if (generalInput.equals("6")) {
                attendanceMg.endWork(user.getEmployeeId());
                break;
            }
            handleGeneralEmployeeInput(generalInput, attendanceMg, user); // �Ϲ����� �Ŵ�����������
        }
    }
    
    // �Ϲ� ���� ��� ó��
    private static void handleGeneralEmployeeInput(String input, AttendanceMg attendanceMg, Employee user) {
        switch (input) {
            case "1":
                attendanceMg.vacationReq(user.getEmployeeId());
                System.out.println("�ް� ��û�� �Ϸ�Ǿ����ϴ�.");
                break;
            case "2":
                attendanceMg.businessTripReq(user.getEmployeeId());
                System.out.println("���� ��û�� �Ϸ�Ǿ����ϴ�.");
                break;
            case "3":
                attendanceMg.workQutsideReq(user.getEmployeeId());
                System.out.println("�ܱ� ��û�� �Ϸ�Ǿ����ϴ�.");
                break;
            case "4":
                attendanceMg.showCase(user.getEmployeeId());
                break;
            case "5":
                // ���� ���� ��ȸ ��� �߰�
                break;
            default:
                System.out.println("�߸��� �Է��Դϴ�. �ٽ� �õ����ּ���.");
                break;
        }
    }

    //�ӿ� ����
    private static void executivesMenu(Approval approval, HumanResourceMg humanResourceMg, AttendanceMg attendanceMg, Employee user) {
        attendanceMg.startWork(user.getEmployeeId());
        approval.hrApproval(humanResourceMg); // ������� ��
        
    }

    // ä���� ���μ���
    private static void jobApplicationProcess(Scanner sc, RecruitmentMg recruitmentMg) {
        System.out.print("�̸��� �Է����ּ���: ");
        String jobSeekerName = sc.nextLine();
        JobSeeker jobSeeker = new JobSeeker(jobSeekerName);
        jobSeeker.apply(recruitmentMg);
        System.out.println("���� �Ϸ�!");
        recruitmentMg.jobSeekerSearch();
        System.out.print("�հݽ�ų ���̵� �Է�: ");
        int id = sc.nextInt();
        sc.nextLine();  // �ʱ�ȭ
        recruitmentMg.jobSeekerPass(id);
    }
}

