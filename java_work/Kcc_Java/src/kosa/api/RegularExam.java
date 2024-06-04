package kosa.api;

import java.util.Scanner;

public class RegularExam {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ÀÔ·Â: ");
		String str = sc.nextLine();
		
		// abc ¹®ÀÚ¸¦ Æ÷ÇÔ ¿©ºÎ Ã¼Å©
//		if (str.matches(".*abc.*")) {
//			System.out.println("¸ÅÄª");
//		}else {
//			System.out.println("ºñ¸ÅÄª");
//		}
		
		// ¼ıÀÚ¸¸ 3ÀÚ¸® À¯¹« ÆÇ´Ü ==> \\d
//		if (str.matches("\\d{3}")) {
//			System.out.println("¸ÅÄª");
//		}else {
//			System.out.println("ºñ¸ÅÄª");
//		}
		
		// ¾ËÆÄºª ¼ıÀÚ¸¸ 5ÀÚ¸® ÀÌ»ó
		// [\\w]{5,}
//		if (str.matches("\\w{5}.*")) {
//			System.out.println("¸ÅÄª");
//		}else {
//			System.out.println("ºñ¸ÅÄª");
//		}
		
		// ÇÑ±Û 3ÀÚ¸®~4ÀÚ¸®
//		if (str.matches("[°¡-ÆR]{3,5}")) {
//			System.out.println("¸ÅÄª");
//		}else {
//			System.out.println("ºñ¸ÅÄª");
//		}
		
		// ÀÌ¸ŞÀÏ °ËÁõ
		// tmddn3410@naver.com
		// 123abc@naver.com =>X
		// 123abcnaver.com =>X
		// 123abc@naver.naver =>X
		// ¿µ¹®ÀÚ·Î¸¸½ÃÀÛ @ ¿µ¹®ÀÚ . ÀÌÈÄ´Â 3ÀÚ¸®
		// ^[\\D]\\w+@\\w+\\.\\w{2,3}
//		if (str.matches("[a-z]+\\w+@.[a-z]{1,4}[.][a-z]{3}")) {
//			System.out.println("¸ÅÄª");
//		}else {
//			System.out.println("ºñ¸ÅÄª");
//		}
		
		sc.close();
	}

}
