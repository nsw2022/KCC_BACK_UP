package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// 문자열 비교
//		String a = "abc";
//		String b = "abc";
//		
//		if( a.equals(b) ) {
//			System.out.println("같다");
//		}else {
//			System.out.println("틀리다");
//		}

		// 두 정수와 연산자 문자열을 입력받아
		// 사칙연산 결과를 출력하시오.
		// ex> 정수 1: 10
		// ex> 정수 2: 20
		// ex> 연산자: 30
		Scanner sc = new Scanner(System.in);
		int userint1, userint2;
		String usercal;
		System.out.println("두 정수를 입력후 연산자 문자열 + - * / 를 입력");
		System.out.print("정수 1: ");
		userint1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수 2: ");
		userint2 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자: ");
		usercal = sc.nextLine();
		if (usercal.equals("+")) {
			System.out.println("결과: " + (userint1 + userint2));
		} else if (usercal.equals("-")) {
			System.out.println("결과: " + (userint1 - userint2));

		} else if (usercal.equals("*")) {
			System.out.println("결과: " + (userint1 * userint2));

		} else if (usercal.equals("/")) {
			System.out.println("결과: " + (userint1 / userint2));

		}
		sc.close();

	}

}
