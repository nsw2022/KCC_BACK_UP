package kosa.subject;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Order {
	private LinkedHashMap<String, ArrayList<Category>> orderMap = new LinkedHashMap<>();

	// computeIfAbsent ���� ->
	// https://hbase.tistory.com/53

	// ������ map���� ->
	// https://codingnojam.tistory.com/39
	// compute -> Ű���� ������ null ��ȯ map.compute("Ű��" ,(key, oldValue) -> oldValue ==
	// null ? 0 : oldValue + 1)
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
		Category fpsCategory = new Category("FPS");
		fpsCategory.addGame(new Game("����̹���", "���� ����� ž�ٿ� ���� ����", 64000));
		fpsCategory.addGame(new Game("GTFO", "����ũ�� �߿��� ���� ���� ����", 60000));
		fpsCategory.addGame(new Game("����Ʈ4����", "���� ����Į���� ���� ����", 12000));
		fpsCategory.addGame(new Game("�ݿ����Ƽ", "�������� ������ �ٷ� �и��͸� FPS ����", 80000));
		fpsCategory.addGame(new Game("��Ʋ�׶���", "��Ը� ��Ʋ�ξ� ����", 32000));
		
		Category horrorCategory = new Category("Horror");
		horrorCategory.addGame(new Game("�Ľ��������", "���ڿ��� Ȱ���� �����ϴ� ���� ����", 33000));
		horrorCategory.addGame(new Game("DEVOUR", "�Ƿ��� ��ġ�ϴ� ������ ���� ����", 5000));
		horrorCategory.addGame(new Game("�̺�����", "���� ���� �帣�� ����", 25000));
		horrorCategory.addGame(new Game("�����÷���Ÿ��2", "������ ���� ��Ұ� ���յ� ����", 25000));
		horrorCategory.addGame(new Game("�ϳ׽þ�", "����� ���� ���ΰ��� �޴� ���� ����", 15000));

		Category rpgCategory = new Category("RPG");
		rpgCategory.addGame(new Game("���̹���ũ2077", "�̷� ���ø� ������� �� ���� ���� RPG", 72000));
		rpgCategory.addGame(new Game("����3", "��Ȱ�� ���迡�� �������� ��Ÿ�� RPG", 32000));
		rpgCategory.addGame(new Game("�巡����׸�2", "���� ��Ÿ�� ��Ÿ���� �׼� RPG", 98000));
		rpgCategory.addGame(new Game("�������Ϳ���", "���͸� ����ϴ� �׼� RPG", 62000));
		rpgCategory.addGame(new Game("���縵", "���� ����� ��ũ ��Ÿ���� ���յ� RPG", 70000));
	    addOrder("FPS", fpsCategory);
	    addOrder("Horror", horrorCategory);
	    addOrder("RPG", rpgCategory);
	}

	public LinkedHashMap<String, ArrayList<Category>> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(LinkedHashMap<String, ArrayList<Category>> orderMap) {
		this.orderMap = orderMap;
	}

	@Override
	public String toString() {
		String listToString = orderMap.toString();
		String withoutBrackets = listToString.replaceAll("\\[", "").replaceAll("\\]", "");
		return "orderMap=" + withoutBrackets;
	}

}
