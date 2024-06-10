package kods.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamEx {
	public static void main(String[] args) {
		// List �÷��� ����
		List<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("�ſ��");
		list.add("���ڹ�");
		list.add("���ٽ�");
		list.add("�ں���");
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(n->{
			System.out.println(n+" : "+Thread.currentThread().getName());
		});
		
	}
}
