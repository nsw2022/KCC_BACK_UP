package kosa.basic;

import java.util.Scanner;



public class LoopExam01 {

	public static void main(String[] args) {
		// while : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수직방향
		// 1~10까지 합
//		int sum = 0;
//		int i=1;
//		while (i==10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1~10");

		// 퀴즈 구구단 7단 출력
		// 7 * 1 = 7
//		int i = 1;
//		while(i<=9) {
//			System.out.printf("7 * %d = %d\n",i,i*7); 
//			i++;
//		}
//		
//		// for 문 : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수평바얗ㅇ
//		int sum = 0;
//		for (int j = 0; j < 10; j++) {
//			sum += j;
//		}
//		System.out.println(sum);

		// 퀴즈 1~100까지 2의 배수와 3의 배수가 아닌것만 출력
//		for (int i = 1; i <= 100; i++) {
//
//			if (i % 2 != 0 && i % 3 != 0) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println();
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0 || i % 3 == 0) {
//				continue;
//			}
//			System.out.print(i + " ");
//		}

		// do~while : 명령문을 1번은 시작해야해서
		// 유효성 검증, 키보드로 부터 숫자를 입력받는것이 있어
		// 음수를 입력하면 새로 입력 받도록 하기 위함

		Scanner sc = new Scanner(System.in);
//		int n=0;
//		do {
//			System.out.print("입력: ");
//			n=sc.nextInt();
//		} while (n<0);
//		System.out.println("입력 결과: "+n);

		// 2개의 정수를 입력받아 b-a 결과를 출력 하자.
		// b>a 되도록 입력 =>
//		int a,b=0;
//		
//		do {
//			System.out.print("a입력: ");
//			a = sc.nextInt();
//			System.out.print("b입력: ");
//			b=sc.nextInt();
//		} while (b>a);
//		System.out.println("입력 결과: " + (b-a));

		// 퀴즈3> 임의의 난수 3개 받아서 서로 중첩 되지 않고 출력
//		int n = (int) (Math.random() * 9) + 1;
//		System.out.println(n);
		
//		int a,b,c;
//		do {
//			a=(int) (Math.random() * 9) + 1;
//			b=(int) (Math.random() * 9) + 1;
//			c=(int) (Math.random() * 9) + 1;
//		} while (a==b || a==c || b==c);
//		
//		System.out.println("a="+a+ " b="+b+ " c="+c);
		
		sc.close();
	}

}
