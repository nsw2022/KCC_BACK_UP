package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class CalendarExam {
	
	public static void main(String[] args) {
		//	GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
		System.out.println(gc);
		
		String now = gc.get(Calendar.YEAR) + "년 "
				   + (gc.get(Calendar.MONTH)+1) + "월 "
				   + gc.get(Calendar.DATE)+"일 "
				   + gc.get(Calendar.HOUR)+"시 "
				   + gc.get(Calendar.MINUTE)+"분";
		System.out.println("현재시간: "+now);
		
		gc.add(Calendar.DATE, 100);
		
		String future = gc.get(Calendar.YEAR) + "년 "
				   + (gc.get(Calendar.MONTH)+1) + "월 "
				   + gc.get(Calendar.DATE)+"일 "
				   + gc.get(Calendar.HOUR)+"시 "
				   + gc.get(Calendar.MINUTE)+"분";
		System.out.println("현재시간: "+future);
		
		gc.set(2022,5,4);
		gc.add(Calendar.DATE, 1_000);
		
		// 월이 대문자 M 인 이유는 뒤에 시분초가 분이 hh:mm:ss  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String str = sdf.format(gc.getTime());
		System.out.println(str);
		System.out.println("-----------------s");
		// 퀴즈 2024 ~ 2030년 까지 자신의 생일이 무슨 요일?
		// Calendar.DAY_OF_WEEK => 요일 -> 일(1) 월(2) 화 수 목 금 토
		gc.set(2024,1,1);
		int testYear = 2024;
		for (int i = 0; i <7 ; i++) {
			gc.set(testYear,2,3);
			String str2 = sdf.format(gc.getTime());
			System.out.println(str2);
			switch (gc.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				System.out.println("일");
				break;
			case 2:
				System.out.println("월");
				break;
			case 3:
				System.out.println("화");
				break;
			case 4:
				System.out.println("수");
				break;
			case 5:
				System.out.println("목");
				break;
			case 6:
				System.out.println("금");
				break;
			case 7:
				System.out.println("토");
				break;

			default:
				break;
			}
			System.out.println();
			testYear++;
		}
		System.out.println("---------Teacher Code--------");
		
		char week[]= {'일','월','화','수','목','금','초'};
		
		for (int i = 2024; i <= 2030; i++) {
			gc.set(i, 5,4);//6월 4일
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i+"년의 생일은 "+c+"요일 입니다");
		}
		
		
	}

}
