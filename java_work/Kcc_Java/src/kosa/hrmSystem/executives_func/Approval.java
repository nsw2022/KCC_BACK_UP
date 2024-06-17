package kosa.hrmSystem.executives_func;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import kosa.hrmSystem.dao.StaffDB;
import kosa.hrmSystem.employees.Employee;
import kosa.hrmSystem.employees.JobSeeker;

public class Approval {
	Scanner sc = new Scanner(System.in);
	private List<Employee> hrApprovalCase;
	private List<Employee> salaryApprovalCase;
	private List<JobSeeker> recruitmentApprovalCase;

	// constructor
	public Approval() {
		this.hrApprovalCase = new LinkedList<Employee>();
		this.salaryApprovalCase = new LinkedList<Employee>();
		this.recruitmentApprovalCase = new LinkedList<JobSeeker>();
	}

	// method
	public void hrApproval(StaffDB db) {
		List<Employee> allEmployee=db.readDB();
		if (hrApprovalCase.isEmpty() == true) {
			System.out.println("���� �� �λ���� ���� �����ϴ�.");
			return;
		}
		System.out.println("������ ������ �����ϼ���: ");
		int cnt = 0;
		for (Employee employee : hrApprovalCase) {
			System.out.print(cnt+"��°)"+"�����̸�: "+employee.getName() + "����: "+employee.getDepartmentType()+"�μ�: "+employee.getCompanyLevel());
			cnt++;
		}
		cnt = 0;
		System.out.println();
		System.out.print("���� �� ����� ��ȣ�� �������� �����Ͽ� �Է��ϼ���:");
		String num = sc.nextLine();
		String[] arr=num.strip().split(" ");
		List<Employee> tmpList = new  ArrayList<Employee>();
		for (int i = 0; i < arr.length; i++) {
			tmpList.add(hrApprovalCase.get(Integer.parseInt(arr[i])));
		}
		for (int i = 0; i < allEmployee.size(); i++) {
			for (int j = 0; j < tmpList.size(); j++) {
				if(allEmployee.get(i).getEmployeeId().equals(tmpList.get(j).getEmployeeId())) {
					allEmployee.get(i)allEmployee = tmpList.get(j);
				}
			}
		}
		
	}

	public void salaryApproval() {
		if (salaryApprovalCase.isEmpty() == true) {
			System.out.println("���� �� �޿����� ���� �����ϴ�.");
			return;
		}
		
	}

	public void recruitmentApproval() {
		if (recruitmentApprovalCase.isEmpty() == true) {
			System.out.println("���� �� ä����� ���� �����ϴ�.");
			return;
		}
	}

}
