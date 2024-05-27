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
		 * 처음반복문 처음줄 : 25-5*0=25 두번째 반복문 1씩 더함을 5번 두번째줄 25-5*1=20 ... 동치 세번째줄 25-5*2=15
		 */
		int startNumber = 1;// 상태변수
		System.out.println("1-2.");
		for (int i = 0; i < number; i++) {
			// 각 라인의 시작 숫자 계산
			startNumber = number * number - number * i;
			// 각 라인의 숫자를 출력
			for (int j = 0; j < number; j++) {
				System.out.printf("%3d ", startNumber + j);
			}
			System.out.println();
		}

		System.out.println();
		// 1-3
		/*
		 * 1부터 2씩더해 반복시키고 1의자리가 9면 엔터
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
		 * 처음반복문 0~5까지 반복 두번째 반복문이 처음요소보다 작을때까지 반복
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
		 	방금문제와 상당히 닮아있음
		 	상태변수를 추가하여 증감으로 더해가며 구현
		 */
		System.out.println("1-5.");
		int one_five = 1; // 시작 숫자를 1로 설정
		for (int i = 1; i <= number; i++) { // i를 1부터 시작하도록 변경
			for (int j = 0; j < i; j++) {
				System.out.printf("%3d", one_five++); // 숫자를 먼저 출력하고 증가시킴
			}
			System.out.println();
		}
		System.out.println();
		
		//1-6
		/*
		  	첫 반복문 1~5출력
		  		두번째 반복문 첫번째 요소만큼 시작하고 종료값은 첫번째 시작값과 같을때
		  		이러면 문제의 형태로 안나오고
		  		1 2 3 4 5 -0
		  		2 3 4 5   -1
		  		3 4 5	  -2
		  		4 5		  -3
		  		5		  -4
		  		로 나옴
		  		상태변수 추가하여 누적함으로 빼겠음
		  		두번째 요소가 끝날때마다 마이너스를 하여 문제의 형태로 출력
		 */
		System.out.println("1-6.");
		int one_minors = 0;
		for (int i = 1; i <=number ; i++) {
			for (int j = i; j <= number; j++) {
				System.out.printf(" %3d",j+one_minors);	//-로하면 안됨 -(-one_minors) 하면 +로 됨			
			}
			one_minors--;
			System.out.println();
		}
		System.out.println();
		
		//1-7
		/*
			처음반복문 퍼시작을 5부터해서 5번(0,1,2,3,4)를 하나씩 줄여가며 반복
				두번째 반복문 첫번째 시작값 보다 작을때까지 반복
					자리마다 요소를 더해서 출력
		*/
		System.out.println("1-7.");
		int one = 1;
		for (int i = number; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.printf("%3d ",one++);
			}
			System.out.println(); // 각 줄을 출력한 후 줄바꿈
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
		 	첫번째 반복문 0~4까지 반복
		 		두번째 반복문도 0~4까지 반복
		 			(i + j) % number+ 1) 식을 세움
		 			i+j가 5를 넘지않으면 그대로나옴을 이용 그후 +1을하여 조건에 맞춰 1부터 시작
		 */
		System.out.println("1-9");
		for (int i = 0; i < number; i++) {
			// 각 숫자를 계산하고 출력
			for (int j = 0; j < number; j++) {
//				System.out.print("i=" + i + " ");
//				System.out.print(j + " ");

				 System.out.printf("%3d",(i + j) % number+ 1);
			}
			System.out.println(); // 줄바꿈
		}
		
		//1-10
		/*
		 1-5와 상당히 닮아있음
		 공백 3개로 여백을 주고 미려내려했으나...
		 여백까지는 구현을 못함 ㅠㅠ 
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
		// 반복문 하나로해보려했는데.. 잘안됨..
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
            System.out.print(" "); // 공백 추가
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
            System.out.print(" "); // 공백 추가
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
