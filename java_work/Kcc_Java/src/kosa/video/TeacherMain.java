package kosa.video;

public class TeacherMain {
	public static void main(String[] args) {
		TeacherVideo tv1 = new TeacherVideo("1","�Ĺ�","�ֹν�");
		TeacherVideo tv2 = new TeacherVideo("2","������ ��","Ȳ����");
		
		TeacherGeneralMember tgm1 = new TeacherGeneralMember("a1","ȫ�浿","�����");
		tgm1.rental(tv1);
		tgm1.show();
		System.out.println("------------------------------------");
		
	}
}
