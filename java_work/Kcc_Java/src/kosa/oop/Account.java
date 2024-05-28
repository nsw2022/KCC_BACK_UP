package kosa.oop;

public class Account {
	// ���� ���� �ϱ� ����
	// ��ü�� ���� ����� ������ ������ ����� ����
	// ����(������) : ���¹�ȣ, ������, �ܾ� => �������
	// �ൿ(���) : �Ա��ϴ�, ����ϴ� => ����޼���
	String accountNo;//���¹�ȣ
	String ownerName;//������
	int balance; //�ܾ�
	
	//������
	//������ ����
	//������ ����
	//������ �������
	public Account() {
		this("����", "�¿�", 100000);
		
	}//�⺻������
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
	

}
