package kosa.hrmSystem.hr.salaryMg;

import kosa.hrmSystem.enums.CompanyLevel;

public class SalaryMath {
	private String name;
	private String jobRank; //����
	private int standardSalary; //�⺻��
	private int bonus; //����
	private double rating; // ������ ������
	private int monthSalary; //����
	private int levelSalary;
	
	
	public SalaryMath() {}
	
	public int getMonthSalary() {
		standardSalary = 2000000;
		monthSalary = (int)((standardSalary + bonus + levelSalary)*(1.0-rating));
		return monthSalary;
	}
	
	public double getRating() {
		if (standardSalary <= 4000000) {
			rating = 0.15;
			return rating;
		} else if(standardSalary > 4000000 && standardSalary <7000000) {
			rating = 0.24;
			return rating;
		} else {
			rating = 0.35;
			return rating;
		}
		
	}
	
	public int getLevelSalary() {
		if(CompanyLevel.clerk.equals("���")) {
			levelSalary+=0;
			return levelSalary;
		}else if(CompanyLevel.am.equals("�븮")) {
			levelSalary+=1000000;
			return levelSalary;
		}else if(CompanyLevel.manager.equals("����")) {
			levelSalary+=1500000;
			return levelSalary;
		}else if(CompanyLevel.dgm.equals("����")) {
			levelSalary+=2000000;
			return levelSalary;
		}else if(CompanyLevel.dgm.equals("����")) {
			levelSalary+=3000000;
			return levelSalary;
		}else {
			return levelSalary;
		}
	}


	

	public SalaryMath(String name, String jobRank, int standardSalary, int bonus, double rating, int monthSalary) {
		super();
		this.name = name;
		this.jobRank = jobRank;
		this.standardSalary = standardSalary;
		this.bonus = bonus;
		this.rating = rating;
		this.monthSalary = monthSalary;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJobRank() {
		return jobRank;
	}


	public void setJobRank(String jobRank) {
		this.jobRank = jobRank;
	}


	public int getStandardSalary() {
		return standardSalary;
	}

	public void setStandardSalary(int standardSalary) {
		this.standardSalary = standardSalary;
	}

	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}


	
	
	
	
}