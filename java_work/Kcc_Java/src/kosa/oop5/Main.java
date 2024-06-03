package kosa.oop5;

public class Main {
	
	public static void main(String[] args) {
		Object obj[] = {
				new Reader("돌리"),
				new Work("길동"),
				new Student("마이콜")
		};
		for (int i = 0; i < obj.length; i++) {
			//System.out.println(obj[i] instanceof Speakable); 
			if (obj[i] instanceof Speakable) {
				System.out.println(((Speakable) obj[i]).speak());
			}
		}
				
	}

}
