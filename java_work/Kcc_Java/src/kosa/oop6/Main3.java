package kosa.oop6;

interface AA{
	BB abc();
}

class BB{
	BB(){
		System.out.println("BB ������");
	}
}

public class Main3 {
	public static void main(String[] args) {
		// 1. �͸� ���� Ŭ����
		AA a1 = new AA() {
			@Override
			public BB abc() {
				return new BB();
			}
		};
		a1.abc();
		
		//2. ���ٽ�
		AA a2 = ()->{return new BB();};
		a2.abc();
		
		AA a3 = ()->new BB();
		a3.abc();
		
		
		//3. �ν��Ͻ� ����
		AA a4=BB::new;
		a4.abc();
		
		
	}
}
