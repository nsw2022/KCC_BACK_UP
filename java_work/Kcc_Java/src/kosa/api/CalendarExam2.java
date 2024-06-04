package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam2 {

	public static void main(String[] args) {
		// 2024 년 6월 달력 만들기
		// <2024년 6월>
		// 일 월 화 수 목 금 토
		// 1
		// 2 3 4 5 6 7 8

		Calendar gc = Calendar.getInstance();
		int n = gc.getActualMaximum(Calendar.DATE);
		System.out.println(n);
		gc.set(2024, 5, 1);
		System.out.println(Calendar.DATE);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String str = sdf.format(gc.getTime());
		System.out.println(str);
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };

		String defalutWeek = "";

		for (int i = 0; i < week.length; i++) {
			defalutWeek += week[i] + "\t";
		}
		System.out.println(defalutWeek);

		// 그달의 1일 의 요일을 구함 거기서 부터 시작
		// 형태는 일 월 화 수 목 금 토
		//
		SimpleDateFormat sdf2 = new SimpleDateFormat("d");
		String str2 = sdf2.format(gc.getTime());
//		System.out.println(str2);
//		System.out.println(week[gc.get(Calendar.DAY_OF_WEEK)-1]);
		gc.get(Calendar.DATE);
		for (int i = 0; i < week.length; i++) {
			if (week[i]==week[gc.get(Calendar.DAY_OF_WEEK)-1]) {
				for (int j = 0; j < i; j++) {
					System.out.printf("\t");
				}
				System.out.println(str2);
			}
			
		}
		for (int i = 1; i < gc.getActualMaximum(Calendar.DATE); i++) {
			System.out.print(i+1+"\t");
			if (i%7==0) {
				System.out.println();
			}
			
		}

	}

}
