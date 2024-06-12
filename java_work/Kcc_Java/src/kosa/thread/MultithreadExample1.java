package kosa.thread;

public class MultithreadExample1 {
	
	public static void main(String[] args) {
		Thread thread = new DigitThread();
		thread.start();
		for (char ch = 'A';ch<='Z';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}


class DigitThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			
			}
		}
	}
	
}