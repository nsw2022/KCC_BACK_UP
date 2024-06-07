package kosa.subject;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Order {
	private LinkedHashMap<String, ArrayList<Category>> orderMap = new LinkedHashMap<>();

	public void addOrder(String customerName, Category category) {
		orderMap.computeIfAbsent(customerName, k -> new ArrayList<>()).add(category);
	}

	public Order() {
		// �ʱ� ������ ����
		initializeOrders();
	}
	
	

	public Order(LinkedHashMap<String, ArrayList<Category>> orderMap) {
		super();
		this.orderMap = orderMap;
	}

	// �ʱ� �����͸� �����ϴ� �޼ҵ�
	private void initializeOrders() {
		// ù ��° ���� ī�װ� ���� �� �߰�
		Category fpsCategory = new Category("FPS");
		fpsCategory.addGame(new Game("����̹���", "���� ����� ž�ٿ� ���� ����", 64000));
		fpsCategory.addGame(new Game("GTFO", "����ũ�� �߿��� ���� ���� ����", 60000));
		addOrder("��¿�", fpsCategory);

		// �� ��° ���� ī�װ� ���� �� �߰�
		Category rpgCategory = new Category("RPG");
		rpgCategory.addGame(new Game("���̹���ũ2077", "�̷� ���ø� ������� �� ���� ���� RPG", 72000));
		rpgCategory.addGame(new Game("����3", "��Ȱ�� ���迡�� �������� ��Ÿ�� RPG", 32000));
		addOrder("������", rpgCategory);
	}

	public LinkedHashMap<String, ArrayList<Category>> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(LinkedHashMap<String, ArrayList<Category>> orderMap) {
		this.orderMap = orderMap;
	}

	@Override
	public String toString() {
		return "Order [orderMap=" + orderMap + "]";
	}
	
	

}
