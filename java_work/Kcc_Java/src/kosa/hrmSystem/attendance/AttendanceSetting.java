package kosa.hrmSystem.attendance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kosa.hrmSystem.dao.StaffDB;
import kosa.hrmSystem.employees.Employee;
import kosa.hrmSystem.enums.StateType;

public class AttendanceSetting {
	private String startTimeStandard, endTimeStandard;
	private StaffDB db;
	private Scanner sc = new Scanner(System.in);

	public AttendanceSetting() {
	}

	public AttendanceSetting(StaffDB db) {
		super();
		this.db = db;
	}

	public void attendanceApproval() {
		List<Employee> allEmployee = db.readDB();

		List<Integer> vacation = new ArrayList<>(); // �ް���° �ε���
		List<Integer> workQust = new ArrayList<>(); // �ܱٹ�° �ε���
		List<Integer> business = new ArrayList<>(); // �����° �ε���

		for (int i = 0; i < allEmployee.size(); i++) {
			Employee employee = allEmployee.get(i);

			if (employee.getVacationState() != null && employee.getVacationState().equals(StateType.pending)) {
				vacation.add(i);
			}
			if (employee.getWorkOutsideState() != null && employee.getWorkOutsideState().equals(StateType.pending)) {
				workQust.add(i);
			}
			if (employee.getBusinessTripState() != null && employee.getBusinessTripState().equals(StateType.pending)) {
				business.add(i);
			}
		}

		System.out.println("1.�ް�ó��  2.�ܱ�ó��  3.����ó��  4.�ڷΰ���");

		while (true) {
			String str = sc.nextLine();
			switch (str) {
			case "1":
				processVacation(allEmployee, vacation);
				break;
			case "2":
				processWorkQust(allEmployee, workQust);
				break;
			case "3":
				processBusiness(allEmployee, business);
				break;
			case "4":
				return;
			default:
				System.out.println("�߸������̽��ϴ�.");
				break;
			}
		}
	}

	private void processVacation(List<Employee> allEmployee, List<Integer> vacation) {
		System.out.println("�ް� ���� ó��:");
		System.out.println("1.�³�  2.���� 3.�ڷΰ���");
		for (int index : vacation) {
			System.out.println(index);
			Employee employee = allEmployee.get(index);
			System.out.println(employee.getName() + "�� �ް��� ó���մϴ�.");
			while (true) {

				String str = sc.nextLine();
				if (str.equals("1")) {
					employee.setVacationState(StateType.commit);
					System.out.println(employee.getName() + "�� �ް��� ���εǾ����ϴ�.");
					break;
				} else if (str.equals("2")) {
					employee.setVacationState(StateType.reject);
					System.out.println(employee.getName() + "�� �ް��� �����Ǿ����ϴ�.");
					break;
				} else if (str.equals("3")) {
					return;
				} else {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� ������ �ּ���.");
				}
			}
		}
	}

	private void processWorkQust(List<Employee> allEmployee, List<Integer> workQust) {
		System.out.println("�ܱ� ���� ó��:");
		for (int index : workQust) {
			Employee employee = allEmployee.get(index);
			System.out.println(employee.getName() + "�� �ܱ��� ó���մϴ�.");
			while (true) {
				System.out.println("1.�³�  2.����");
				String str = sc.nextLine();
				if (str.equals("1")) {
					employee.setWorkOutsideState(StateType.commit);
					System.out.println(employee.getName() + "�� �ܱ��� ���εǾ����ϴ�.");
					break;
				} else if (str.equals("2")) {
					employee.setWorkOutsideState(StateType.reject);
					System.out.println(employee.getName() + "�� �ܱ��� �����Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� ������ �ּ���.");
				}
			}
		}
	}

	private void processBusiness(List<Employee> allEmployee, List<Integer> business) {
		System.out.println("���� ���� ó��:");
		for (int index : business) {
			Employee employee = allEmployee.get(index);
			// ���⼭ ������ ó��
			System.out.println(employee.getName() + "�� ������ ó���մϴ�.");
			while (true) {
				System.out.println("1.�³�  2.����");
				String str = sc.nextLine();
				if (str.equals("1")) {
					employee.setBusinessTripState(StateType.commit);
					System.out.println(employee.getName() + "�� �ܱ��� ���εǾ����ϴ�.");
					break;
				} else if (str.equals("2")) {
					employee.setBusinessTripState(StateType.reject);
					System.out.println(employee.getName() + "�� �ܱ��� �����Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� ������ �ּ���.");
				}
			}
		}
	}

}
