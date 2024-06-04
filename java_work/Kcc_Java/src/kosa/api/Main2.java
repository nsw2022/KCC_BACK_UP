package kosa.api;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputFirst = sc.nextLine();
		String [] arr = inputFirst.split(" ");
		int[] lenArr = new int[arr.length];
		
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			lenArr[i]=arr[i].length();
			
		}
		count = lenArr[0];
		for (int i = 0; i < lenArr.length; i++) {
			if (count<lenArr[i]) {
				count=lenArr[i];
			}
		}
		for (String s : arr) {
			if(s.length()==count) System.out.println(s);
		}
		
		sc.close();
	}
	
}
