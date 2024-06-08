package kosa.subject;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Order o1 = new Order();
		Category c1 = new Category("RPG");
		c1.addGame(new Game("던전앤파이터", "액션쾌감",1_000_000));
		
		o1.addOrder("김지훈", c1);
		//System.out.println(o1.toString());
		
		// key값들을 iterator를 이용하여 출력해보기
		System.out.println("=========key값들을 iterator를 이용하여 출력해보기==========");
		Set<String> keys=o1.getOrderMap().keySet();
		Iterator<String> datas = keys.iterator();
		while (datas.hasNext()) {
			String key = datas.next();
			System.out.println(key + " : "+o1.getOrderMap().get(key));
			System.out.println();
		}
		System.out.println();
		
		// Map요소들을 Set으로 묶어 출력
		System.out.println("============Map요소들을 Set으로 묶어 출력==========");
		Set<Entry<String, ArrayList<Category>>> set = o1.getOrderMap().entrySet();
		for (Entry<String, ArrayList<Category>> entry : set) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			System.out.println();
		}
		System.out.println();
		
		// 김지훈 중복 테스트
		Category c2 = new Category("RPG");
		c2.addGame(new Game("메이플스토리", "제일좋아하는 단풍잎 게임",2_000_000));
		o1.addOrder("김지훈", c2);
		System.out.println(o1.getOrderMap().get("김지훈"));// 잘됨!
		
		
		
	}
	

}
