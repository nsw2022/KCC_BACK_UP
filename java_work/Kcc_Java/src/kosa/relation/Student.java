package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courses; // �л��� ������û �� �����
	
	public Student() {}

	public Student(String name) {
		super();
		this.name = name;
		courses = new ArrayList<Course>();
	}
	
	public void register(Course course) {
		courses.add(course);
		course.addStudent(this);
	}
	
	public void dropCourse(Course course) {
		if (courses.contains(course)) {
			courses.remove(course);
			course.removeStudent(this);
		}
	}
	
	public void printMember() {
		System.out.println("�л��̸�: "+name);
		for (Course course : courses) {
			System.out.println("��������� ���: " + course.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
