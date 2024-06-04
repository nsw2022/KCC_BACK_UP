package kosa.api.question;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//System.out.println((int)'0');//48
		//System.out.println((int)'9');//57
		//System.out.println((int)'z');//122
		//System.out.println((int)'Z');//90
//		System.out.println((int)'a'=="a".charAt(0));
		System.out.println(solution(str));
	}

	private static char[] solution(String str) {
		// 0 1 2 3 4 5 6 7 8 9
		// a # b ! G E * T @ S
		
		// 계산하기 귀찮다 반복문 두변 돌려서 아스키 범위 안이면 인덱스 기억하고 반대로 ㄱㄱ 
		// S # b ! T E * G @ a
	
		
//		for (int i = 0; i < str.length(); i++) {
//			if((str.charAt(i) >= 48 && str.charAt(i) <= 57)
//					||(str.charAt(i) >= 65 && str.charAt(i) <= 90)
//					||(str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
//				arr[i]=(char) i;
//			}
//		}// 이럼 숫자로나와서힘듬
		char[] arr = str.toCharArray();
		char[] temp = new char[str.length()];
		int count = 0;
		for (char c : str.toCharArray()) {
			if( (c>='a' && c<='z') || (c>='A'&&c<='Z') || (c>='0' && c<='9')) {
				temp[count++] = c;
			}
		}
		System.out.println(Arrays.toString(temp));
		String result = "";
		count--;
		for (int i = 0; i < str.toCharArray().length; i++) {
			if( (arr[i]>='a' && arr[i]<='z') || (arr[i]>='A'&& arr[i]<='Z') || (arr[i]>='0' && arr[i]<='9')) {
				arr[i]=temp[count--];
			}
		}
		System.out.println(result);
	
		return arr;
		
	}

}
