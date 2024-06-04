package kosa.api;

import java.util.Calendar;

public class CalndarPr {
	public static void main(String[] args) {
		Calendar gc = Calendar.getInstance();
		int n = gc.getActualMaximum(Calendar.DATE);
		gc.set(2024, 5,1);
		int week = gc.get(Calendar.DAY_OF_WEEK);//1~7
		
		System.out.println("<2024년 6월>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= n; i++) {
			System.out.print(i+"\t");
			if ((week+i-1)%7==0) {
				System.out.println();
			}
		}
		
	}
}
