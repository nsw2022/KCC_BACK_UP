package kosa.oop5;

public class Reader extends Man implements Speakable{
	String name;
	public Reader(String name) {
		this.name = name;
	}



	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return getName() + " 자바 화이팅";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
}
