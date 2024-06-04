package nsw.collection;

import java.util.ArrayList;

public interface Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		// 1. 요소의 개수
		System.out.println("요소 개수 : " + list.size());

		// 2. 요소 추가
		String s = new String("aa");
		list.add(s);
		list.add(new String("bb"));
		list.add("cc"); // 자동 new String()
		System.out.println("요소 개수 : " + list.size());

		// 3. 요소 얻어오기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 4. 요소 삭제
		list.remove(1);
		System.out.println("요소 개수 : " + list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		// System.out.println( list.get(2) ); //Exception발생

		// 5. 특정위치에 요소추가
		list.add(1, "dd"); // 1번방에 "dd"문자열 삽입
		System.out.println("요소 개수 : " + list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 6. 요소제거 할때 인덱스 번호가 아니라 객체참조변수로도 삭제 가능
		String s2 = new String("Test");
		list.add(s2);
		System.out.println("요소 개수 : " + list.size());
		list.remove(s2);
		System.out.println("요소 개수 : " + list.size());

		// 7. 요소 모두 지우기
		list.clear();
		System.out.println("요소 개수 : " + list.size());

		// 8. 중복된 데이터 추가 가능함.
		list.add("aa");
		list.add("aa");
		list.add("aa");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 9. 요소의 검색 관련 기능들.
		System.out.println(list.contains("aa")); // 그 데이터가 존재하는지 여부[true/false]
		System.out.println(list.contains("bb"));

		list.clear();
		System.out.println(list.isEmpty()); // 리스트가 비어있는지 여부

		// 10. 한번에 여러요소들을 추가하기.
		list.add("aa");
		list.add("bb");
		list.add("cc");

		// 또 다른 리스트객체
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("kk");
		list2.add("ss");

		// 다른 리스트의 요소들을 한방에 추가시키는 기능
		list.addAll(list2);
		System.out.println(list.toString()); // 자동 요소들을 [,,,]해서 문자열로 리턴해줌

		// 10.1 여러요소를 한방에 추가할때 특정위치에 통으로 삽입하기.
		list.addAll(1, list2);
		System.out.println(list.toString());
		// 11. 특정요소들을 한방에 제거하기

		// 지울 목록을 지는 리스트객체 - 데스노트 (살생부)
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("aa");
		list3.add("kk");

		list.removeAll(list3);
		System.out.println(list.toString());

		// 12. 특정요소들만 남기고 모두 제거..
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("ss");

		list.retainAll(list4);
		System.out.println(list.toString());

		// 13. 특정 요소들이 모두 포함되어 있는지 비교.
		list.clear();

		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		list.add("ff");
		list.add("cc");
		list.add("aa");
		list.add("gg");
		// 검색할 데이터들을 가진 또 다른 리스트객체
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("aa");
		list5.add("bb");
		System.out.println(list.containsAll(list5)); // true

		list5.add("kk");
		System.out.println(list.containsAll(list5)); // false

	}

}
