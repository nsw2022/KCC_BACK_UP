package kosa.oop5;

public class Work extends Man implements Speakable{
	String name;
	
	

	public Work(String name) {
		super();
		this.name = name;
	}



	@Override
	public String speak() {
	
		return getName() + " ���õ� �ѵ� ���̴� �ѵ� ���� �ϳ�";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
}
