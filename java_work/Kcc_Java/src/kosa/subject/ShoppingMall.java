package kosa.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingMall {
	private Map<String, ArrayList<Category>> orderList = new HashMap<>(); // ����ں� �ֹ� ���
    private int amount; // �� ����

    public ShoppingMall() {
        this.orderList = new HashMap<>();
        this.amount = 0;
    }
    
    // ����ֹ�����
    public void printOrders() {
        System.out.println("��� �ֹ� ����:");
        for (Map.Entry<String, ArrayList<Category>> entry : orderList.entrySet()) {
            System.out.println("�� �̸�: " + entry.getKey() + ", �ֹ� ����: " + entry.getValue());
        }
    }
    
    // ��ǰ�ֹ��ϱ�
    public void addOrder(String userId, Category category) {
        this.orderList.computeIfAbsent(userId, k -> new ArrayList<>()).add(category);
    }
    
    // ��ǰ�ֹ� �ѹ��� �ϱ� �׽�Ʈ��
    public void orderProduct(String userId, String category, Game game) {
        Category cat = new Category(category);
        cat.addGame(game);
        addOrder(userId, cat);
    }
    
    // ���� �ֹ����� �Ƹ� �츮 �˻����ó�� �����ؾ����� ����
    

    public Map<String, ArrayList<Category>> getOrderList() {
        return orderList;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

	    
	    
}
