package kosa.hrmSystem.executives_func;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import kosa.hrmSystem.employees.Employee;
import kosa.hrmSystem.employees.JobSeeker;

public class Approval {
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
	public void hrApproval() {
		if (hrApprovalCase.isEmpty() == true) {
			System.out.println("���� �� �λ���� ���� �����ϴ�.");
			return;
		}
		for (Employee employee : hrApprovalCase) {

//            int num = ScannerTool.sc.nextInt();

//            if () {
//            } else {
//            }
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
