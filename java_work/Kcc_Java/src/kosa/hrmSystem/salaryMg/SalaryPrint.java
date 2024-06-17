package kosa.hrmSystem.salaryMg;

import java.util.ArrayList;
import java.util.Scanner;

public class SalaryPrint implements BasicSalary{
	Scanner sc = new Scanner(System.in);
	
	ArrayList<SalaryMath> arr = new ArrayList<SalaryMath>();
	
	@Override
	public void worker() {
		// �̰� Ȯ�ο��� ���⿡ ����Ʈ �Ѹ���
		String name;
        String jobRank;
        int basicSalary;
        int bonus;
        double taxRate;
        int monthSalary;
        SalaryMath cb = new SalaryMath();
        
        basicSalary = sc.nextInt();
        System.out.println("������ �Է����ּ���: ");
        bonus = sc.nextInt();
        cb.setBonus(bonus);
        arr.add(cb);
        System.out.println("��� �Ϸ�!!");
		
	}

	@Override
	public void search() {
		System.out.println("��� �̸� �Է�: ");
		String searchName = sc.nextLine();
		boolean right = true;
		
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getName().equals(searchName)) {
				right = false;
				System.out.println("�̸�: "+arr.get(i).getName());
				System.out.println("����: "+arr.get(i).getJobRank());
				System.out.println("�⺻��: "+arr.get(i).getStandardSalary());
				System.out.println("����: "+arr.get(i).getBonus());
				System.out.println("����: "+arr.get(i).getRating());
				System.out.println("����: "+arr.get(i).getMonthSalary());
				break;
			}
		}
		if(right) {
			System.out.println("����� ���������ʽ��ϴ�.");
		}
	}

	@Override
	public void salaryAllview() {
		System.out.println("==========��� ��� ���� ���==========");
		System.out.println("--------------------------------------------------");
		System.out.println("| �̸�  | ���� |  �⺻��   |  ����   | ����  |  ����    |");
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println("|" + arr.get(i).getName() + "| " + arr.get(i).getJobRank() + " | "
					+ arr.get(i).getStandardSalary() + "  | " + arr.get(i).getBonus() + " | " 
					+ arr.get(i).getRating() + " | " + arr.get(i).getMonthSalary() + " |");
		}
		
	}
	
}
