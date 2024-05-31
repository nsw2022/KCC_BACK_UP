package kosa.video;

public class TeacherMain {
	public static void main(String[] args) {
		TeacherVideo tv1 = new TeacherVideo("1","�Ĺ�","�ֹν�");
		TeacherVideo tv2 = new TeacherVideo("2","������ ��","Ȳ����");
		
//		TeacherGeneralMember tgm1 = new TeacherGeneralMember("a1","ȫ�浿","�����");
//		tgm1.rental(tv1);
//		tgm1.show();
//		System.out.println("------------------------------------");
//		TeacherSpecialMember tsm1 = new TeacherSpecialMember("s1","�ڱ浿","û������",100);
//		tsm1.rental(tv2);
//		tsm1.show();
		
		// GeneralMember �� SpecialMember�� �Բ� �迭���� ����
		// ������ rental(), show() ȣ��
		// Ư�� SpcialMember�� specialPrint()�� ȣ�� �ǵ��� �Ͽ���.
		
		TeacherVideo videos[] = {
				new TeacherVideo("1","�Ĺ�","�ֹν�"),
				new TeacherVideo("2","������ ��","Ȳ����"),
				new TeacherVideo("3","�ּ�ȸ��","��Ÿ����"),
				new TeacherVideo("4","�ڳ�","�ڳ�"),
				new TeacherVideo("5","�������� ����","����"),
				new TeacherVideo("6","������ ����","���� ����")
		};
		
		TeacherGeneralMember arr[] = {
				new TeacherGeneralMember("g1","ȫ�浿","�����"),
				new TeacherGeneralMember("g2","��浿","�����"),
				new TeacherGeneralMember("g3","�ڱ浿","�����"),
				new TeacherSpecialMember("s1","�̼���","û������",1_000),
				new TeacherSpecialMember("s2","������","���빮",2_000),
				new TeacherSpecialMember("s3","��ȿ��","���ֵ�",3_000)
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].rental(videos[i]);
			if (arr[i] instanceof TeacherSpecialMember) ((TeacherSpecialMember) arr[i]).specialPrint();
			arr[i].show();
			System.out.println("------------------------------------");
		}
			
	}
}
