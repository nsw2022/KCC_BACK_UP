package kosa.oop;

public class StaticExam {
	int total;
	static int grandTotal;
	public static void add() {
		grandTotal=10;
		//total += 20; // error - 메모리에 생성되는 시점이 달라 에러가 발생
	}

	public static void main(String[] args) {
		add();	
	}
}
