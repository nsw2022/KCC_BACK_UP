package kosa.api.question;

import java.util.Scanner;

public class Ex01_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

	private static int solution(String str) {
		Scanner sc = new Scanner(System.in);
		String str2 = sc.nextLine();
		str=str.toLowerCase();
		str2=str2.toLowerCase();
		int count=0;
		for (char x : str.toCharArray()) {
//			System.out.println(x);
			if(x == str2.charAt(0)) count++;
		}
//		System.out.println(str2);
		return count;
	}

}
