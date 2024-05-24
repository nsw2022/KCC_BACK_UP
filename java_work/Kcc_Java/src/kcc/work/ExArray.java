package kcc.work;



public class ExArray {

	public static void main(String[] args) {
		int number = 5;
		
//		System.out.print("\n");
//		System.out.println("엔터자동이에요");
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
////				System.out.println(i+" * ");
//				System.out.printf("%2d * %2d = %2d\n", i, j, i*j);
//			}
//		}
		
		
		
		// 1-1
		System.out.println("1-1.");
		for (int i = 1; i <= 25; i++) {
			System.out.printf(" %2d",i);
			if (i%number==0) {
				System.out.println();
			}
		}
		System.out.println();
		
		// 2
		
		// 1-3
		System.out.println("1-3.");
		for (int i = 1; i <= 49; i+=2) {
			System.out.printf(" %2d",i);
			if (i%(number*2)==9) {
				System.out.println();
			}
		}
		System.out.println();
		
		// 1-4
		System.out.println("1-4.");
		for (int i = 0; i <= number; i++) { 
			for (int j = 0; j < i ; j++) {
				System.out.printf("%2d",j+1);
				
			}	
			System.out.println();
		}
		System.out.println();
		// 1-5
		System.out.println("1-5.");
		int one_five=0;
		for (int i = 0; i <= number; i++) {
			for (int j = 0; j < i ; j++) {
				one_five++;
				System.out.printf("%3d",j+one_five);
				
			}
			System.out.println();
		}
	}

}
