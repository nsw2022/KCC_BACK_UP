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
			if (allEmployee.get(i).getVacationState().equals(StateType.pending)) {
				vacation.add(i);
			}
			if (allEmployee.get(i).getWorkOutsideState().equals(StateType.pending)) {
				workQust.add(i);
			}
			if (allEmployee.get(i).getBusinessTripState().equals(StateType.pending)) {
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
		for (int index : vacation) {
			Employee employee = allEmployee.get(index);
			// ���⼭ �ް� ó���� ����
			System.out.println(employee.getName() + "�� �ް��� ó���մϴ�.");
			// ��: employee.setVacationState(StateType.approved);
		}
	}

	private void processWorkQust(List<Employee> allEmployee, List<Integer> workQust) {
		System.out.println("�ܱ� ���� ó��:");
		for (int index : workQust) {
			Employee employee = allEmployee.get(index);
			// ���⼭ �ܱ� ó���� ����
			System.out.println(employee.getName() + "�� �ܱ��� ó���մϴ�.");
			// ��: employee.setWorkOutsideState(StateType.approved);
		}
	}

	private void processBusiness(List<Employee> allEmployee, List<Integer> business) {
		System.out.println("���� ���� ó��:");
		for (int index : business) {
			Employee employee = allEmployee.get(index);
			// ���⼭ ������ ó��
			System.out.println(employee.getName() + "�� ������ ó���մϴ�.");
			// ��: employee.setBusinessTripState(StateType.approved);
		}
	}

}
