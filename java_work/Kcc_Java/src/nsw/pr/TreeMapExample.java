package nsw.pr;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		
		//TreeMap 컬렉션 생성
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		// 엔트리 저장
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("desciption", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
		//정렬된 엔트리를 하나씩 가녀오기
		Set<Entry<String, Integer>>entrySet = treeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		System.out.println();
		
		//특정 키에 대한 값 가져오기
		Entry<String, Integer> entry = null;
		entry = treeMap.firstEntry();// 제일 앞
		System.out.println("제일 앞 단어 : "+entry.getKey() + "-" +entry.getValue());
		entry = treeMap.lastEntry();//제일 끝
		System.out.println("제일 뒤 단어 : "+entry.getKey()+"-"+entry.getValue());
		entry = treeMap.lowerEntry("ever");
		System.out.println("ever 앞 단어: "+entry.getKey()+"-"+entry.getValue());
		System.out.println();
		
		// 내림 차순으로 정렬하기
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		
		NavigableMap<String, Integer> descendingMap1 = descendingMap.descendingMap();// 두번 호출하면 내림차순이 오름차순이됨 ㅋㅋ
		Set<Entry<String, Integer>> descendingEntrySet = descendingMap1.entrySet();
		for (Entry<String, Integer> e : descendingEntrySet) {
			System.out.println(e.getKey() + "-"+e.getValue());
		}
		System.out.println();
	}

}
