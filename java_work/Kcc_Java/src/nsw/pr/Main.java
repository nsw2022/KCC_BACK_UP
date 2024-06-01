package nsw.pr;

public class Main {
	
	public static void main(String[] args) {
		
		PhoneManagerPr pmp = new PhoneManagerPr();
		
		while (true) {
			System.out.println("전화번호부 : 이름. 전화번호, 생년월일, 한명의 전화 내역을 출력");
			System.out.println(">1.추가 2.전체출력 3.검색 4.수정 5.삭제 6.종료");
			System.out.println(">메뉴 입력: ");
			String menu = DataInput.sc.nextLine();
			switch (menu) {
			case "1":
				pmp.addPhoneInfo();
				break;
				
			case "2":
				pmp.listPhoneInfo();
				break;
				
			case "3":
				pmp.searchPhonInfo();
				break;
				
			case "4":
				pmp.updatePhoneInfo();
				break;
				
			case "5":
				pmp.deletePhoneInfo();
				break;
				
			case "6":
				System.out.println("프로그램 종료");
				break;

			default:
				System.out.println("잘못입력하면 대머리");
				break;
			}
		}
		
	}
	
}
