package kosa.video;

public class Main {
	public static void main(String[] args) {
		Video v1 = new Video("1","Ʈ��������3","������");
		Video v2 = new Video("2","��Ǫ�Ҵ�","������");
		
		GeneralMember g1 = new GeneralMember("aaa", "ȫ�浿", "��ź");
		GeneralMember g2 = new GeneralMember("bbb", "��ö��", "����");
	
		g1.resgistVideo(v1);
		g2.resgistVideo(v2);
	
		g1.showUser();
		System.out.println("===============================");
		g2.showUser();
		
	}
}
