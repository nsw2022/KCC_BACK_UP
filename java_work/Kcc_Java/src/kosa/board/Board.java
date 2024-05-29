package kosa.board;

import java.time.LocalDate;

public class Board {
	// 글번호, 글제목, 글작성자, 글내용, 날짜, 조회수 
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
		System.out.print("글번호 : "+bNum + " | ");
		System.out.print(" 글제목 : "+bName + " | ");
		System.out.print(" 글작성자 : "+bUser + " | ");
		System.out.print(" 날짜 : "+bDate + " | ");
		System.out.println(" 조회수 : "+bCnt);
	}
	
	public void deatilShow() {
		System.out.println();
		System.out.println("글번호 : "+bNum);
		System.out.println(" 글제목 : "+bName);
		System.out.println(" 글작성자 : "+bUser);
		System.out.println(" 글내용 : "+bContent);
		System.out.println(" 날짜 : "+bDate);
		System.out.println(" 조회수 : "+bCnt);
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
