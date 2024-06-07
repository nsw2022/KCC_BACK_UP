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
	 * iter.next�� ���� ������ ����������
	 * iter.next�� �����°�� Food ��ü�� ���������� ����������
	 * �׷��� Food f = iter.next�� �ӽ� ��ü�� �Ҵ��� �޾Ƽ�
	 * f.show()<- ������ִٸ�? or toString()�� �������̵��ؼ� �����ϸ� ��ü ����� �ɲ�����
	 * ��������?
	 * */
	public void addOrder() {
		try {
		System.out.print("���ĸ�: ");
		String foodName = sc.nextLine();
		System.out.print("����: ");
		int price = sc.nextInt();
		sc.nextLine();
		food.offer(new Food(foodName, price));
		//food.add(new Food(foodName, price));
		}catch (Exception e) {
			System.out.println("�߸� �Է� �߾��");
		}
	}

	public void processOrder() {
		
		stayOrder();
		if (food.size()!=0) {
			System.out.print("� ������ ó���ϰڼ� : ");
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
			System.out.println("�ֹ��� ����.. ���� ���ߴ� �Ф�");
			return;
		}
		for (Food f : food) {
			System.out.println(f.toString());
		}
		
	}

	public void amountOreder() {
		System.out.println("�Ѿ� : "+getAmount());
		
	}
	
	

}
