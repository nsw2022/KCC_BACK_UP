package kosa.api.question;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		
		str = str.toLowerCase();
		char[] arr = str.toCharArray();
		char[] arr2 = arr.clone();
		
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
	        arr2[j] = arr[i];
	    }
	    System.out.println(Arrays.toString(arr));
	    System.out.println(Arrays.toString(arr2));
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] != arr2[i]) {
	            return "No";
	        }
	    }
		return "Tes";
	}
}
