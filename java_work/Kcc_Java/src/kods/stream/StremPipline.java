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
//				new Student("ȫ�浿",50),
//				new Student("ȫ�뵿",70),
//				new Student("��浿",95)
//				);
//		int arr[]= {1,2,3,4};
	
		// stream() ��� - ���ڴ� IntStream �̴�
//		String strArray[]= {"ȫ�浿","�ſ��","��̳�"};
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
		
		//stream() ������
//		list.stream().map(Student::getName).forEach(name->System.out.println(name));;
		
		// stream() ������������� �ش��ϴ°Ÿ� ���
//		list.stream().filter(s->s.getName().startsWith("ȫ"))
//		.forEach(s->System.out.println(s.getName()));
		
		// ��Ұɷ����� ���͸� - distinct() fillter()
		// distinct()�� ����� �ߺ��� �����Ѵ�. ��ü Stream�� ��� equals() �޼ҵ��� ���ϰ��� true�̸� ������ ��ҷ� �Ǵ��Ͽ� �����Ѵ�
		// {"A","B","B","A"}.distinct() -> A, B
//      list.stream().filter(s->s.getName().startsWith("ȫ"))
//		.forEach(s->System.out.println(s.getName()));
		
		// �̷����µ� ���� ����� �ȳ�1
//		List<Integer>list2 = IntStream.rangeClosed(1, 10)
//				.boxed()
//				.collect(Collectors.toList());
//		list2.stream().forEach(System.out::println);
//		
//		IntStream.of(2,4,6,8,10).boxed().collect(Collectors.toList());
		
		// ����� �ȳ�2
		// ���ڿ� �迭 => List, Stream ��ȯ
//		String arr1[] = {"BB","CC","AA"};
//		List<String> list3=Arrays.asList(arr1);
//		
//		Stream<String> stream2 = list3.stream();
//		stream2.sorted().forEach(System.out::println);
//		Stream<String> stream2 = Arrays.stream(arr1);
//		stream2.sorted().forEach(System.out::println);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("ȫ�浿",30));
		studentList.add(new Student("�ſ��",10));
		studentList.add(new Student("���̼�",20));
		
		// ������ �������� �������� ����
		//studentList.stream().sorted().forEach(s->Integer.compare());
		
	}

}
