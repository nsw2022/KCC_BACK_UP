package kosa.phone;

import java.util.Scanner;

public class TeacherMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TeacherManager tm = new TeacherManager(); 
		
		while(true) {
			System.out.println("��ȭ��ȣ�� : �̸�. ��ȭ��ȣ, �������, �Ѹ��� ��ȭ ������ ���");
			System.out.println(">1.�߰� 2.��ü��� 3.�˻� 4.���� 5.���� 6.����");
			System.out.println(">�޴� �Է�: ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				tm.addPhoneInfo();
				break;
			case "2":
				tm.listPhoneInfo();
				break;
			case "3":
				tm.searchPhoneInfo();
				break;
			case "4":
				tm.updatePhoneInfo();
				break;
			case "5":
				tm.deletePhoneInfo();
				break;
			
			case "6":
				System.out.println("���α׷� ����");
				return;
				

			default:
				System.out.println("�߸��Է��ϸ� ��Ӹ�");
				break;
			}
			
		}
		
	}
}
