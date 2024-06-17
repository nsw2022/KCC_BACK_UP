package kosa.hrmSystem.salaryMg;

import java.util.ArrayList;
import java.util.Scanner;

public class SalaryPrint implements BasicSalary{
	Scanner sc = new Scanner(System.in);
	
	ArrayList<SalaryMath> arr = new ArrayList<SalaryMath>();
	
	@Override
	public void worker() {
		// 이거 확인용임 여기에 리스트 뿌릴거
		String name;
        String jobRank;
        int basicSalary;
        int bonus;
        double taxRate;
        int monthSalary;
        SalaryMath cb = new SalaryMath();
        
        basicSalary = sc.nextInt();
        System.out.println("수당을 입력해주세요: ");
        bonus = sc.nextInt();
        cb.setBonus(bonus);
        arr.add(cb);
        System.out.println("등록 완료!!");
		
	}

	@Override
	public void search() {
		System.out.println("사원 이름 입력: ");
		String searchName = sc.nextLine();
		boolean right = true;
		
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getName().equals(searchName)) {
				right = false;
				System.out.println("이름: "+arr.get(i).getName());
				System.out.println("직급: "+arr.get(i).getJobRank());
				System.out.println("기본급: "+arr.get(i).getStandardSalary());
				System.out.println("수당: "+arr.get(i).getBonus());
				System.out.println("세율: "+arr.get(i).getRating());
				System.out.println("월급: "+arr.get(i).getMonthSalary());
				break;
			}
		}
		if(right) {
			System.out.println("사원이 존재하지않습니다.");
		}
	}

	@Override
	public void salaryAllview() {
		System.out.println("==========모든 사원 정보 출력==========");
		System.out.println("--------------------------------------------------");
		System.out.println("| 이름  | 직급 |  기본급   |  수당   | 세율  |  월급    |");
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println("|" + arr.get(i).getName() + "| " + arr.get(i).getJobRank() + " | "
					+ arr.get(i).getStandardSalary() + "  | " + arr.get(i).getBonus() + " | " 
					+ arr.get(i).getRating() + " | " + arr.get(i).getMonthSalary() + " |");
		}
		
	}
	
}
