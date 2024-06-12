package kosa.thread;

public class Account {
	// ���� ���� �ϱ� ����
	// ��ü�� ���� ����� ������ ������ ����� ����
	// ����(������) : ���¹�ȣ, ������, �ܾ� => �������
	// �ൿ(���) : �Ա��ϴ�, ����ϴ� => ����޼���
	private String accountNo;//���¹�ȣ
	private String ownerName;//������
	private int balance; //�ܾ�
	
	//������
	//������ ����
	//������ ����
	//������ �������
	public Account() {}//�⺻������
	public Account(String string, String string2, double d) {}
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// �Ա��ϴ�.
	public void deposit(int amount) {
		balance += amount;
	}
	
	// ����ϴ�
	public int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("�ܾ׺���");
		}
		balance -= amount;
		return balance;
	}
	
	// ������ �׽�Ʈ
	public void print() {
		System.out.println("�θ�");
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
