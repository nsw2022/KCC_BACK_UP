package kods.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StremPipline {
	public static void main(String[] args) {
//		List<Student> list = Arrays.asList(
//				new Student("홍길동",50),
//				new Student("홍용동",70),
//				new Student("김길동",95)
//				);
//		int arr[]= {1,2,3,4};
	
		// stream() 요소 - 숫자는 IntStream 이다
//		String strArray[]= {"홍길동","신용권","김미나"};
//		Stream<String> strStream = Arrays.stream(strArray);
//		strStream.forEach(item->System.out.println(item+","));
//		System.out.println();
		
//		int[] intArray = {1,2,3,4,5};
//		IntStream intStream = Arrays.stream(intArray);
//		intStream.forEach(item->System.out.println(item+","));

//		double avg = list.stream()
//				.mapToInt(student->student.getScore())
//				.average()
//				.getAsDouble();
//		System.out.println(avg);
		
		//stream() 요소출력
//		list.stream().map(Student::getName).forEach(name->System.out.println(name));;
		
		// stream() 요소필터지정후 해당하는거만 출력
//		list.stream().filter(s->s.getName().startsWith("홍"))
//		.forEach(s->System.out.println(s.getName()));
		
		// 요소걸러내기 필터링 - distinct() fillter()
		// distinct()는 요소의 중복을 제거한다. 객체 Stream의 경우 equals() 메소드의 리턴값이 true이면 동일한 요소로 판단하여 제거한다
		// {"A","B","B","A"}.distinct() -> A, B
//      list.stream().filter(s->s.getName().startsWith("홍"))
//		.forEach(s->System.out.println(s.getName()));
		
		// 이런형태도 가능 강사님 안내1
//		List<Integer>list2 = IntStream.rangeClosed(1, 10)
//				.boxed()
//				.collect(Collectors.toList());
//		list2.stream().forEach(System.out::println);
//		
//		IntStream.of(2,4,6,8,10).boxed().collect(Collectors.toList());
		
		// 강사님 안내2
		// 문자열 배열 => List, Stream 변환
//		String arr1[] = {"BB","CC","AA"};
//		List<String> list3=Arrays.asList(arr1);
//		
//		Stream<String> stream2 = list3.stream();
//		stream2.sorted().forEach(System.out::println);
//		Stream<String> stream2 = Arrays.stream(arr1);
//		stream2.sorted().forEach(System.out::println);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("홍길동",30));
		studentList.add(new Student("신용권",10));
		studentList.add(new Student("유미선",20));
		
		// 점수를 기준으로 오름차순 정렬
		//studentList.stream().sorted().forEach(s->Integer.compare());
		
	}

}
