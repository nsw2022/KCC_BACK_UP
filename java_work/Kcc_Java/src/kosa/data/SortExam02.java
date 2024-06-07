package kosa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam02 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("ȫ�浿", 80));
		list.add(new Person("�ڱ浿", 20));
		list.add(new Person("��浿", 50));
		list.add(new Person("���浿", 30));
		list.add(new Person("���浿", 60));
		System.out.println();

		// System.out.println("��".compareTo("��"));

		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// �̸��� �������� ��������
				// 0 =>����(AAA) == ����(AAA)
				// 1 =>����(AAA) < ����(ABB)
				// -1 =>����(ABB) > ����(AAA)
				if (o1.getName().compareTo(o2.getName()) > 0) {
					return 1;
				};
				return -1;
			}
		});
		//Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));

		System.out.println(list);

	}

}
