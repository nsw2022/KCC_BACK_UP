package kosa.game;

import java.util.Scanner;

public class TeacherMain {
	public static void main(String[] args) {
		TeacherBaseBall tb = new TeacherBaseBall();
		Scanner sc = new Scanner(System.in);
		int strike = 0;
		int ball = 0;
		int count = 0;
		int[] input = new int[3];
		
		do {
			System.out.println("���ӵ���");
			System.out.print("���� �Է�(3�ڸ�): ");
			for (int i = 0; i < 3; i++) {
				input[i] = sc.nextInt();
			}
			
			strike = tb.countStrike(input);
			ball = tb.countBall(input);
			System.out.println(strike + "S "+ball+"B");
			count++;
		} while (strike!=3);
		System.out.println(count+"��° ����");
		sc.close();
	}
}


