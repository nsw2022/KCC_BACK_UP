package kosa.game;

import java.util.Scanner;

public class MakeNumberGame {
	private int[] rndNum = new int[3];
	private int[] userNum = new int[3];
	private int ball, starke, count;

	Scanner sc;

	public MakeNumberGame() {

		do {
			rndNum[0] = (int) (Math.random() * 9) + 1;
			rndNum[1] = (int) (Math.random() * 9) + 1;
			rndNum[2] = (int) (Math.random() * 9) + 1;
		} while (rndNum[0] == rndNum[1] || rndNum[0] == rndNum[2] || rndNum[1] == rndNum[2]);
		sc = new Scanner(System.in);

	}

	public void goGame() {
		while (true) {
			System.out.print(rndNum[0] + " " + rndNum[1] + " " + rndNum[2] + "\n");
			System.out.print("숫자를 입력해주세요");
			for (int i = 0; i < rndNum.length; i++) {
				userNum[i] = sc.nextInt();
			}
			checkNum();
			if (rndNum[0] == userNum[0] && rndNum[1] == userNum[1] && rndNum[2] == userNum[2]) {
				System.out.println("결과 : " + count++);
				return;
			}
		}
	}

	public void checkNum() {
		starke = 0;
		ball = 0;
		if (rndNum[0] == userNum[0]) {
			starke++;

		} else if (rndNum[0] == userNum[1] || rndNum[0] == userNum[2]) {
			ball++;

		}
		if (rndNum[1] == userNum[1]) {
			starke++;

		} else if (rndNum[1] == userNum[0] || rndNum[1] == userNum[2]) {
			ball++;

		}
		if (rndNum[2] == userNum[2]) {
			starke++;

		} else if (rndNum[2] == userNum[0] || rndNum[2] == userNum[1]) {
			ball++;

		}
		count++;
		System.out.printf("%dS %dB\n", starke, ball);

	}

}
