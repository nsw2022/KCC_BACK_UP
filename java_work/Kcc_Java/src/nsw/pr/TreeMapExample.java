package nsw.pr;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		
		//TreeMap �÷��� ����
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		// ��Ʈ�� ����
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("desciption", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
		//���ĵ� ��Ʈ���� �ϳ��� �������
		Set<Entry<String, Integer>>entrySet = treeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		System.out.println();
		
		//Ư�� Ű�� ���� �� ��������
		Entry<String, Integer> entry = null;
		entry = treeMap.firstEntry();// ���� ��
		System.out.println("���� �� �ܾ� : "+entry.getKey() + "-" +entry.getValue());
		entry = treeMap.lastEntry();//���� ��
		System.out.println("���� �� �ܾ� : "+entry.getKey()+"-"+entry.getValue());
		entry = treeMap.lowerEntry("ever");
		System.out.println("ever �� �ܾ�: "+entry.getKey()+"-"+entry.getValue());
		System.out.println();
		
		// ���� �������� �����ϱ�
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		
		NavigableMap<String, Integer> descendingMap1 = descendingMap.descendingMap();// �ι� ȣ���ϸ� ���������� ���������̵� ����
		Set<Entry<String, Integer>> descendingEntrySet = descendingMap1.entrySet();
		for (Entry<String, Integer> e : descendingEntrySet) {
			System.out.println(e.getKey() + "-"+e.getValue());
		}
		System.out.println();
	}

}
