package kosa.basic;

public class VariableExam {
	public static void main(String[] args) {
		// ������ �����͸� ��� �׸� ex)ȫ�浿 100 3.14 Ture
		// byte, short, int, long, float, double, char : �⺻�ڷ��� �������� �ٷ� ������Ƽ�� primitive
		// �����Ͱ� ���� �ٸ��� ũ�⵵ �� �ٸ���
		// String : �����ڷ��� ��ü�� �����Ͽ� �Ҵ罺
		int num; // ���� ����: �޸� �Ҵ�
		int arr[];// �迭 ���� : Object Type
		num=10;
		System.out.println(num);
		// ���� ����, �ʱ�ȭ
		int num2 = 100;
		
		// ���ڿ�:String
		String name = "ȫ�浿";
		System.out.println(name+"��");
		
		// ���� ���� ���� ����
		// ������ : Ư������X, ���ڷ� ����X, �Ҽ��� ����, _�� ���
		// �⺻ ���ͷ� : 100=>int, ""=>String, true=>boolean, ''=>char, 3.124=>double
		float a = 3.14f;
		
		//casting(����ȯ)
		//    1     2    4    8    4    8       4     2
		//����:byte<short<int<long<float<double, int<=>char
		double b = 100;
		int c = (int) 3.14;
		System.out.println(c);
		
		float num3 = 32.14f;
		long num4 = 100L;
		
		int num5 = 010;
		System.out.println(num5);
		
		
		System.out.println(10 + 3 +"a"); // ���� ���� ����
		System.out.println("a" + 10 + 3 );// ����
		
		System.out.println((int)'\n');
		
	}
}



