package kosa.oop5;

public class Student extends Man{
	public Student(String string) {}
	
	public void speak() {
		System.out.println(super.getName()+"공부나 열심히 해");
	}
}
