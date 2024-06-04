package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarExam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(soultion(str));

	}

	private static String soultion(String str) {
		Calendar gc = Calendar.getInstance();
		String arr[] = str.split("/");
		gc.set(Integer.parseInt(arr[0]),
				Integer.parseInt(arr[1])-1, 
				1 );
		int n = gc.getActualMaximum(Calendar.DATE);
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
		String defalutWeek = "";

		for (int i = 0; i < week.length; i++) {
			defalutWeek += week[i] + "\t";
		}
		System.out.println("<"+arr[0]+"년 "+arr[1]+"월 달력 >" );
		System.out.println(defalutWeek);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("d");
		String str2 = sdf2.format(gc.getTime());
//		System.out.println(str2);
//		System.out.println(week[gc.get(Calendar.DAY_OF_WEEK)-1]);
		gc.get(Calendar.DATE);
//		System.out.println((week[gc.get(Calendar.DAY_OF_WEEK)-1]=="토"));
		int test = 0;
		for (int i = 0; i < week.length; i++) {
			if (week[i]==week[gc.get(Calendar.DAY_OF_WEEK)-1]) {
				for (int j = 0; j < i; j++) {
					System.out.printf("\t");
					test = j;
				}
				System.out.println(str2);
			}
			
		}
		System.out.println("나는 test"+  test);
		for (int i = 1; i < gc.getActualMaximum(Calendar.DATE); i++) {
			System.out.print(i+1+"\t");
			gc.set(Integer.parseInt(arr[0]),Integer.parseInt(arr[1])-1, i+1);
			
			if (test+2==gc.get(Calendar.DAY_OF_WEEK)) {
				System.out.println();
			}
		}
		
		return "";
	}

}
