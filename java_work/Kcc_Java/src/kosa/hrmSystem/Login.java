package kosa.hrmSystem;

import java.util.List;

import kosa.hrmSystem.dao.StaffDB;
import kosa.hrmSystem.employees.Employee;


public class Login {
    public static Employee login(StaffDB db) {
//        �α��� ������ ����� �ν��Ͻ��� �ޱ����� ����
        Employee em = null;
//        StaffDB�ν��Ͻ����� ��� �迭�� ������
        List<Employee> allEmployee = db.readDB();

        System.out.print("���� ID�� �Է��ϼ���: ");
        String employeeId = ScannerTool.sc.nextLine();
        System.out.print("pw�� �Է��ϼ���: ");
        String employeePw = ScannerTool.sc.nextLine();
        
        for (Employee employee : allEmployee) {
        	
            if (employee.getEmployeeId().equals(employeeId)) {
            	
                if (employee.getEmployeePw().equals(employeePw)) {
                    System.out.println("�α��� ����!");
                    em = employee;
                } else {
                    System.out.println("pw�� Ʋ�Ƚ��ϴ�!");
                }

            } else {
                System.out.println("�ش��ϴ� ID�� �����ϴ�.");
            }
            if (em != null) {
            	return em;
            }
        }
        return em;
    }
}
