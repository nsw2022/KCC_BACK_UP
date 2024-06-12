package kosa.thread;

public class MultithreadExample3 {
	public static void main(String[] args) {
		Thread thread = new Thread(new SmallLetters());
		thread.start();
		char arr[] = {'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
		for (char c : arr) {
			System.out.println(c);
			
		}
		
	}
}


class SmallLetters implements Runnable{

	@Override
	public void run() {
		for (char ch = 'a';ch<='z';ch++) {
			System.out.println(ch);
		}
		
	}
	
}
