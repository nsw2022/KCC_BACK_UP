package kosa.api;

import java.util.Scanner;

public class RegularExam {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է�: ");
		String str = sc.nextLine();
		
		// abc ���ڸ� ���� ���� üũ
//		if (str.matches(".*abc.*")) {
//			System.out.println("��Ī");
//		}else {
//			System.out.println("���Ī");
//		}
		
		// ���ڸ� 3�ڸ� ���� �Ǵ� ==> \\d
//		if (str.matches("\\d{3}")) {
//			System.out.println("��Ī");
//		}else {
//			System.out.println("���Ī");
//		}
		
		// ���ĺ� ���ڸ� 5�ڸ� �̻�
		// [\\w]{5,}
//		if (str.matches("\\w{5}.*")) {
//			System.out.println("��Ī");
//		}else {
//			System.out.println("���Ī");
//		}
		
		// �ѱ� 3�ڸ�~4�ڸ�
//		if (str.matches("[��-�R]{3,5}")) {
//			System.out.println("��Ī");
//		}else {
//			System.out.println("���Ī");
//		}
		
		// �̸��� ����
		// tmddn3410@naver.com
		// 123abc@naver.com =>X
		// 123abcnaver.com =>X
		// 123abc@naver.naver =>X
		// �����ڷθ����� @ ������ . ���Ĵ� 3�ڸ�
		// ^[\\D]\\w+@\\w+\\.\\w{2,3}
//		if (str.matches("[a-z]+\\w+@.[a-z]{1,4}[.][a-z]{3}")) {
//			System.out.println("��Ī");
//		}else {
//			System.out.println("���Ī");
//		}
		
		sc.close();
	}

}
