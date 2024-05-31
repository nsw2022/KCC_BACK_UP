package kosa.video;

public class Main {
	public static void main(String[] args) {
		Video v1 = new Video("1","Æ®·£½ºÆ÷¸Ó3","¼­ºÀ¼ö");
		Video v2 = new Video("2","ÄôÇªÆÒ´õ","Áö¼º¹Î");
		
		GeneralMember g1 = new GeneralMember("aaa", "È«±æµ¿", "µ¿Åº");
		SpecialMember s2 = new SpecialMember("bbb", "±èÃ¶¼ö", "¼­¿ï");
	
		g1.resgistVideo(v1);
		s2.resgistVideo(v2);
	
		g1.showUser();
		System.out.println("===============================");
		s2.showUser();
		
	}
}
