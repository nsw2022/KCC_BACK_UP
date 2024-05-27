package kcc.work;

public class ExArray {

	public static void main(String[] args) {
		int number = 5;

		// 1-1
		System.out.println("1-1.");
		for (int i = 1; i <= 25; i++) {
			System.out.printf("%3d", i);
			if (i % number == 0) {
				System.out.println();
			}
		}
		System.out.println();

		
		// 1-2
		/*
		 * ó���ݺ��� ó���� : 25-5*0=25 �ι�° �ݺ��� 1�� ������ 5�� �ι�°�� 25-5*1=20 ... ��ġ ����°�� 25-5*2=15
		 */
		int startNumber = 1;// ���º���
		System.out.println("1-2.");
		for (int i = 0; i < number; i++) {
			// �� ������ ���� ���� ���
			startNumber = number * number - number * i;
			// �� ������ ���ڸ� ���
			for (int j = 0; j < number; j++) {
				System.out.printf("%3d ", startNumber + j);
			}
			System.out.println();
		}

		System.out.println();
		// 1-3
		/*
		 * 1���� 2������ �ݺ���Ű�� 1���ڸ��� 9�� ����
		 */
		System.out.println("1-3.");
		for (int i = 1; i <= 49; i += 2) {
			System.out.printf("%3d", i);
			if (i % (number * 2) == 9) {
				System.out.println();
			}
		}
		System.out.println();

		// 1-4
		/*
		 * ó���ݺ��� 0~5���� �ݺ� �ι�° �ݺ����� ó����Һ��� ���������� �ݺ�
		 */
		System.out.print("1-4.");
		for (int i = 0; i <= number; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf("%3d", j + 1);

			}
			System.out.println();
		}
		System.out.println();
		
		// 1-5
		/*
		 	��ݹ����� ����� �������
		 	���º����� �߰��Ͽ� �������� ���ذ��� ����
		 */
		System.out.println("1-5.");
		int one_five = 1; // ���� ���ڸ� 1�� ����
		for (int i = 1; i <= number; i++) { // i�� 1���� �����ϵ��� ����
			for (int j = 0; j < i; j++) {
				System.out.printf("%3d", one_five++); // ���ڸ� ���� ����ϰ� ������Ŵ
			}
			System.out.println();
		}
		System.out.println();
		
		//1-6
		/*
		  	ù �ݺ��� 1~5���
		  		�ι�° �ݺ��� ù��° ��Ҹ�ŭ �����ϰ� ���ᰪ�� ù��° ���۰��� ������
		  		�̷��� ������ ���·� �ȳ�����
		  		1 2 3 4 5 -0
		  		2 3 4 5   -1
		  		3 4 5	  -2
		  		4 5		  -3
		  		5		  -4
		  		�� ����
		  		���º��� �߰��Ͽ� ���������� ������
		  		�ι�° ��Ұ� ���������� ���̳ʽ��� �Ͽ� ������ ���·� ���
		 */
		System.out.println("1-6.");
		int one_minors = 0;
		for (int i = 1; i <=number ; i++) {
			for (int j = i; j <= number; j++) {
				System.out.printf(" %3d",j+one_minors);	//-���ϸ� �ȵ� -(-one_minors) �ϸ� +�� ��			
			}
			one_minors--;
			System.out.println();
		}
		System.out.println();
		
		//1-7
		/*
			ó���ݺ��� �۽����� 5�����ؼ� 5��(0,1,2,3,4)�� �ϳ��� �ٿ����� �ݺ�
				�ι�° �ݺ��� ù��° ���۰� ���� ���������� �ݺ�
					�ڸ����� ��Ҹ� ���ؼ� ���
		*/
		System.out.println("1-7.");
		int one = 1;
		for (int i = number; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.printf("%3d ",one++);
			}
			System.out.println(); // �� ���� ����� �� �ٹٲ�
		}
		System.out.println();
		
		
		//1-8
		System.out.println("1-8.");
		one=1;
		for (int i = 1; i <= number; i++) {
			for (int j = 0; j <= number; j++) {
				System.out.printf("%3d",j+one);
			}
			one++;
			System.out.println();
		}
		System.out.println();
		
		//1-9
		/*
		 	ù��° �ݺ��� 0~4���� �ݺ�
		 		�ι�° �ݺ����� 0~4���� �ݺ�
		 			(i + j) % number+ 1) ���� ����
		 			i+j�� 5�� ���������� �״�γ����� �̿� ���� +1���Ͽ� ���ǿ� ���� 1���� ����
		 */
		System.out.println("1-9");
		for (int i = 0; i < number; i++) {
			// �� ���ڸ� ����ϰ� ���
			for (int j = 0; j < number; j++) {
//				System.out.print("i=" + i + " ");
//				System.out.print(j + " ");

				 System.out.printf("%3d",(i + j) % number+ 1);
			}
			System.out.println(); // �ٹٲ�
		}
		
		//1-10
		/*
		 1-5�� ����� �������
		 ���� 3���� ������ �ְ� �̷�����������...
		 ��������� ������ ���� �Ф� 
		 */
		System.out.println("1-10.");
		one=1;
		for (int i = 1; i <= number; i++) {
			for (int k = number; k >i; k--) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.printf("%2d",one++);
			}
			System.out.println();
		}
		System.out.println();
		
		
		//2-1
		System.out.println("2-1");
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//2-2
		System.out.println("2.2");
		for (int i = 1; i <= number; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//2-3
		System.out.println("2-3");
		for (int i = 1; i <= number; i++) {
			for (int k = number; k >i ; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//2-4
		System.out.println("2-4");
		for (int i = 1; i <= 10; i+=2) {
			for (int k = 8; k > i; k-=2) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//2-5
		// �ݺ��� �ϳ����غ����ߴµ�.. �߾ȵ�..
		System.out.println("2-5");

		for (int i = 1; i <= 8; i+=2) {
			for (int k = 8; k > i; k-=2) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		for (int i = 9; i > 0; i-=2) {
			for (int k = 9; k > i; k-=2) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//2-6
		System.out.println("2-6");
		for (int i = 1; i <= 8; i += 2) {
            for (int k = 8; k > i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print(" "); // ���� �߰�
            for (int k = 8; k > i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 9; i > 0; i -= 2) {
            for (int k = 9; k > i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print(" "); // ���� �߰�
            for (int k = 9; k > i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
	
		
	}

}
