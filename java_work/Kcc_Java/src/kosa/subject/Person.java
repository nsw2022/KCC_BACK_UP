package kosa.subject;

import java.util.HashMap;
import java.util.Map;

public class Person {
	private String userId; // 사용자 아이디 혹은 이름
    private Map<String, Category> order; // 사용자의 주문 목록
    public Person() {}

    public Person(String userId) {
        this.userId = userId;
    
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

  
}
