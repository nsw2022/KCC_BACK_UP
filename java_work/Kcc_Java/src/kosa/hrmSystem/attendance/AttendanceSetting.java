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

		List<Integer> vacation = new ArrayList<>(); // 휴가번째 인덱스
		List<Integer> workQust = new ArrayList<>(); // 외근번째 인덱스
		List<Integer> business = new ArrayList<>(); // 출장번째 인덱스

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

		System.out.println("1.휴가처리  2.외근처리  3.출장처리  4.뒤로가기");

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
				System.out.println("잘못누르셨습니다.");
				break;
			}
		}
	}

	private void processVacation(List<Employee> allEmployee, List<Integer> vacation) {
		System.out.println("휴가 상태 처리:");
		System.out.println("1.승낙  2.거절 3.뒤로가기");
		for (int index : vacation) {
			System.out.println(index);
			Employee employee = allEmployee.get(index);
			System.out.println(employee.getName() + "의 휴가를 처리합니다.");
			while (true) {

				String str = sc.nextLine();
				if (str.equals("1")) {
					employee.setVacationState(StateType.commit);
					System.out.println(employee.getName() + "의 휴가가 승인되었습니다.");
					break;
				} else if (str.equals("2")) {
					employee.setVacationState(StateType.reject);
					System.out.println(employee.getName() + "의 휴가가 거절되었습니다.");
					break;
				} else if (str.equals("3")) {
					return;
				} else {
					System.out.println("잘못된 입력입니다. 다시 선택해 주세요.");
				}
			}
		}
	}

	private void processWorkQust(List<Employee> allEmployee, List<Integer> workQust) {
		System.out.println("외근 상태 처리:");
		for (int index : workQust) {
			Employee employee = allEmployee.get(index);
			System.out.println(employee.getName() + "의 외근을 처리합니다.");
			while (true) {
				System.out.println("1.승낙  2.거절");
				String str = sc.nextLine();
				if (str.equals("1")) {
					employee.setWorkOutsideState(StateType.commit);
					System.out.println(employee.getName() + "의 외근이 승인되었습니다.");
					break;
				} else if (str.equals("2")) {
					employee.setWorkOutsideState(StateType.reject);
					System.out.println(employee.getName() + "의 외근이 거절되었습니다.");
					break;
				} else {
					System.out.println("잘못된 입력입니다. 다시 선택해 주세요.");
				}
			}
		}
	}

	private void processBusiness(List<Employee> allEmployee, List<Integer> business) {
		System.out.println("출장 상태 처리:");
		for (int index : business) {
			Employee employee = allEmployee.get(index);
			// 여기서 출장을 처리
			System.out.println(employee.getName() + "의 출장을 처리합니다.");
			while (true) {
				System.out.println("1.승낙  2.거절");
				String str = sc.nextLine();
				if (str.equals("1")) {
					employee.setBusinessTripState(StateType.commit);
					System.out.println(employee.getName() + "의 외근이 승인되었습니다.");
					break;
				} else if (str.equals("2")) {
					employee.setBusinessTripState(StateType.reject);
					System.out.println(employee.getName() + "의 외근이 거절되었습니다.");
					break;
				} else {
					System.out.println("잘못된 입력입니다. 다시 선택해 주세요.");
				}
			}
		}
	}

}
