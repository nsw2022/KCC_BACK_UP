package kosa.oop3;

public class Main {
	public static void main(String[] args) {
		Work w1 = new Work();
		Student s1 = new Student();
		
		Person p1 = new Person(w1,"��¿�");
		Person p2 = new Person(s1, "��¿�");
		p1.doIt();
		p2.doIt();
		
		Person p3 = new Person(new Role() {
			
			@Override
			public void doing() {
			System.out.println("����̺� ���");
				
			}
		},"����");
		p3.doIt();
	}
}
