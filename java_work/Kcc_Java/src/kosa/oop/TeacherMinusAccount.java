package kosa.oop;

public class TeacherMinusAccount extends Account{
	private int creditLine;//마이너스한도
	public TeacherMinusAccount() {}
	public TeacherMinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	// 오버라이딩
	// 1. 상속관계
	// 2. 메서드의 시그너처(접근제어자 리턴형 이름 파라미터) 일치
	// 3. 메서드의 내용 불일치(재정의)
	
	@Override
	public int withdraw(int amount) throws Exception {
		
		if (getBalance() +creditLine < amount) {
			throw new Exception("잔액 부족");
		}
		int balance = getBalance();
		setBalance(balance-amount);
		
		return amount;
	}
	
	
	
}
