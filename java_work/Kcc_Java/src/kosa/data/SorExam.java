package kosa.data;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class SorExam {

	public static void main(String[] args) {
		// 정렬 : 데이터를 넣은 순서대로 (기존)
		// 기본정렬 : Comparable => comparteTo() 오버라이딩(인터페이스 활용)
		// 정렬기준 변경 : Comparator => compare() 오버라이딩

		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// 내림 차순 정렬
				if (o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				}
				return 0;
			}
		});

		for (int i = 0; set.size() < 6; i++) {
			set.add(r.nextInt(45) + 1);

		}
		System.out.println(set);
	}

}
