package kosa.oop6;

public class Main {
	public static void main(String[] args) {
		MyType mt=new MyType() {
			
			@Override
			public void hello() {
				System.out.println("나도 반가워~");
				
			}
		};
		mt.hello();
		
		
		// 람다1
		MyType mt2 = ()->{
			System.out.println("인사 두번하네 인사성이 밝아~");
		};
		mt2.hello();
		// 람다2
		MyType mt3 = ()->System.out.println("인사 세번은 좀 그렇네~");
		mt3.hello();
		
		
		// 파라미터값이 있는 람다식
		YourType you = new YourType() {
			
			@Override
			public void message(String message) {
				
				System.out.println("메세지 말해봐~ "+message);
			}
		};
		you.message("지니 폴 유얼 드림");
		
		YourType you2 = message->System.out.println("뭐라하냐이제" + message);
		you2.message(" 그러니깐 말이야");
		
		//MyNumber 추상메서드 구현 (람다식)
		
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
