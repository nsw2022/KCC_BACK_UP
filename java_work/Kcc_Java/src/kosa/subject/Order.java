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
		// 초기 데이터 설정
		initializeOrders();
	}
	
	

	public Order(LinkedHashMap<String, ArrayList<Category>> orderMap) {
		super();
		this.orderMap = orderMap;
	}

	// 초기 데이터를 설정하는 메소드
	private void initializeOrders() {
		// 첫 번째 고객과 카테고리 생성 및 추가
		Category fpsCategory = new Category("FPS");
		fpsCategory.addGame(new Game("헬다이버즈", "협력 기반의 탑다운 슈팅 게임", 64000));
		fpsCategory.addGame(new Game("GTFO", "팀워크가 중요한 공포 생존 게임", 60000));
		addOrder("노승우", fpsCategory);

		// 두 번째 고객과 카테고리 생성 및 추가
		Category rpgCategory = new Category("RPG");
		rpgCategory.addGame(new Game("사이버펑크2077", "미래 도시를 배경으로 한 오픈 월드 RPG", 72000));
		rpgCategory.addGame(new Game("위쳐3", "광활한 세계에서 펼쳐지는 판타지 RPG", 32000));
		addOrder("이지훈", rpgCategory);
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
