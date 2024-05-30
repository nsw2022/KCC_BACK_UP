package kosa.game;

import java.util.Arrays;

public class TeacherBaseBall {
	// 난수를 생성(중복 X)
	private int hidden [];
	
	
	public TeacherBaseBall() {
		hidden = new int[3];
		
		hidden[0] = (int)(Math.random() * 9) + 1;
		do {
			hidden[1] = (int)(Math.random() * 9) + 1;
			hidden[0] = (int)(Math.random() * 9) + 1;
		} while (hidden[0]==hidden[1]);
		do {
			hidden[2] = (int)(Math.random() * 9) + 1;
			
		} while (hidden[0]==hidden[2]||hidden[1]==hidden[2]);
		System.out.println("정답 :"+Arrays.toString(hidden));
	}
	
	
	// 스트라이크 체크
	// 123
	// 142
	public int countStrike(int input[]) {
		int strike = 0;
		for (int i = 0; i < 3; i++) if (hidden[i]==input[i]) strike++;
		return strike;
	}
	
	
	// 볼개수 체크
	public int countBall(int input[]) {
		int ball=0;
		for (int i = 0; i < input.length; i++) {
			if (hidden[i] == input[(i+1)%3]) ball++; // i=0 // 1
			if (hidden[i] == input[(i+2)%3]) ball++; // i=0 // 2
		}
		return ball;
	}
	
	
	
}
