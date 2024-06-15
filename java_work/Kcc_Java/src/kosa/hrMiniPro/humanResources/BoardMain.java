package kosa.hrMiniPro.humanResources;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		BoardUtil bu = new BoardUtil();
		System.out.println("게시판에 오신걸 환영합니다");
		System.out.println("사용하실 기능을 선택해 주세요");
		System.out.println("노승우".indexOf("이"));
		Scanner sc = new Scanner(System.in);
		String flag="";
		while (true) {
			System.out.println("1.게시글 작성 2.게시판 목록보기 3.게시판 자세히 보기 4.검색 5.삭제 6.종료");
			flag = sc.nextLine();
			switch (flag) {
			case "1":
				bu.insertBoard();
				break;
			case "2":
				bu.showBordList();
				break;
			case "3":
				bu.detailBoard();
				;
				break;
			case "4":
				bu.searchBoard();
				;
				break;
			case "5":
				bu.deleteBoard();
				break;

			case "6":
				sc.close();
				System.out.println("다음에 또 뵙겠슴돳");
				return;

			default:
				System.out.println("다른거 입력하면 대머리");
				break;
			}
		}

	}
}
