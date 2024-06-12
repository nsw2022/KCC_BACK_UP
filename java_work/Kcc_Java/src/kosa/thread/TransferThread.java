package kosa.thread;

public class TransferThread extends Thread{
	SharedArea sharedArea;
	public TransferThread() {}
	
	public TransferThread(SharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for (int i = 0; i < 12; i++) {
			try {
				synchronized (sharedArea) {
					sharedArea.account1.withdraw(1_000_000);
					System.out.println("�̸��� ���� 100���� ����");
					sharedArea.account2.deposit(1_000_000);
					System.out.println("������ ���� 100���� ����");					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
