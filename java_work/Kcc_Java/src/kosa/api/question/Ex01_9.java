package kosa.api.question;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//        char[] test = {'1'};
//        System.out.println(Integer.parseInt(String.valueOf(test[0])));

		System.out.print("���ڿ��� �Է��ϼ���: ");
		String input = scanner.nextLine();

		int maxNumber = findMaxNumber(input);
		System.out.println("�ִ� ����: " + maxNumber);
	}

	public static int findMaxNumber(String input) {
		char[] arr = input.toCharArray();
		char[] aar2 = new char[input.length()];
		for (int i = 0; i < aar2.length; i++) {
			if (Character.isDigit(arr[i])) {aar2[i]=arr[i];};
		}
		System.out.println(Arrays.toString(aar2));
		Arrays.sort(aar2);
		return 0;
	}
}
