package kosa.oop5;

public class Main {
	
	public static void main(String[] args) {
		Object obj[] = {
				new Reader("����"),
				new Work("�浿"),
				new Student("������")
		};
		for (int i = 0; i < obj.length; i++) {
			//System.out.println(obj[i] instanceof Speakable); 
			if (obj[i] instanceof Speakable) {
				System.out.println(((Speakable) obj[i]).speak());
			}
		}
				
	}

}
