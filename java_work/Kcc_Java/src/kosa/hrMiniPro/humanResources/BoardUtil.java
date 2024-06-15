package kosa.hrMiniPro.humanResources;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardUtil {
	// "1.게시글 작성 2.게시판 목록보기 3.게시판 자세히 보기 4.검색 5.삭제 6.종료";

	private int bNum, bCnt;
	
	private Scanner sc;
	private List<Board>boardArr;
	int testCnt;

	public BoardUtil() {
		boardArr = new ArrayList<Board>();
		sc = new Scanner(System.in);
		testCnt = 0;
	}

	// 1.게시글 작성
	public void insertBoard() {
		bNum++;
		System.out.print(">이름을 입력해주세요 :");
		String bUser = sc.nextLine();
		System.out.print(">글 제목을 입력해주세요 :");
		String bName = sc.nextLine();
		System.out.print(">내용을 입력해주세요 :");
		String bContent = sc.nextLine();
		boardArr.add(new Board(bNum, bName, bUser, bContent, bCnt));
	}

	// 2. 게시판 목록 보기
	public void showBordList() {
		for (Board board : boardArr) {
			board.listShow();
		}
	}
	
	// 3.게시판 자세히 보기
	public void detailBoard() {
		
		for (Board board : boardArr) {
			board.listShow();
		}
		System.out.println(">게시판 번호를 선택해주세요");
		int bNum = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < boardArr.size(); i++) {
			
			if (boardArr.get(i).getbNum() == bNum) {
				boardArr.get(i).setbCnt(++testCnt);
				boardArr.get(i).deatilShow();
			}
			
		}
		
	}

	// 4. 게시판 글검색
	public void searchBoard() {
		System.out.print("게시글 제목을 검색해주세요");
		String search = sc.nextLine();
		for (int i = 0; i < boardArr.size(); i++) {
			if (boardArr.get(i) != null) {
				if (boardArr.get(i).getbName().indexOf(search) != 1) {
					// 추가로직으로 구현할만한게 여러개면 그중 고르게 하는거?
					boardArr.get(i).listShow();
				}
			}
		}
	}

	// 5. 게시판 삭제
	public void deleteBoard() {
		System.out.print("삭제할 게시판 번호 입력");
		int search = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < boardArr.size(); i++) {
			
				if (boardArr.get(i).getbNum() == search) {
					boardArr.remove(i);
				}
			
		}
	}

}
