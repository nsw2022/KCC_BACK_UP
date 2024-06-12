package kosa.thread;

public class MultithreadExample5 {
	
	public static void main(String[] args) {
		SharedArea area = new SharedArea();
		area.account1 = new Account("111-111-111","ÀÌ¸ù·æ",20_000_000);
		area.account2 = new Account("222-222-222","¼ºÃæÇâ",10_000_000);
		TransferThread thread = new TransferThread(area);
		PrintThread printThread = new PrintThread(area);
		thread.start();
		printThread.start();
	}

}
