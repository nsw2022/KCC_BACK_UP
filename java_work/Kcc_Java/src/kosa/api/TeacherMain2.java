package kosa.api;

import java.util.Scanner;

public class TeacherMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
		
		sc.close();
	}

	private static String solution(String str) {
		String answer="";
		String arr[] = str.split(" ");
		int m=0;
		for (String x : arr) {
			int len = x.length();
			if(len>m) {
				m = len;
				answer = x;
			}
		}
		
		return answer;
	}
}
