package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapMission {
	
	public static void main(String[] args) {
		// 이름, 정수를 한쌍으로 Map 자료구조로 구현하시오. ex) 김자바: 90, 박자바: 60
		// 1. 시험 응시자만 출력
		// 2. 총점, 평균, 최고점수, 최저점수 Collections = max(), min()
		
		// 60점 이하면 시험 안본걸로 하겠습니다
		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("박자바", 90);
//		map.put("김자바", 80);
//		map.put("노자바", 0);
//		map.put("이자바", 60);
//		map.put("자바를 자바라 ㅋㅋㅋ", 100);
//		int result = 0;
//		System.out.println(map.values());
//		Set<Entry<String, Integer>> set = map.entrySet();
//		for (Entry<String, Integer> entry : set) {
//			if (entry.getValue() >= 60) {
//				result += entry.getValue();
//				System.out.println("총점: " + result);
//				System.out.println("평균: " + (double)(result/map.size()));
//				System.out.println("최고점수: " + Collections.max(map.values()));
//				System.out.println("최저점수: " + Collections.min(map.values()));
//			}
//		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김자바", 50);
		map.put("박자바", 70);
		map.put("조자바", 20);
		map.put("이자바", 80);
		map.put("한자바", 90);
		
		// map => key 추출
		Set<String> set = map.keySet();
		System.out.println("응시자 명단: " + set);
		
		// map => value 추출
		Collection<Integer> values = map.values();
		Iterator<Integer> iterator = values.iterator();
		int total = 0;
		while(iterator.hasNext()) {
			total += iterator.next();
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + total/map.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최저점수: " + Collections.min(values));
		
		
		
				
		
	}

}
