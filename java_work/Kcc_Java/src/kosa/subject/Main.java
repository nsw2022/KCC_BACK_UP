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
		c1.addGame(new Game("������������", "�׼��谨",1_000_000));
		
		o1.addOrder("������", c1);
		//System.out.println(o1.toString());
		
		// key������ iterator�� �̿��Ͽ� ����غ���
		System.out.println("=========key������ iterator�� �̿��Ͽ� ����غ���==========");
		Set<String> keys=o1.getOrderMap().keySet();
		Iterator<String> datas = keys.iterator();
		while (datas.hasNext()) {
			String key = datas.next();
			System.out.println(key + " : "+o1.getOrderMap().get(key));
			System.out.println();
		}
		System.out.println();
		
		// Map��ҵ��� Set���� ���� ���
		System.out.println("============Map��ҵ��� Set���� ���� ���==========");
		Set<Entry<String, ArrayList<Category>>> set = o1.getOrderMap().entrySet();
		for (Entry<String, ArrayList<Category>> entry : set) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			System.out.println();
		}
		System.out.println();
		
		// ������ �ߺ� �׽�Ʈ
		Category c2 = new Category("RPG");
		c2.addGame(new Game("�����ý��丮", "���������ϴ� ��ǳ�� ����",2_000_000));
		o1.addOrder("������", c2);
		System.out.println(o1.getOrderMap().get("������"));// �ߵ�!
		
		
		
	}
	

}
