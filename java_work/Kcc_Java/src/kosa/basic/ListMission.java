package kosa.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class ListMission {
	public static void main(String[] args) {
//		ArrayList<String> user = new ArrayList<String>();
//		Scanner sc = new Scanner(System.in);
//		String userInput = "";
//
//		while (true) {
//			System.out.println("골라라 인간");
//			System.out.println("1.데이터 추가  2.데이터 삭제 3.데이터 출력  4.종료");
//			userInput = sc.nextLine();
//
//			switch (userInput) {
//			case "1":
//				System.out.print("입력해라: ");
//				user.add(sc.nextLine());
//				break;
//			case "2":
//				if (user.isEmpty()) {
//					System.out.println("삭제할 데이터가 없습니다.");
//					break;
//				}
//				System.out.println("내역이다:");
//				for (String s : user) {
//					System.out.println(s);
//				}
//				System.out.print("지울걸 적어라: ");
//				String itemToRemove = sc.nextLine();
//				if (user.remove(itemToRemove)) {
//					System.out.println("삭제 완료.");
//				} else {
//					System.out.println("데이터가 목록에 없습니다.");
//				}
//				break;
//			case "3":
//				if (user.isEmpty()) {
//					System.out.println("출력할 데이터가 없습니다.");
//					break;
//				}
//				System.out.println("데이터 목록:");
//				for (String s : user) {
//					System.out.println(s);
//				}
//				break;
//			case "4":
//				System.out.println("다음번에 또 만나요.");
//				return;
//			default:
//				System.out.println("잘못된 입력입니다. 다시 시도하세요.");
//				break;
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		String menu = "";
		List<String> list = new LinkedList<String>();
		
		int idx = -1;
		while (true) {
			System.out.println("골라라 인간");
			System.out.println("1.데이터 추가  2.데이터 삭제 3.데이터 출력  4.종료");
			menu = sc.nextLine();
			switch (menu) {
			case "1":
				System.out.print("추가 :");
				list.add(sc.nextLine());
				break;
			case "2":
				System.out.print("삭제 : ");
				// list.remove(sc.nextLine());
				idx = list.indexOf(sc.nextLine());
				if (idx != -1) {
					list.remove(idx);
					
				} else {
					System.out.println("존재하지 않습니다.");
				}
				break;
			case "3":
//				for (String string : list) {
//					System.out.println(string);
//				}
				Iterator<String> iter = list.iterator();
				while(iter.hasNext()) {
					System.out.println(iter.next());
				}
				System.out.println();
				break;
			case "4":

				return;

			default:
				break;
			}
		}
	}
}
