package kosa.restaurant;

public class Main {
	public static void main(String[] args) {
/*
	������� �ֹ� �ý���
	MenuItem Ŭ������ �����, name, price, description�� ���� �Ӽ��� �����մϴ�. 
	Appetizer, MainCourse, Dessert�� ���� ���� Ŭ������ �����, 
	�� ���� Ŭ������ ������ �Ӽ� (��: calories, vegetarian, glutenFree)�� ������ �մϴ�. 
	Order Ŭ������ �����, 
	MenuItem ��ü�� ����� �����ϰ�, �ֹ� �߰�, ����, ���� ���, �Ѹ��� �հ���� �����մϴ�. 
 * */
		/*	
		 // �޴� ������ ����
	    Appetizer appetizer = new Appetizer("���� �극��", "���ð� ���Ͱ� �� �극��", 10_000, 490,true);
	    MainCoures mainCourse = new MainCoures("������ũ",  "��� ������ ǳ���� ������ũ", 10_000, 270,false);
	    Dessert dessert = new Dessert("ġ�� ����ũ",  "ũ������ ġ��� �ٻ��� �ٴ��� �ŷ����� ����ũ",45_000, 321, false);

		 // �ֹ� ��ü ����
	    Order order = new Order();

	    // �ֹ��� ������ �߰�
	    System.out.println("�޴� �������� �ֹ��� �߰��մϴ�.");
	    order.addItem(appetizer);
	    order.addItem(mainCourse);
	    order.addItem(dessert);
	    
	    // �ֹ� ���� ��� - ��ü Ȯ��
	    System.out.println("\n�ֹ� ������ Ȯ���մϴ�:");
	    order.displayOrder();
	    
	    // �ֹ� ���� ����
	    System.out.println("\n�ֹ����� ����");
	    order.removeItem(dessert);
	    
	    // �ֹ� ���� ��� - ����Ȯ��
	    System.out.println("\n�ֹ� ������ Ȯ���մϴ�:");
	    order.displayOrder();

	    // �ֹ��� �� ���� ���
	    System.out.printf("\n�� �ֹ� �ݾ�: $%d\n", order.getTotalPrice());

	    // �ֹ� ����
	    System.out.println("\n�ֹ��� �����մϴ�.");
	    order.payOrder();
	    order.displayOrder();
	    */
		
		Order order = new Order();
		order.displayMenu();
		
				
		
	}
}
