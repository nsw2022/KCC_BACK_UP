package kosa.oop;

public class StaticExam {
	int total;
	static int grandTotal;
	public static void add() {
		grandTotal=10;
		//total += 20; // error - �޸𸮿� �����Ǵ� ������ �޶� ������ �߻�
	}

	public static void main(String[] args) {
		add();	
	}
}
