package kosa.hrMiniPro.humanResources;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		BoardUtil bu = new BoardUtil();
		System.out.println("�Խ��ǿ� ���Ű� ȯ���մϴ�");
		System.out.println("����Ͻ� ����� ������ �ּ���");
		System.out.println("��¿�".indexOf("��"));
		Scanner sc = new Scanner(System.in);
		String flag="";
		while (true) {
			System.out.println("1.�Խñ� �ۼ� 2.�Խ��� ��Ϻ��� 3.�Խ��� �ڼ��� ���� 4.�˻� 5.���� 6.����");
			flag = sc.nextLine();
			switch (flag) {
			case "1":
				bu.insertBoard();
				break;
			case "2":
				bu.showBordList();
				break;
			case "3":
				bu.detailBoard();
				;
				break;
			case "4":
				bu.searchBoard();
				;
				break;
			case "5":
				bu.deleteBoard();
				break;

			case "6":
				sc.close();
				System.out.println("������ �� �˰ڽ���");
				return;

			default:
				System.out.println("�ٸ��� �Է��ϸ� ��Ӹ�");
				break;
			}
		}

	}
}
