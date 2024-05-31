package kosa.video;

public class TeacherMain {
	public static void main(String[] args) {
		TeacherVideo tv1 = new TeacherVideo("1","파묘","최민식");
		TeacherVideo tv2 = new TeacherVideo("2","서울의 봄","황정식");
		
//		TeacherGeneralMember tgm1 = new TeacherGeneralMember("a1","홍길동","명륜동");
//		tgm1.rental(tv1);
//		tgm1.show();
//		System.out.println("------------------------------------");
//		TeacherSpecialMember tsm1 = new TeacherSpecialMember("s1","박길동","청량리동",100);
//		tsm1.rental(tv2);
//		tsm1.show();
		
		// GeneralMember 와 SpecialMember를 함께 배열에서 생성
		// 각각의 rental(), show() 호출
		// 특히 SpcialMember는 specialPrint()를 호출 되도록 하여라.
		
		TeacherVideo videos[] = {
				new TeacherVideo("1","파묘","최민식"),
				new TeacherVideo("2","서울의 봄","황정식"),
				new TeacherVideo("3","주술회전","이타도리"),
				new TeacherVideo("4","코난","코난"),
				new TeacherVideo("5","벼락위의 포뇨","포뇨"),
				new TeacherVideo("6","진격의 거인","에렌 예거")
		};
		
		TeacherGeneralMember arr[] = {
				new TeacherGeneralMember("g1","홍길동","명륜동"),
				new TeacherGeneralMember("g2","김길동","명륜동"),
				new TeacherGeneralMember("g3","박길동","명륜동"),
				new TeacherSpecialMember("s1","이순신","청량리동",1_000),
				new TeacherSpecialMember("s2","이을용","동대문",2_000),
				new TeacherSpecialMember("s3","이효리","제주동",3_000)
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].rental(videos[i]);
			if (arr[i] instanceof TeacherSpecialMember) ((TeacherSpecialMember) arr[i]).specialPrint();
			arr[i].show();
			System.out.println("------------------------------------");
		}
			
	}
}
