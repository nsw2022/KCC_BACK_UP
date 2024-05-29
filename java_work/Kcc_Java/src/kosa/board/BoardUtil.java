package kosa.board;

import java.time.LocalDate;
import java.util.Scanner;

public class BoardUtil {
	// "1.�Խñ� �ۼ� 2.�Խ��� ��Ϻ��� 3.�Խ��� �ڼ��� ���� 4.�˻� 5.���� 6.����";

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

	// 1.�Խñ� �ۼ�
	public void insertBoard() {
		bNum++;
		System.out.print(">�̸��� �Է����ּ��� :");
		String bUser = sc.nextLine();
		System.out.print(">�� ������ �Է����ּ��� :");
		String bName = sc.nextLine();
		System.out.print(">������ �Է����ּ��� :");
		String bContent = sc.nextLine();
		boardArr[count++] = new Board(bNum, bName, bUser, bContent, bCnt);
	}

	// 2. �Խ��� ��� ����
	public void showBordList() {
		for (int i = 0; i < count; i++) {
			if (boardArr[i] != null) {
				boardArr[i].listShow();
			}
		}
	}
	
	// 3.�Խ��� �ڼ��� ����
	public void detailBoard() {
		
		for (int i = 0; i < count; i++) {
			if (boardArr[i] != null) {
				boardArr[i].listShow();
			}
		}
		System.out.println(">�Խ��� ��ȣ�� �������ּ���");
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

	// 4. �Խ��� �۰˻�
	public void searchBoard() {
		System.out.print("�Խñ� ������ �˻����ּ���");
		String search = sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (boardArr[i] != null) {
				if (boardArr[i].getbName().indexOf(search) != 1) {
					boardArr[i].listShow();
				}
			}
		}
	}

	// 5. �Խ��� ����
	public void deleteBoard() {
		System.out.print("������ �Խ��� ��ȣ �Է�");
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
