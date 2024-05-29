package kosa.board;

import java.time.LocalDate;
import java.util.Scanner;

public class BoardUtil {
	// "1.게시글 작성 2.게시판 목록보기 3.게시판 자세히 보기 4.검색 5.삭제 6.종료";

	private int bNum, bCnt, count;
	private LocalDate bDate = LocalDate.now();
	private Scanner sc;
	private Board[] boardArr;
	int[] testCnt;

	public BoardUtil() {
		boardArr = new Board[10];
		sc = new Scanner(System.in);
		testCnt = new int[10];
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
		boardArr[count++] = new Board(bNum, bName, bUser, bContent, bCnt);
	}

	// 2. 게시판 목록 보기
	public void showBordList() {
		for (int i = 0; i < count; i++) {
			if (boardArr[i] != null) {
				boardArr[i].listShow();
			}
		}
	}
	
	// 3.게시판 자세히 보기
	public void detailBoard() {
		
		for (int i = 0; i < count; i++) {
			if (boardArr[i] != null) {
				boardArr[i].listShow();
			}
		}
		System.out.println(">게시판 번호를 선택해주세요");
		int bNum = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < count; i++) {
			if (boardArr[i] != null) {
				if (boardArr[i].getbNum() == bNum) {
					boardArr[i].setbCnt(++testCnt[i]);
					boardArr[i].deatilShow();
				}
			}
		}
		
	}

	// 4. 게시판 글검색
	public void searchBoard() {
		System.out.print("게시글 제목을 검색해주세요");
		String search = sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (boardArr[i] != null) {
				if (boardArr[i].getbName().indexOf(search) != 1) {
					boardArr[i].listShow();
				}
			}
		}
	}

	// 5. 게시판 삭제
	public void deleteBoard() {
		System.out.print("삭제할 게시판 번호 입력");
		int search = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < count; i++) {
			if (boardArr[i] != null) {
				if (boardArr[i].getbNum() == search) {
					boardArr[i] = null;
				}
			}
		}
	}

}
