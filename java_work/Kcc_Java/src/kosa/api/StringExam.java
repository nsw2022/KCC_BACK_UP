package kosa.api;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		//1. String ��ü ���� ����� ������
		String str = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");
		
		if (str==str2) {
			System.out.println("����?");
		}else {
			System.out.println("�ٸ���");
		}
		
		//2. String Ŭ���� �Һ��� - �޼��带 ���ؼ� ��ȭ�� �ִ��� ��ü�� ���� ������ ����
		//   StringBuffefr, StringBuilder (������)
		String str4=str.concat("DEF");
		System.out.println(str);//ABC
		System.out.println(str4);
		
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");
		System.out.println(sb);
		
		// ������(+) ���� ����
		String sql = "select * from board ";
		int num = 10;
		
		if (num==10) {
			sql += "where num = 10;";
		}
		
		System.out.println(sql);
		
		// �ش� ���ڿ��� ��ġ�� �ľ� => indexOf("���ڿ�") => �ش� ���ڿ��� �ε���, ������ -1
		System.out.println(sql.indexOf("board"));
		for (int i = 14; i < 20; i++) {
			System.out.print(sql.charAt(i));			
		}
		System.out.println();
		System.out.println(sql.indexOf("$"));
		
		// ���ڿ� ����
		System.out.println(sql.length());
		
		for (int i = 0; i < sql.length(); i++) {
			System.out.print(sql.charAt(i));
		}
		System.out.println();
		
		// ����� �κ� ���� : subString(5), subString(5,10)
		// ����
		System.out.println(sql.substring(sql.indexOf("board"),sql.indexOf("board")+5));
		
		//���� filename 
		String fileName = "kosa.jpg";
		String head = "";
		String pattern = "";
//		String[] arr = fileName.split("\\.");
//		System.out.println(Arrays.toString(arr));
//		head=arr[0];
//		pattern = arr[1];
		head = fileName.substring(0,fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".")+1);
		System.out.println(head + " : " + pattern);
		
		String id = "kosa";
		String m_id = "Kosa ";
		// ���� �ϳ��� �빮�ڴ� �ҹ��ڴ� �����ָ��
		// equalsIgnoreCase �̰� �� �˰���
		if (id.equalsIgnoreCase(m_id.trim())) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		// ���ڿ� ==>String[]��ȯ
		String fruits = "���,����,����,��";
		String arr[] = fruits.split(",");
		System.out.println(Arrays.toString(arr));
		
		// ���ڿ� ==> char[] ��ȯ
		String str5 = "abcdef";
		char[] arr2 = str5.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		// ���ڿ� ==> byte[] ��ȯ
		String str6 = "abcdef";
		byte arr3[] = str6.getBytes();
		System.out.println(Arrays.toString(arr3));
		
		// ���ڿ� <==> ������
		String str7 = "100";
		int num2 = Integer.parseInt(str7);
		System.out.println(num2);
		
		int num3 = 10;
		// String str8 = String.valueOf(num3);
		String str8 = 10 + "";
		System.out.println(str8);
		
		
	}
	
}
