package kods.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		// Set �÷��� ����
		Set<String> set = new HashSet<String>();
		set.add("ȫ�浿");
		set.add("�ſ��");
		set.add("���ڹ�");
		
		//Stream�� �̿��� ��� �ݺ� ó��
		Stream<String> stream = set.stream();
		stream.forEach(n->System.out.println(n));
	}
}
