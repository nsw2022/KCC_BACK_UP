package kosa.api;

import java.util.Arrays;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿",20);
		Person p2 = new Person("ȫ�浿",20);
		
		// �� Ŭ������ �ƴ� objectŬ������ equals�� ���ؼ� �ٸ�
		
		if (p1.equals(p2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		System.out.println(p2.toString());
		
		
		if (1.3==1.2+0.1) {
			System.out.println("�ε��Ҽ��� �����ϳ�?");
		}else {
			System.out.println("����");			
		}
		
		
	}
	
}
