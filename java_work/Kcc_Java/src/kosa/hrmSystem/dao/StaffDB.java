package kosa.hrmSystem.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import kosa.hrmSystem.employees.Employee;
import kosa.hrmSystem.employees.HrStaff;

public class StaffDB {

	Scanner sc = new Scanner(System.in);

	private List<Employee> employeeList = new ArrayList<Employee>();

	public void createDB(String name,String employeeId,String employeePw) {
		
		// employeeList.add(new Employee(name, employeeId, employeePw)); ////�⺻Ʋ
		employeeList.add(new HrStaff("��¿�","aaa","1234"));
	}

	public void updateDB(String employeeId) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId().equals(employeeId)) {
				System.out.println("���泻�� �Է����ּ��� :");
				System.out.print("���̵� :");
				employee.setEmployeeId(sc.nextLine());
				System.out.print("��� :");
				employee.setEmployeePw(sc.nextLine());
				System.out.print("�̸� :");
				employee.setName(sc.nextLine());
			} else {
				System.out.println("");
			}
		}
	}

	public void deleteDB(String employeeId) {
		Employee employee = readDetail(employeeId);
		if (employee != null) {			
			employeeList.remove(employee);
		}else {
			throw new RuntimeException("�ش� ������ �����ϴ�");
		}
	}
	
	public Employee readDetail(String employeeId) {
		List<Employee> list = employeeList.stream()
				.filter(Id->Id.getEmployeeId().equals(employeeId))
				.collect(Collectors.toList());
		Employee employee=null;
		if (!list.isEmpty()) {
			employee = list.get(0);
		}
		return employee;
	}

	public List<Employee> readDB() {
		return employeeList;
	}
}