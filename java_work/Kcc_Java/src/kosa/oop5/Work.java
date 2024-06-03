package kosa.oop5;

public class Work extends Man implements Speakable{
	String name;
	
	

	public Work(String name) {
		super();
		this.name = name;
	}



	@Override
	public String speak() {
	
		return getName() + " ¿À´Ãµµ ¶ÑµÐ °³¹Ì´Â ¶ÑµÐ ÀÏÀ» ÇÏ³×";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
}
