package kosa.oop;

import java.util.Scanner;

public class TeacherBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		String[] books = new String[3];
		int[] userInput = new int[3]; 
		
		for (int i = 0; i < books.length; i++) {
			System.out.println("책이름과 가격을 입력");
			books[i]=sc.nextLine();
			userInput[i]=Integer.parseInt(sc.nextLine());
			
		}
		System.out.println();
		for (int i = 0; i < userInput.length; i++) {
			System.out.println(books[i]);
			System.out.println(userInput[i]);
		}
		TeacherBook arr[] = new TeacherBook[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= new TeacherBook(books[i],userInput[i]);
		}
//		TeacherBook arr[]= {
//				new TeacherBook("Java",30000),
//				new TeacherBook("Jsp",20000),
//				new TeacherBook("Orcal",15000)
//				
//				};
		
//		TeacherBook tb1 = new TeacherBook("Java",20000);
//		tb1.discount();
//		tb1.printBook();
		
		for (TeacherBook teacherBook : arr) {
			teacherBook.discount();
			teacherBook.printBook();
			total += teacherBook.dc_price;
		}
		System.out.println("총합: "+total);
		sc.close();
	}

}
