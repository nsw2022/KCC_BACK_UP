package kosa.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class DataExam {
	
	public static void main(String[] args) {
		// 키보드 => 날짜 입력 2014/06/04
		// 입사일을 입력 받아 => 몇년 몇개월 재직 중
		
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.of(2021,1,1,0,0,0);
		System.out.println(startDateTime.format(sdf));
		LocalDateTime endDataTime = LocalDateTime.of(2022,1,1,0,0,0);
		System.out.println(endDataTime.format(sdf));
		
		long remainDay = startDateTime.until(endDataTime, ChronoUnit.DAYS);
		System.out.println(remainDay);
		System.out.println("===========================================");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(soluntion(str));
		sc.close();
	}

	private static long soluntion(String str) {
		String arr[] = str.split("/");
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		LocalDateTime startDateTime = LocalDateTime.of(
				Integer.parseInt(arr[0]),
				Integer.parseInt(arr[1])+1,
				Integer.parseInt(arr[2]),
				0,0,0
				);
		System.out.println(startDateTime.format(sdf));
		LocalDateTime date = LocalDateTime.now();
		LocalDateTime endDataTime = LocalDateTime.of(
				date.getYear(),
				date.getMonth(),
				date.getDayOfMonth(),0,0,0);
		
		long remainDay = startDateTime.until(endDataTime, ChronoUnit.DAYS);
		return remainDay;
	}

}
