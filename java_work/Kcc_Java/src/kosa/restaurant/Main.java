package kosa.restaurant;

public class Main {
	public static void main(String[] args) {
/*
	레스토랑 주문 시스템
	MenuItem 클래스를 만들고, name, price, description와 같은 속성을 정의합니다. 
	Appetizer, MainCourse, Dessert와 같은 하위 클래스를 만들고, 
	각 하위 클래스는 고유한 속성 (예: calories, vegetarian, glutenFree)을 가져야 합니다. 
	Order 클래스를 만들고, 
	MenuItem 객체의 목록을 저장하고, 주문 추가, 삭제, 결제 기능, 총매출 합계등을 제공합니다. 
 * */
		/*	
		 // 메뉴 아이템 생성
	    Appetizer appetizer = new Appetizer("갈릭 브레드", "마늘과 버터가 들어간 브레드", 10_000, 490,true);
	    MainCoures mainCourse = new MainCoures("스테이크",  "고급 육즙이 풍부한 스테이크", 10_000, 270,false);
	    Dessert dessert = new Dessert("치즈 케이크",  "크리미한 치즈와 바삭한 바닥이 매력적인 케이크",45_000, 321, false);

		 // 주문 객체 생성
	    Order order = new Order();

	    // 주문에 아이템 추가
	    System.out.println("메뉴 아이템을 주문에 추가합니다.");
	    order.addItem(appetizer);
	    order.addItem(mainCourse);
	    order.addItem(dessert);
	    
	    // 주문 내역 출력 - 전체 확인
	    System.out.println("\n주문 내역을 확인합니다:");
	    order.displayOrder();
	    
	    // 주문 내역 삭제
	    System.out.println("\n주문내역 삭제");
	    order.removeItem(dessert);
	    
	    // 주문 내역 출력 - 삭제확인
	    System.out.println("\n주문 내역을 확인합니다:");
	    order.displayOrder();

	    // 주문의 총 가격 출력
	    System.out.printf("\n총 주문 금액: $%d\n", order.getTotalPrice());

	    // 주문 결제
	    System.out.println("\n주문을 결제합니다.");
	    order.payOrder();
	    order.displayOrder();
	    */
		
		Order order = new Order();
		order.displayMenu();
		
				
		
	}
}
