package kosa.subject;

public class Main3 {
	public static void main(String[] args) {
		ShoppingMall mall = new ShoppingMall();

		Person p1 = new Person("������", 1);
		Category c1 = new Category("RPG");
		c1.addGame(new Game("������������", "�׼��谨", 1_000_000));

		mall.addOrder(p1.getUserId(), c1);

		Person p2 = new Person("�赿��", 2);
		Category c2 = new Category("RPG");
		c2.addGame(new Game("�����ý��丮", "���� �����ϴ� ��ǳ�� ����", 2_000_000));

		mall.addOrder(p2.getUserId(), c2);

		mall.printOrders();
	}
}
