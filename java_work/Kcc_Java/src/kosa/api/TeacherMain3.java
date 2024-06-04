package kosa.api;

import java.util.Scanner;

public class TeacherMain3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		System.out.println(soultion(str));
		System.out.println('a');
		System.out.println((int)'a');
	}

	private static int soultion(String str) {
		String answer="";
		
		for (char x : str.toCharArray()) {
			if (Character.isDigit(x)) {
				if(x>=48 && x<=57) answer += x;
			}
		}
		
		return Integer.parseInt(answer);
	}

}
