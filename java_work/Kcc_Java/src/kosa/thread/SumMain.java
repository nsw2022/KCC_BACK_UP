package kosa.thread;

public class SumMain {
	
	public static void main(String[] args) {
		// t1 1 ~ 50 합을 구하는 스레드
		// t2 51 ~ 00 합을 구하는 스레드
		// main : t1 + t2 => 5050
		SumThread s1 = new SumThread(1,50);
		SumThread s2 = new SumThread(51,100);
		s1.start();
		s2.start();
		try {
			s1.join();
			s2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("합계"+(s1.getResult()+s2.getResult()));
	
	}

}
