package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// 성적관리 구현
		// 국어, 영어, 수학 점수를 키보드로 부터 입력 받고
		// 총점과 평균을 출력하세요. 평균은 실수형

		Scanner sc = new Scanner(System.in);
//		System.out.print("국어 점수를 입력해주세요 : ");
//		int kor = Integer.parseInt(sc.nextLine());
//		System.out.print("영어 점수를 입력해주세요 : ");
//		int eng = Integer.parseInt(sc.nextLine());
//		System.out.print("수학 점수를 입력해주세요 : ");
//		int math = Integer.parseInt(sc.nextLine());
//		double result = ((double)(kor+eng+math)/3);
//		System.out.printf("총점 점수 : %d, 평균 점수 : %.2f" , (kor+eng+math),(double)result);

//		int kor,eng,mat,total,aver;
//		
//		System.out.print("국어: ");
//		kor = sc.nextInt();
//		System.out.print("영어: ");
//		eng = sc.nextInt();
//		System.out.print("수학: ");
//		mat = sc.nextInt();
//		
//		total = kor+eng+mat;
//		aver = (int)(total/3.0);
//		System.out.println("총점: " + total);
//		System.out.println("평균: " + aver);

		// 90=>A 80이상B 70이상C 60이상D 60이하F
		// ABCDF  90 80 70 60
		System.out.println("점수를 입력해주세요");
		int score = Integer.parseInt(sc.nextLine());
//		if (score >= 90) {
//			System.out.println("A학점");
//		} else if (score >= 80) {
//			System.out.println("B학점");
//		} else if (score >= 70) {
//			System.out.println("C학점");
//		} else if (score >= 60) {
//			System.out.println("D학점");
//		} else {
//			System.out.println("F학점");
//		}
		// 100/10  60/10 6
//		String grade = "FFFFFFDCBA".charAt(score/10)+"";
//		System.out.println(grade);
		
		String grade = "FFFFFFDCBA".charAt(score/10)+"";
		switch (grade) {
		case "A":	
			System.out.println("A학점");
			break;
		case "B":	
			System.out.println("B학점");
			break;
		case "C":	
			System.out.println("C학점");
			break;
		case "D":	
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
			break;
		}
		sc.close();
	}

}
