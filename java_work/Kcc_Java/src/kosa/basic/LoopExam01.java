package kosa.basic;

import java.util.Scanner;



public class LoopExam01 {

	public static void main(String[] args) {
		// while : �ʱ�� -> ���ǽ� -> ��ɹ� -> ������ : ��������
		// 1~10���� ��
//		int sum = 0;
//		int i=1;
//		while (i==10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1~10");

		// ���� ������ 7�� ���
		// 7 * 1 = 7
//		int i = 1;
//		while(i<=9) {
//			System.out.printf("7 * %d = %d\n",i,i*7); 
//			i++;
//		}
//		
//		// for �� : �ʱ�� -> ���ǽ� -> ��ɹ� -> ������ : ����پ餷
//		int sum = 0;
//		for (int j = 0; j < 10; j++) {
//			sum += j;
//		}
//		System.out.println(sum);

		// ���� 1~100���� 2�� ����� 3�� ����� �ƴѰ͸� ���
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

		// do~while : ��ɹ��� 1���� �����ؾ��ؼ�
		// ��ȿ�� ����, Ű����� ���� ���ڸ� �Է¹޴°��� �־�
		// ������ �Է��ϸ� ���� �Է� �޵��� �ϱ� ����

		Scanner sc = new Scanner(System.in);
//		int n=0;
//		do {
//			System.out.print("�Է�: ");
//			n=sc.nextInt();
//		} while (n<0);
//		System.out.println("�Է� ���: "+n);

		// 2���� ������ �Է¹޾� b-a ����� ��� ����.
		// b>a �ǵ��� �Է� =>
//		int a,b=0;
//		
//		do {
//			System.out.print("a�Է�: ");
//			a = sc.nextInt();
//			System.out.print("b�Է�: ");
//			b=sc.nextInt();
//		} while (b>a);
//		System.out.println("�Է� ���: " + (b-a));

		// ����3> ������ ���� 3�� �޾Ƽ� ���� ��ø ���� �ʰ� ���
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
