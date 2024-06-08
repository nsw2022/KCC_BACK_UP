package kosa.subject;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Order {
	private LinkedHashMap<String, ArrayList<Category>> orderMap = new LinkedHashMap<>();

	// computeIfAbsent 설명 ->
	// https://hbase.tistory.com/53

	// 유용한 map정리 ->
	// https://codingnojam.tistory.com/39
	// compute -> 키값이 없으면 null 반환 map.compute("키값" ,(key, oldValue) -> oldValue ==
	// null ? 0 : oldValue + 1)
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
		Category fpsCategory = new Category("FPS");
		fpsCategory.addGame(new Game("헬다이버즈", "협력 기반의 탑다운 슈팅 게임", 64000));
		fpsCategory.addGame(new Game("GTFO", "팀워크가 중요한 공포 생존 게임", 60000));
		fpsCategory.addGame(new Game("래프트4데드", "좀비 아포칼립스 생존 게임", 12000));
		fpsCategory.addGame(new Game("콜오브듀티", "현실적인 전투를 다룬 밀리터리 FPS 게임", 80000));
		fpsCategory.addGame(new Game("배틀그라운드", "대규모 배틀로얄 게임", 32000));
		
		Category horrorCategory = new Category("Horror");
		horrorCategory.addGame(new Game("파스모포비아", "초자연적 활동을 조사하는 공포 게임", 33000));
		horrorCategory.addGame(new Game("DEVOUR", "악령을 퇴치하는 협력형 공포 게임", 5000));
		horrorCategory.addGame(new Game("이블위딘", "생존 공포 장르의 게임", 25000));
		horrorCategory.addGame(new Game("파피플레이타임2", "공포와 퍼즐 요소가 결합된 게임", 25000));
		horrorCategory.addGame(new Game("암네시아", "기억을 잃은 주인공이 겪는 공포 게임", 15000));

		Category rpgCategory = new Category("RPG");
		rpgCategory.addGame(new Game("사이버펑크2077", "미래 도시를 배경으로 한 오픈 월드 RPG", 72000));
		rpgCategory.addGame(new Game("위쳐3", "광활한 세계에서 펼쳐지는 판타지 RPG", 32000));
		rpgCategory.addGame(new Game("드래곤즈도그마2", "고전 판타지 스타일의 액션 RPG", 98000));
		rpgCategory.addGame(new Game("몬스터헌터월드", "몬스터를 사냥하는 액션 RPG", 62000));
		rpgCategory.addGame(new Game("엘든링", "오픈 월드와 다크 판타지가 결합된 RPG", 70000));
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
