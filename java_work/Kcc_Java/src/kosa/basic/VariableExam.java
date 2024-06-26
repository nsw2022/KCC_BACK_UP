package kosa.basic;

public class VariableExam {
	public static void main(String[] args) {
		// 변수는 데이터를 담는 그릇 ex)홍길동 100 3.14 Ture
		// byte, short, int, long, float, double, char : 기본자료형 실제값을 다룸 프리미티브 primitive
		// 데이터가 전부 다르니 크기도 다 다르다
		// String : 참조자료형 객체를 참조하여 할당스
		int num; // 변수 선언: 메모리 할당
		int arr[];// 배열 선언 : Object Type
		num=10;
		System.out.println(num);
		// 변수 선언, 초기화
		int num2 = 100;
		
		// 문자열:String
		String name = "홍길동";
		System.out.println(name+"님");
		
		// 변수 선언 주의 사항
		// 변수명 : 특수문자X, 숫자로 시작X, 소수자 시작, _는 허용
		// 기본 리터럴 : 100=>int, ""=>String, true=>boolean, ''=>char, 3.124=>double
		float a = 3.14f;
		
		//casting(형변환)
		//    1     2    4    8    4    8       4     2
		//기준:byte<short<int<long<float<double, int<=>char
		double b = 100;
		int c = (int) 3.14;
		System.out.println(c);
		
		float num3 = 32.14f;
		long num4 = 100L;
		
		int num5 = 010;
		System.out.println(num5);
		
		
		System.out.println(10 + 3 +"a"); // 정수 정수 참조
		System.out.println("a" + 10 + 3 );// 참조
		
		System.out.println((int)'\n');
		
	}
}




