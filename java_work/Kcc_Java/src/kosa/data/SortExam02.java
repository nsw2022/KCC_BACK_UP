package kosa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam02 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동", 80));
		list.add(new Person("박길동", 20));
		list.add(new Person("김길동", 50));
		list.add(new Person("서길동", 30));
		list.add(new Person("성길동", 60));
		System.out.println();

		// System.out.println("ㄴ".compareTo("ㄴ"));

		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// 이름을 기준으로 오름차순
				// 0 =>앞쪽(AAA) == 뒷쪽(AAA)
				// 1 =>앞쪽(AAA) < 뒷쪽(ABB)
				// -1 =>앞쪽(ABB) > 뒷쪽(AAA)
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
