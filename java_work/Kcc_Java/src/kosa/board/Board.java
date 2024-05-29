package kosa.board;

import java.time.LocalDate;

public class Board {
	// �۹�ȣ, ������, ���ۼ���, �۳���, ��¥, ��ȸ�� 
	private String bUser,bName, bContent;
	private int bNum, bCnt;
	LocalDate bDate = LocalDate.now();


	public Board(int bNum, String bName, String bUser, String bContent,  int bCnt) {
		super();
		this.bNum = bNum;
		this.bUser = bUser;
		this.bContent = bContent;
		this.bName = bName;
		this.bCnt = bCnt;
	}
	
	public void listShow() {
		System.out.println();
		System.out.print("�۹�ȣ : "+bNum + " | ");
		System.out.print(" ������ : "+bName + " | ");
		System.out.print(" ���ۼ��� : "+bUser + " | ");
		System.out.print(" ��¥ : "+bDate + " | ");
		System.out.println(" ��ȸ�� : "+bCnt);
	}
	
	public void deatilShow() {
		System.out.println();
		System.out.println("�۹�ȣ : "+bNum);
		System.out.println(" ������ : "+bName);
		System.out.println(" ���ۼ��� : "+bUser);
		System.out.println(" �۳��� : "+bContent);
		System.out.println(" ��¥ : "+bDate);
		System.out.println(" ��ȸ�� : "+bCnt);
	}

	public int getbNum() {
		return bNum;
	}

	public void setbNum(int bNum) {
		this.bNum = bNum;
	}

	public String getbUser() {
		return bUser;
	}

	public void setbUser(String bUser) {
		this.bUser = bUser;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	
	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public int getbCnt() {
		return bCnt;
	}

	public void setbCnt(int bCnt) {
		this.bCnt = bCnt;
	}
	
	
	
}
