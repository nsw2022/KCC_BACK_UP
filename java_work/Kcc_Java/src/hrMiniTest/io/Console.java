package hrMiniTest.io;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public interface Console {
	// ´Ü¼øÈ÷ ÄÜ¼ÖÃ¢¿¡ ¹Þ±âÀ§ÇÑ°Å ´Ù ¸ð¾Æ³ëÀ½
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 	info(Object obj): °´Ã¼ Á¤º¸¸¦ ÄÜ¼Ö¿¡ Ãâ·ÂÇÕ´Ï´Ù.
		err(String msg): ¿À·ù ¸Þ½ÃÁö¸¦ ÄÜ¼Ö¿¡ Ãâ·ÂÇÕ´Ï´Ù.
		inStr(String msg, int len): ¹®ÀÚ¿­ ÀÔ·ÂÀ» ¹Þ¾Æ¼­ °ËÁõ ÈÄ ¹ÝÈ¯ÇÕ´Ï´Ù.
		inNum(String msg): ¼ýÀÚ ÀÔ·ÂÀ» ¹Þ¾Æ¼­ °ËÁõ ÈÄ ¹ÝÈ¯ÇÕ´Ï´Ù.
		inDate(String msg): ³¯Â¥ ÀÔ·ÂÀ» ¹Þ¾Æ¼­ °ËÁõ ÈÄ ¹ÝÈ¯ÇÕ´Ï´Ù. 
	  
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
			isGood = input.matches("[a-zA-z°¡-ÆR0-0]{1," + len+"}");
			if(!isGood) Console.err(len+"ÀÚ ÀÌÇÏÀÇ ¹®ÀÚ°¡ ¾Æ´Õ´Ï´Ù.");
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
			if(!isGood) Console.err("0 ÀÌ»óÀÇ Á¤¼ö°¡ ¾Æ´Õ´Ï´Ù.");
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
			if(date == null) Console.err("YYYY-MM-DD Çü½ÄÀÇ ½ÇÁ¦ ³¯Â¥°¡ ¾Æ´Õ´Ï´Ù.");
		} while (date == null);
		return date;
	}
}
