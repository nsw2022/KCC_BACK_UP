package kosa.thread;

public class SumThread extends Thread {

	private int num1, num2, result;

	public SumThread() {
	}

	public SumThread(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {

		for (int i = num1; i <= num2; i++) {
			result += i;
		}

	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}
