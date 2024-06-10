package kosa.subject;

import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
//		ShoppingMall mall = new ShoppingMall();
//		Order order = new Order();
//		Person p1 = new Person("김지훈");
//		Category c1 = new Category("RPG");
//		c1.addGame(new Game("던전앤파이터", "액션쾌감", 5_000_000));
//		order.addOrder(p1.getUserId(), c1);
//		mall.addOrder(p1.getUserId(), order);
//		mall.printOrders();

		ShoppingMall mall = new ShoppingMall();
		
		System.out.println("Steam에 오신것을 환영합니다");
		
		
		

		while (true) {

			System.out.println("1.아이디 입력하기 2.전체 게임 목록 보기  3.최저가격순보기");
			System.out.print("입력: ");
			String menu = DataInput.sc.nextLine();

			switch (menu) {
			case "1":
				System.out.print("아이디 입력 : ");
				String id = DataInput.sc.nextLine();
				Person person = new Person(id);
				mall.setPerson(person);
				mall.personalOrder();
				break;
			case "2":
				mall.printOrders();
				break;
			case "3":
				mall.lowerPrintOrders();
				break;
			
		

			default:
				break;
			}

		}

	}
}
