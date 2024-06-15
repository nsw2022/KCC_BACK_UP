package hrMiniTest.io;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public interface Console {
	// �ܼ��� �ܼ�â�� �ޱ����Ѱ� �� ��Ƴ���
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 	info(Object obj): ��ü ������ �ֿܼ� ����մϴ�.
		err(String msg): ���� �޽����� �ֿܼ� ����մϴ�.
		inStr(String msg, int len): ���ڿ� �Է��� �޾Ƽ� ���� �� ��ȯ�մϴ�.
		inNum(String msg): ���� �Է��� �޾Ƽ� ���� �� ��ȯ�մϴ�.
		inDate(String msg): ��¥ �Է��� �޾Ƽ� ���� �� ��ȯ�մϴ�. 
	  
	 */
	
	static void info(Object obj) {
		System.out.println(obj);
	}
	
	static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	static String inStr(String msg, int len) {
		String input = "";
		boolean isGood = false;
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-z��-�R0-0]{1," + len+"}");
			if(!isGood) Console.err(len+"�� ������ ���ڰ� �ƴմϴ�.");
		} while (!isGood);
		return input;
	}
	
	static int inNum(String msg) {
		String input = "";
		boolean isGood = false;
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[0-9]+");
			if(!isGood) Console.err("0 �̻��� ������ �ƴմϴ�.");
		} while (!isGood);
		return Integer.parseInt(input);
	}
	
	static LocalDate inDate(String msg) {
		String input = "";
		LocalDate date = null;
		do {
			Console.inMsg(msg);
			input = sc.nextLine().trim();
			if (input.length()>0) {
				try {
					date = LocalDate.parse(input, DateTimeFormatter.ISO_DATE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(date == null) Console.err("YYYY-MM-DD ������ ���� ��¥�� �ƴմϴ�.");
		} while (date == null);
		return date;
	}
}
