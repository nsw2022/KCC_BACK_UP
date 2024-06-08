package kosa.subject;

import java.util.HashMap;
import java.util.Map;

public class Person {
	private String userId; // 사용자 아이디 혹은 이름
    private Map<String, Category> order; // 사용자의 주문 목록
    private int level; // 사용자의 레벨

    public Person(String userId, int level) {
        this.userId = userId;
        this.level = level;
        this.order = new HashMap<>(); // 주문 목록 초기화
    }

    // 주문 추가 메소드
    public void addOrder(String genre, Category category) {
        order.put(genre, category);
    }

    // Getter와 Setter
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
