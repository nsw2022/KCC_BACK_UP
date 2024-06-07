package kosa.data;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Order {
	private LinkedList<Food> food = new LinkedList<Food>();
	private int amount;
	Scanner sc = new Scanner(System.in);
	public Order() {}

	public Order(LinkedList<Food> food, int amount) {
		super();
		this.food = food;
		this.amount = amount;
	}


	public List<Food> getFood() {
		return food;
	}

	public void setFood(LinkedList<Food> food) {
		this.food = food;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/*
	 * iter.next는 값을 얻어오는 참조변수야
	 * iter.next는 현재번째의 Food 객체의 참조변수를 얻어왔을꺼야
	 * 그러면 Food f = iter.next로 임시 객체에 할당을 받아서
	 * f.show()<- 기능이있다면? or toString()를 오버라이딩해서 구현하면 전체 출력이 될꺼같아
	 * 느낌오니?
	 * */
	public void addOrder() {
		try {
		System.out.print("음식명: ");
		String foodName = sc.nextLine();
		System.out.print("가격: ");
		int price = sc.nextInt();
		sc.nextLine();
		food.offer(new Food(foodName, price));
		//food.add(new Food(foodName, price));
		}catch (Exception e) {
			System.out.println("잘못 입력 했어요");
		}
	}

	public void processOrder() {
		
		stayOrder();
		if (food.size()!=0) {
			System.out.print("어떤 음식을 처리하겠소 : ");
			String foodName = sc.nextLine();
			for (int i = 0; i < food.size(); i++) {
				if(food.get(i).getFoodName().equals(foodName)){
					amount+=food.get(i).getPrice();
					food.remove(i);
					
				}
			}
			
		}
		
		
	}

	public void stayOrder() {
		if (food.size()==0) {
			System.out.println("주문이 없네.. 가게 망했다 ㅠㅜ");
			return;
		}
		for (Food f : food) {
			System.out.println(f.toString());
		}
		
	}

	public void amountOreder() {
		System.out.println("총액 : "+getAmount());
		
	}
	
	

}
