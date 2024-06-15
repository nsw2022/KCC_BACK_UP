package kosa.hrMiniPro.humanResources;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardUtil {
	// "1.�Խñ� �ۼ� 2.�Խ��� ��Ϻ��� 3.�Խ��� �ڼ��� ���� 4.�˻� 5.���� 6.����";

	private int bNum, bCnt;
	
	private Scanner sc;
	private List<Board>boardArr;
	int testCnt;

	public BoardUtil() {
		boardArr = new ArrayList<Board>();
		sc = new Scanner(System.in);
		testCnt = 0;
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
		boardArr.add(new Board(bNum, bName, bUser, bContent, bCnt));
	}

	// 2. �Խ��� ��� ����
	public void showBordList() {
		for (Board board : boardArr) {
			board.listShow();
		}
	}
	
	// 3.�Խ��� �ڼ��� ����
	public void detailBoard() {
		
		for (Board board : boardArr) {
			board.listShow();
		}
		System.out.println(">�Խ��� ��ȣ�� �������ּ���");
		int bNum = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < boardArr.size(); i++) {
			
			if (boardArr.get(i).getbNum() == bNum) {
				boardArr.get(i).setbCnt(++testCnt);
				boardArr.get(i).deatilShow();
			}
			
		}
		
	}

	// 4. �Խ��� �۰˻�
	public void searchBoard() {
		System.out.print("�Խñ� ������ �˻����ּ���");
		String search = sc.nextLine();
		for (int i = 0; i < boardArr.size(); i++) {
			if (boardArr.get(i) != null) {
				if (boardArr.get(i).getbName().indexOf(search) != 1) {
					// �߰��������� �����Ҹ��Ѱ� �������� ���� ���� �ϴ°�?
					boardArr.get(i).listShow();
				}
			}
		}
	}

	// 5. �Խ��� ����
	public void deleteBoard() {
		System.out.print("������ �Խ��� ��ȣ �Է�");
		int search = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < boardArr.size(); i++) {
			
				if (boardArr.get(i).getbNum() == search) {
					boardArr.remove(i);
				}
			
		}
	}

}
