package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// 키보드로 부터 수학수식을 입력
		// ((2+3)+10) => 괄호가 일치/불일치
		// System.out.println((int)'(');//40
		// System.out.println((int)')');//41
//		System.out.println("수식을 넣어라 인간");
//		Scanner sc = new Scanner(System.in);
//		Stack<Character> stack = new Stack<Character>();
//		String userInput = sc.nextLine();
//		
//		for (char c : userInput.toCharArray()) {
//			stack.push(c);
//		}
//		
//		int leftCover = 0;
//		int rightCover = 0;
//		char flag = 0;
//		String result = "";
//		while (!stack.isEmpty()) {
//			flag=stack.pop();
//			if (flag==40) {
//				leftCover++;
//			}
//			if (flag==41) {
//				rightCover++;
//			}
//			result += flag;
//		}
//		
//		System.out.println(leftCover);
//		System.out.println(rightCover);
//		
//		if (leftCover!=rightCover) {
//			System.out.println("인간 실수할 줄 알았다");
//		}else {
//			System.out.println("올 ㅋ 일치다 축하한다");
//			// System.out.println("결과다 : " + Integer.parseInt(result); // pop이라 괄호가 뒤집어짐 엌ㅋ
//		}

		// 강사님 버전
		System.out.println("수식을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		String str = sc.nextLine();
		try {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch == '(') {
					stack.push(ch + "");
				} else if (ch == ')') {
					stack.pop();
				}
			}
 
			if (stack.isEmpty()) {
				System.out.println("괄호가 일치 합니다.");
			} else {
				System.out.println("괄호가 불일치 합니다.");
			}
		} catch (Exception e) {
			System.out.println("괄호가 불일치 합니다.");
		}

	}

}
