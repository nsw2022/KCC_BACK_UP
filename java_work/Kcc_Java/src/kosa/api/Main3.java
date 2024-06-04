package kosa.api;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		//48_57
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		System.out.println(soultion(userInput));
	}

	private static String soultion(String userInput) {
		int answer[] = new int[userInput.length()];
		for (int i = 0; i < userInput.length(); i++) {
			if (userInput.charAt(i)>47&&userInput.charAt(i)<58) {
				answer[i]=userInput.charAt(i);
			}
		}
		char[] result = new char[userInput.length()];
		for (int i = 0; i < result.length; i++) {
			if (answer[i]!=0) {
				result[i] = (char) answer[i];
			}
		}
		
		String test = "";
		for (char c : result) {
			if(c=='0') continue;
			
			test += c;
			test=test.strip();
			test=test.replace(" ","");
		}
		return test;
	}
}
