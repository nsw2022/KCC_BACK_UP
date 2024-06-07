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
		
		// ����
		map.put("1", "KIA");
		map.put("2", "LG");
		map.put("3", "Samsung");
		
		System.out.println("����� ������: " + map.size());
		
		//ã��
		if (map.containsValue("LG")) map.remove("2");
		
		System.out.println("����� ������: " + map.size());
		System.out.println("�Ｚ��: " + map.get("3"));
		
		// Map ��ü ��� ���(key, value) : key ����
		// 1. Map => Set���� ���� => Iterator 
		// key=> keySet() : Set
		
		// 2. value => values : Collection
		// 3. (key, value) => entrySet() : Set
		// 1. Ű��  2.����  3.�Ѵ�
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> e = (Entry<String, String>) iter.next();
			System.out.println("key: "+  e.getKey() + ", value: " + e.getValue());
		}
		
	}
	
}
