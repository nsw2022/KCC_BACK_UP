package kosa.data;

import java.util.Scanner;

public class OrderMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String flag  = "";
		Order order = new Order();
		while (true) {
			System.out.println("1.�ֹ� ��û  2.�ֹ�ó��  3.�ֹ����  4.����� �Ѿ�  5. ����");
			flag = sc.nextLine();
			switch (flag) {
			case "1":
				order.addOrder();
				break;
			case "2":
				order.processOrder();
				break;
			case "3":
				order.stayOrder();
				break;
			case "4":
				order.amountOreder();
				break;
			case "5":
				System.out.println("����");
				return;

			default:
				System.out.println("�߸��Է��ϸ� ��Ӹ�");
				break;
			}
		}
	}

}
