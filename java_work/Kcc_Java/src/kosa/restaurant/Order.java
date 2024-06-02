package kosa.restaurant;

public class Order {
	private MenuItem items[] = new MenuItem[10];
	private int count;

	public Order() {
	}
	
	// ��ȿ�� üũ(Ŭ���� ����, ä��������)
	public boolean checdkedType(String type) {
		return type.equals("1") ? true : false;
	}

	// �޴� ������ �߰� �޼ҵ�
	public void addItem(MenuItem item) {
//		System.out.println("���ϴ� ä���������ΰ���?: ");
//		String check = DataInput.sc.nextLine();
		if (count < items.length) { // �迭�� ���� ���� �ʾҴ��� Ȯ��
			items[count++] = item; // �������� �迭�� �߰��ϰ� ī��Ʈ ����
		} else {
			System.out.println("�ֹ� ������ ������ ���� �ʰ��߽��ϴ�.");
		}
	}

	// �޴� ������ ���� �޼ҵ�
	public void removeItem(MenuItem item) {
		for (int i = 0; i < count; i++) {
			if (items[i].equals(item)) {
				// �������� ã�� ���, �ش� ��ġ�������� �迭�� ������ ���
				System.arraycopy(items, i + 1, items, i, count - i - 1);
				items[--count] = null; // ������ �������� null�� �����ϰ� ī��Ʈ ����
				return;
			}
		}
		System.out.println("�ش� �������� �ֹ� ��Ͽ� �����ϴ�.");
	}

	// �� ���� ��� �޼ҵ�
	public int getTotalPrice() {
		int total = 0;
		for (int i = 0; i < count; i++) {
			total += items[i].getPrice(); // �� �������� ������ ����
		}
		return total;
	}

	// �ֹ� ���� ǥ�� �޼ҵ�
	public void displayOrder() {
		if (count == 0) {
			System.out.println("�ֹ� ������ ��� �ֽ��ϴ�.");
			return;
		}
		System.out.println("�ֹ� ����:");
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + ". " + items[i].getName() + " - $" + items[i].getPrice());
		}
	}
	
	// �ֹ� ���� �� ��� �ʱ�ȭ �޼ҵ�
    public void payOrder() {
        System.out.println("�����Ǿ����ϴ�. �� �ݾ�: $" + getTotalPrice());
        items = new MenuItem[10]; // �ֹ� ����� ���� �ʱ�ȭ
        count = 0;
    }

	

}
