package kods.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamEx {
	public static void main(String[] args) {
		// List 컬랙션 생성
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(n->{
			System.out.println(n+" : "+Thread.currentThread().getName());
		});
		
	}
}
