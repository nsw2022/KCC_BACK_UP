package kosa.video;

public class Main {
	public static void main(String[] args) {
		Video v1 = new Video("1","Ʈ��������3","������");
		Video v2 = new Video("2","��Ǫ�Ҵ�","������");
		
		GeneralMember g1 = new GeneralMember("aaa", "ȫ�浿", "��ź");
		SpecialMember s2 = new SpecialMember("bbb", "��ö��", "����");
	
		g1.resgistVideo(v1);
		s2.resgistVideo(v2);
	
		g1.showUser();
		System.out.println("===============================");
		s2.showUser();
		
	}
}
