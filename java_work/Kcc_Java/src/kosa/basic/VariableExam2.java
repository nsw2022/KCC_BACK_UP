package kosa.basic;

import java.util.Scanner;

public class VariableExam2 {
	public static void main(String[] args) {
		// Ű����� ���� ������ �Է�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
//		int num = Integer.parseInt(sc.nextLine());
		//int num = sc.nextInt();// 10 + enter�� �������ڿ� �Է� ����
		//sc.nextLine();
	
//		System.out.print("���ڿ� �Է�: ");
//		String str = sc.nextLine();
//		
//		System.out.println(num);
//		System.out.println(str);
	
		// int <==> char
		char ch ='A';
		//System.out.println( (int)ch );
		
		for (int i = 65; i < 91; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		// int<==>String
		String num2 = "100";
		int num3 = Integer.parseInt(num2);
		System.out.println(num3+100);
		
		int num4 = 10;
		String num5 = String.valueOf(num4);
		String num6 = num4 + "";
		
		String str = 7 + "7" + 7;
		System.out.println(str);
		
		sc.close();
	
	}
}




