package kosa.thread;

public class PrintThread extends Thread{
	SharedArea shareAred;
	PrintThread() {}
	
	public PrintThread(SharedArea shareAred) {
		super();
		this.shareAred = shareAred;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			synchronized (shareAred) {
				int sum = shareAred.account1.getBalance()+shareAred.account2.getBalance();
				System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è: " + sum);
				
			}
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				
			}
		}
	}
	
}
