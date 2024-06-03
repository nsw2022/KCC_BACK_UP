package kosa.oop6;

public class Main {
	public static void main(String[] args) {
		MyType mt=new MyType() {
			
			@Override
			public void hello() {
				System.out.println("���� �ݰ���~");
				
			}
		};
		mt.hello();
		
		
		// ����1
		MyType mt2 = ()->{
			System.out.println("�λ� �ι��ϳ� �λ缺�� ���~");
		};
		mt2.hello();
		// ����2
		MyType mt3 = ()->System.out.println("�λ� ������ �� �׷���~");
		mt3.hello();
		
		
		// �Ķ���Ͱ��� �ִ� ���ٽ�
		YourType you = new YourType() {
			
			@Override
			public void message(String message) {
				
				System.out.println("�޼��� ���غ�~ "+message);
			}
		};
		you.message("���� �� ���� �帲");
		
		YourType you2 = message->System.out.println("�����ϳ�����" + message);
		you2.message(" �׷��ϱ� ���̾�");
		
		//MyNumber �߻�޼��� ���� (���ٽ�)
		
		MyNum mn2 = (int x,int y)->{
			if (x>y) {
				return x;
				
			}else if(y<x){
				return x;
			}
			return x;
			
		};
		System.out.println(mn2.max(3,5));
		System.out.println(mn2.max(5,3));
		MyNum mn3 = (x,y)->(x>y)?x:y;
		System.out.println(mn3.max(10, 20));
		
//		Runnable r = ()->{
//			for (int i = 0; i < 10; i++) {
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {}
////				System.out.println(i);
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
		
	}
}
