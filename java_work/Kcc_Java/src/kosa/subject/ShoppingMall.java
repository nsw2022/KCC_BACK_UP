package kosa.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingMall {
	private Map<String, ArrayList<Category>> orderList = new HashMap<>(); // 사용자별 주문 목록
    private int amount; // 총 가격

    public ShoppingMall() {
        this.orderList = new HashMap<>();
        this.amount = 0;
    }
    
    // 모든주문내역
    public void printOrders() {
        System.out.println("모든 주문 내역:");
        for (Map.Entry<String, ArrayList<Category>> entry : orderList.entrySet()) {
            System.out.println("고객 이름: " + entry.getKey() + ", 주문 내역: " + entry.getValue());
        }
    }
    
    // 상품주문하기
    public void addOrder(String userId, Category category) {
        this.orderList.computeIfAbsent(userId, k -> new ArrayList<>()).add(category);
    }
    
    // 상품주문 한번에 하기 테스트중
    public void orderProduct(String userId, String category, Game game) {
        Category cat = new Category(category);
        cat.addGame(game);
        addOrder(userId, cat);
    }
    
    // 개별 주문보기 아마 우리 검색기능처럼 구현해야할지 싶음
    

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
