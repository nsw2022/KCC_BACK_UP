package kosa.subject;

import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
//		ShoppingMall mall = new ShoppingMall();
//		Order order = new Order();
//		Person p1 = new Person("������");
//		Category c1 = new Category("RPG");
//		c1.addGame(new Game("������������", "�׼��谨", 5_000_000));
//		order.addOrder(p1.getUserId(), c1);
//		mall.addOrder(p1.getUserId(), order);
//		mall.printOrders();

		ShoppingMall mall = new ShoppingMall();
		
		System.out.println("Steam�� ���Ű��� ȯ���մϴ�");
		
		
		

		while (true) {

			System.out.println("1.���̵� �Է��ϱ� 2.��ü ���� ��� ����  3.�������ݼ�����");
			System.out.print("�Է�: ");
			String menu = DataInput.sc.nextLine();

			switch (menu) {
			case "1":
				System.out.print("���̵� �Է� : ");
				String id = DataInput.sc.nextLine();
				Person person = new Person(id);
				mall.setPerson(person);
				mall.personalOrder();
				break;
			case "2":
				mall.printOrders();
				break;
			case "3":
				mall.lowerPrintOrders();
				break;
			
		

			default:
				break;
			}

		}

	}
}
