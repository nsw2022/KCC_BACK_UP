package kosa.data;

import java.util.Scanner;

public class OrderMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String flag  = "";
		Order order = new Order();
		while (true) {
			System.out.println("1.주문 요청  2.주문처리  3.주문대기  4.매출액 총액  5. 종료");
			flag = sc.nextLine();
			switch (flag) {
			case "1":
				order.addOrder();
				break;
			case "2":
				order.processOrder();
				break;
			case "3":
				order.stayOrder();
				break;
			case "4":
				order.amountOreder();
				break;
			case "5":
				System.out.println("빠이");
				return;

			default:
				System.out.println("잘못입력하면 대머리");
				break;
			}
		}
	}

}
