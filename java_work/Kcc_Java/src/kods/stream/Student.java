package kods.stream;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	public Student() {}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(o.score, o.score);
	}
	
}
