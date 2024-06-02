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
	
		
	 // �޴� ������ ����
    Appetizer appetizer = new Appetizer("���� �극��", "���ð� ���Ͱ� �� �극��", 10_000, 250,true);
    MainCoures mainCourse = new MainCoures("������ũ",  "��� ������ ǳ���� ������ũ", 10_000, false);
    Dessert dessert = new Dessert("ġ�� ����ũ",  "ũ������ ġ��� �ٻ��� �ٴ��� �ŷ����� ����ũ", 450, false);

	 // �ֹ� ��ü ����
    Order order = new Order();

    // �ֹ��� ������ �߰�
    System.out.println("�޴� �������� �ֹ��� �߰��մϴ�.");
    order.addItem(appetizer);
    order.addItem(mainCourse);
    order.addItem(dessert);

    // �ֹ� ���� ���
    System.out.println("\n�ֹ� ������ Ȯ���մϴ�:");
    order.displayOrder();

    // �ֹ��� �� ���� ���
    System.out.printf("\n�� �ֹ� �ݾ�: $%d\n", order.getTotalPrice());

    // �ֹ� ����
    System.out.println("\n�ֹ��� �����մϴ�.");
    order.payOrder();
    order.displayOrder();
    
    
		/*
	Order order = new Order();
	System.out.println("��������� ���ǰ� ȯ���մϴ�.");
	System.out.println("�پ��� ������ ���Ͻô°ſ� �°� ����ּ���");
	while (true) {
		System.out.println("1.����Ÿ���� 2.�����ڽ� 3.����Ʈ 4.����");
		String menuItem = DataInput.sc.nextLine();
		switch (menuItem) {
		case "1":

			//order.addItem(new Appetizer(name, description, price, calories, order.checdkedType(check)));
			break;
			
		case "2":
			
			break;
		case "3":
			
			break;

		default:
			break;
		}
	}
	*/
		
	}
}
