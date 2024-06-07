package kosa.data;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [이름=" + name + ", 나이=" + age + "]\n";
	}
	
/*
	예로 A > B 라고 가정하면,
	- A = A  =  0 (동일한 경우) 
	- A > B  =  1 (좌측 값이 큰 경우) 
	- B > A  = -1 (좌측 값이 작은 경우)
 * */
	@Override
	public int compareTo(Person o) {
		if (age > o.age) {
			return 1;
		}
		return -1;
	}
	
	
	
}
