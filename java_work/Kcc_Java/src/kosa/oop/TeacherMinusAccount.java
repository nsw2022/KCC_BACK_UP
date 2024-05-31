package kosa.oop;

public class TeacherMinusAccount extends Account{
	private int creditLine;//���̳ʽ��ѵ�
	public TeacherMinusAccount() {}
	public TeacherMinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	// �������̵�
	// 1. ��Ӱ���
	// 2. �޼����� �ñ׳�ó(���������� ������ �̸� �Ķ����) ��ġ
	// 3. �޼����� ���� ����ġ(������)
	
	@Override
	public int withdraw(int amount) throws Exception {
		
		if (getBalance() +creditLine < amount) {
			throw new Exception("�ܾ� ����");
		}
		int balance = getBalance();
		setBalance(balance-amount);
		
		return amount;
	}
	
	
	
}
