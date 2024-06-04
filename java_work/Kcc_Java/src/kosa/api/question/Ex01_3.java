package kosa.api.question;

import java.util.Scanner;

public class Ex01_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));

	}

	private static String solution(String str) {
		String test = "";
		for (String x : str.split(" ")) {
			if (test.length()<x.length()) {
				test=x;
				
			}
		}
		
		return test;
	}

}
