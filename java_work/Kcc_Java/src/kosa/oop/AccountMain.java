package kosa.oop;

public class AccountMain {

	public static void main(String[] args){
		Account account;//������ (Ŭ���� Ÿ��)
		account = new Account();//��ü ����(�޸� �Ҵ�)
		
		//	StringBuffer sb = new StringBuffer("abc",3.14);
		
		
		//account.deposit(5_000);
		try {
			account.withdraw(11_000);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		System.out.println("���¹�ȣ: " + account.getAccountNo());
		System.out.println("������: " + account.getOwnerName());
		System.out.println("�ܾ�: " + account.getBalance());

	}

}
