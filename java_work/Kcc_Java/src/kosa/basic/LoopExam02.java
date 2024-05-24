package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		// 중첩 for 문
		// 전체 구구단 출력
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i +" *"
//						+ " " + j + " = " +i*j);
//			}
//		}

		// 퀴즈>4x + 5y = 60 => x와 y의 모든 해를 구해주세요
		outerLabel: for (int x = 0; x <= 15; x++) {
			for (int y = 0; y <= 12; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("x=" + x + " y=" + y);
					break outerLabel;
				}
			}
		}

		// 퀴즈>
		// *
		// **
		// ***
		// ****
		// *****
	
		// for 시작값; 끝값; 증감연산
		

		for (int i = 0; i < 6; i++) { 
			for (int j = 0; j < i ; j++) {
				//System.out.print(s+" 나는"+i);
				System.out.print("*");
			}	
			System.out.println();
		}
		
		System.out.println();
		for (int i = 6; i > 0; i--) { 
			for (int j = i; j > 0 ; j--) {

				System.out.print("*");
			}	
			System.out.println();
		}
		
	

	}

}
