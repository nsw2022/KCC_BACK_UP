package kosa.subject;

import java.util.HashMap;
import java.util.Map;

public class Person {
	private String userId; // ����� ���̵� Ȥ�� �̸�
    private Map<String, Category> order; // ������� �ֹ� ���
    private int level; // ������� ����

    public Person(String userId, int level) {
        this.userId = userId;
        this.level = level;
        this.order = new HashMap<>(); // �ֹ� ��� �ʱ�ȭ
    }

    // �ֹ� �߰� �޼ҵ�
    public void addOrder(String genre, Category category) {
        order.put(genre, category);
    }

    // Getter�� Setter
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, Category> getOrder() {
        return order;
    }

    public void setOrder(Map<String, Category> order) {
        this.order = order;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
