package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		//1. 배열 선언, 생성 분리
		int arr[];//배열선언
		arr = new int[5];// 배열 생성(메모리 할당)
		
		//2. 배열 선언, 생성 함께
		int arr2[] = new int[5];
		arr2[0]=10;
		arr2[1]=20;
				
		//3. 배열선언, 생성, 초기화와 함께
		int arr3[]= {1,2,3,4,5};
		
		// 배열에 있는 내용 전체 출력 for
		for(int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
		// 향상 포문
		for (int i : arr3) {
			System.out.println(i+", ");
		}
		
		System.out.println();
		
		// 배열 사용 방법 메뉴얼
		//1. 배열에 사용될 데이터 타입을 결정한다.
		//2. 배열의 크기를 결정 ※ 배열의 크기를 줄이거나 늘릴수 없음 => ArryaIndexOfBoundsException 발생
		//3. 배열 생성 방법 => 1, 2, 3	
		//4. 어떻게 초기화 할 것인지 => 직접 인덱스 접근, for문, 생성과 초기화
		//5. 배열의 데이터를 어떻게 출력 => for문, 향상된 for, 직접 index접근
		
		
		// 퀴즈>키보드로부터 문자열을 입력받아 배열에 추가한 후 전체를 출력하자
		// "q" 입력할때까지 입력
		/*
		String vocab[] = new String[5] ;
		Scanner sc = new Scanner(System.in);
		String userinput =""; ;
		for (int i=0;i<vocab.length;i++) {
			System.out.print(">입력 : ");
			userinput=sc.nextLine();
			if (userinput.equals("q")) {
				System.out.println("전체값");			
				break;
			}
			vocab[i]=userinput;
		}
	
		for (String str : vocab) {
			System.out.println(str);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		String sArr[] = new String[10];
		int count = 0;
		
		while(true) {
			System.out.print(">입력 : ");
			String str = sc.nextLine();
			if (str.equals("q")) break;
			sArr[count++]=str;
		}
		
		for (int i = 0; i < count; i++) {
			System.out.print(sArr[i]+", ");
		}
		
		
	}

}
