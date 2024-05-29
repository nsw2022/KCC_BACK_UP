package kosa.video;

public class TeacherMain {
	public static void main(String[] args) {
		TeacherVideo tv1 = new TeacherVideo("1","ÆÄ¹¦","ÃÖ¹Î½Ä");
		TeacherVideo tv2 = new TeacherVideo("2","¼­¿ïÀÇ º½","È²Á¤½Ä");
		
		TeacherGeneralMember tgm1 = new TeacherGeneralMember("a1","È«±æµ¿","¸í·ûµ¿");
		tgm1.rental(tv1);
		tgm1.show();
		System.out.println("------------------------------------");
		
	}
}
