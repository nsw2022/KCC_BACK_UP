package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		// ��ø for ��
		// ��ü ������ ���
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i +" *"
//						+ " " + j + " = " +i*j);
//			}
//		}

		// ����>4x + 5y = 60 => x�� y�� ��� �ظ� �����ּ���
		outerLabel: for (int x = 0; x <= 15; x++) {
			for (int y = 0; y <= 12; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("x=" + x + " y=" + y);
					break outerLabel;
				}
			}
		}

		// ����>
		// *
		// **
		// ***
		// ****
		// *****
	
		// for ���۰�; ����; ��������
		

		for (int i = 0; i < 6; i++) { 
			for (int j = 0; j < i ; j++) {
				//System.out.print(s+" ����"+i);
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
