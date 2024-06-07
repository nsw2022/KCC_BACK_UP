package kosa.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {
	
	public static void main(String[] args) {
		// Map : (key - value).. => HashMap
		Map<String, String> map = new HashMap<String, String>();
		
		// 삽입
		map.put("1", "KIA");
		map.put("2", "LG");
		map.put("3", "Samsung");
		
		System.out.println("요소의 사이즈: " + map.size());
		
		//찾기
		if (map.containsValue("LG")) map.remove("2");
		
		System.out.println("요소의 사이즈: " + map.size());
		System.out.println("삼성팀: " + map.get("3"));
		
		// Map 전체 목록 출력(key, value) : key 없이
		// 1. Map => Set으로 변경 => Iterator 
		// key=> keySet() : Set
		
		// 2. value => values : Collection
		// 3. (key, value) => entrySet() : Set
		// 1. 키만  2.값만  3.둘다
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> e = (Entry<String, String>) iter.next();
			System.out.println("key: "+  e.getKey() + ", value: " + e.getValue());
		}
		
	}
	
}
