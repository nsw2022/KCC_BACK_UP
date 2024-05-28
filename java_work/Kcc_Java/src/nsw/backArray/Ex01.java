package nsw.backArray;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		문제1
//		길이가 5인 int형 배열을 선언해서 프로그램 사용자로부터 총 5개의 정수를 입력 받자.
//		그리고 입력이 끝나면 다음의 내용을 출력하도록 예제를 작성해보자.
//		  - 입력된 정수 중에서 최대값
//		  - 입력된 정수 중에서 최소값
//		  - 입력된 정수의 총 합
//
//		단, 반드시 입력을 완료한 상태에서 '최대값'과 '최소값' 그리고 '총합'을 계산해야 한다.
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
	}

}
