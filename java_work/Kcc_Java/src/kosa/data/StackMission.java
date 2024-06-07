package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// Ű����� ���� ���м����� �Է�
		// ((2+3)+10) => ��ȣ�� ��ġ/����ġ
		// System.out.println((int)'(');//40
		// System.out.println((int)')');//41
//		System.out.println("������ �־�� �ΰ�");
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
//			System.out.println("�ΰ� �Ǽ��� �� �˾Ҵ�");
//		}else {
//			System.out.println("�� �� ��ġ�� �����Ѵ�");
//			// System.out.println("����� : " + Integer.parseInt(result); // pop�̶� ��ȣ�� �������� ����
//		}

		// ����� ����
		System.out.println("������ �Է����ּ���");
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
				System.out.println("��ȣ�� ��ġ �մϴ�.");
			} else {
				System.out.println("��ȣ�� ����ġ �մϴ�.");
			}
		} catch (Exception e) {
			System.out.println("��ȣ�� ����ġ �մϴ�.");
		}

	}

}
