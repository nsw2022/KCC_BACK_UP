package kosa.api;

import java.util.Arrays;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동",20);
		Person p2 = new Person("홍길동",20);
		
		// 내 클래스가 아닌 object클래스의 equals를 비교해서 다름
		
		if (p1.equals(p2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		System.out.println(p2.toString());
		
		
		if (1.3==1.2+0.1) {
			System.out.println("부동소수점 지원하냐?");
		}else {
			System.out.println("ㄴㄴ");			
		}
		
		
	}
	
}
