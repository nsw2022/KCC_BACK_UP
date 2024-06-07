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
		// �̸�, ������ �ѽ����� Map �ڷᱸ���� �����Ͻÿ�. ex) ���ڹ�: 90, ���ڹ�: 60
		// 1. ���� �����ڸ� ���
		// 2. ����, ���, �ְ�����, �������� Collections = max(), min()
		
		// 60�� ���ϸ� ���� �Ⱥ��ɷ� �ϰڽ��ϴ�
		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("���ڹ�", 90);
//		map.put("���ڹ�", 80);
//		map.put("���ڹ�", 0);
//		map.put("���ڹ�", 60);
//		map.put("�ڹٸ� �ڹٶ� ������", 100);
//		int result = 0;
//		System.out.println(map.values());
//		Set<Entry<String, Integer>> set = map.entrySet();
//		for (Entry<String, Integer> entry : set) {
//			if (entry.getValue() >= 60) {
//				result += entry.getValue();
//				System.out.println("����: " + result);
//				System.out.println("���: " + (double)(result/map.size()));
//				System.out.println("�ְ�����: " + Collections.max(map.values()));
//				System.out.println("��������: " + Collections.min(map.values()));
//			}
//		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("���ڹ�", 50);
		map.put("���ڹ�", 70);
		map.put("���ڹ�", 20);
		map.put("���ڹ�", 80);
		map.put("���ڹ�", 90);
		
		// map => key ����
		Set<String> set = map.keySet();
		System.out.println("������ ���: " + set);
		
		// map => value ����
		Collection<Integer> values = map.values();
		Iterator<Integer> iterator = values.iterator();
		int total = 0;
		while(iterator.hasNext()) {
			total += iterator.next();
		}
		
		System.out.println("����: " + total);
		System.out.println("���: " + total/map.size());
		System.out.println("�ְ�����: " + Collections.max(values));
		System.out.println("��������: " + Collections.min(values));
		
		
		
				
		
	}

}
