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
//			System.out.println("���� �ΰ�");
//			System.out.println("1.������ �߰�  2.������ ���� 3.������ ���  4.����");
//			userInput = sc.nextLine();
//
//			switch (userInput) {
//			case "1":
//				System.out.print("�Է��ض�: ");
//				user.add(sc.nextLine());
//				break;
//			case "2":
//				if (user.isEmpty()) {
//					System.out.println("������ �����Ͱ� �����ϴ�.");
//					break;
//				}
//				System.out.println("�����̴�:");
//				for (String s : user) {
//					System.out.println(s);
//				}
//				System.out.print("����� �����: ");
//				String itemToRemove = sc.nextLine();
//				if (user.remove(itemToRemove)) {
//					System.out.println("���� �Ϸ�.");
//				} else {
//					System.out.println("�����Ͱ� ��Ͽ� �����ϴ�.");
//				}
//				break;
//			case "3":
//				if (user.isEmpty()) {
//					System.out.println("����� �����Ͱ� �����ϴ�.");
//					break;
//				}
//				System.out.println("������ ���:");
//				for (String s : user) {
//					System.out.println(s);
//				}
//				break;
//			case "4":
//				System.out.println("�������� �� ������.");
//				return;
//			default:
//				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �õ��ϼ���.");
//				break;
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		String menu = "";
		List<String> list = new LinkedList<String>();
		
		int idx = -1;
		while (true) {
			System.out.println("���� �ΰ�");
			System.out.println("1.������ �߰�  2.������ ���� 3.������ ���  4.����");
			menu = sc.nextLine();
			switch (menu) {
			case "1":
				System.out.print("�߰� :");
				list.add(sc.nextLine());
				break;
			case "2":
				System.out.print("���� : ");
				// list.remove(sc.nextLine());
				idx = list.indexOf(sc.nextLine());
				if (idx != -1) {
					list.remove(idx);
					
				} else {
					System.out.println("�������� �ʽ��ϴ�.");
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
