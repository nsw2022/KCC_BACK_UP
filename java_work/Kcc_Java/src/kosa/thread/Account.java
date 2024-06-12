package kosa.thread;

public class Account {
	// 계좌 생성 하기 위해
	// 객체로 부터 공통된 데이터 구조와 기능을 추출
	// 상태(데이터) : 계좌번호, 계좌주, 잔액 => 멤버변수
	// 행동(기능) : 입금하다, 출금하다 => 멤버메서드
	private String accountNo;//계좌번호
	private String ownerName;//계좌주
	private int balance; //잔액
	
	//생성자
	//생성자 역할
	//생성자 시점
	//생성자 구현방법
	public Account() {}//기본생성자
	public Account(String string, String string2, double d) {}
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// 입금하다.
	public void deposit(int amount) {
		balance += amount;
	}
	
	// 출금하다
	public int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("잔액부족");
		}
		balance -= amount;
		return balance;
	}
	
	// 간단한 테스트
	public void print() {
		System.out.println("부모");
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	

}
