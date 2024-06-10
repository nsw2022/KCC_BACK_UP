package kosa.subject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ShoppingMall {
	private Map<String, ArrayList<Order>> orderList = new HashMap<>(); // ����ں� �ֹ� ���
	private int amount; // �� ����
	private Person person;
	private Order order = new Order();
	private ArrayList<Game> addUserGame = new ArrayList<Game>();

	public ShoppingMall() {
		this.orderList = new HashMap<>();
		this.amount = 0;
		person = new Person();
	}

	public void personalOrder() {

		while (true) {

			System.out.println("1.���� ��Ϻ��� 2.��ٱ��Ͽ� ��� 3.���ֹ����� 4.�ֹ������ϱ�  5.���� 6.����ȭ��");
			System.out.print("�Է� : ");
			String menu = DataInput.sc.nextLine();
			switch (menu) {
			case "1":
				System.out.println("�帣�� �����ϼ���");
				System.out.println("1.RPG  2.Horror  3.FPS");
				System.out.print("�Է�: ");
				String userInput = DataInput.sc.nextLine();
				printGenre(userInput);
				break;

			case "2":
				System.out.println("��ٱ��Ͽ� ���� ������ �Է��ϼ���");
				System.out.println("�Է�: ");
				String addGame = DataInput.sc.nextLine();
				Set<String> keys = order.getOrderMap().keySet();
				Iterator<String> iter = keys.iterator();
				// value ��ȣ ���ֱ�

				while (iter.hasNext()) {
					String key = iter.next();
					// od.getOrderMap().get(key).get(0).getGames().get(0).getGamePrice();
					ArrayList<Category> categories = order.getOrderMap().get(key);
//					System.out.println("�ֹ���: " + key);
//					System.out
//							.println("�帣: " + order.getOrderMap().get(key).toString().replaceAll("\\[", "").replaceAll("\\]", ""));

					for (Category category : categories) {

						for (Game game : category.getGames()) {
							if (game.getGameName().equals(addGame)) {
								// System.out.println("�̺�Ʈ �׽�Ʈ");
								addUserGame.add(game);
								System.out.println(game.toString());
							}

						}

					}

				}

				break;

			case "3":
				for (Game userGame : addUserGame)
					System.out.println(userGame);

				break;

			case "4":
				System.out.println("�ֹ� ����� ������ �Է����ּ���");
				System.out.print("�Է� : ");
				String removeGame = DataInput.sc.nextLine();
				removeGameFromCart(removeGame);
				break;

			case "5":
				// List���ִ� �ֵ� clear �ϱ����� ������ Stream����
				payAll();
				addUserGame.clear();
				break;
			case "6":

				return;

			default:
				break;
			}

		}
	}

	// ����
	private void payAll() {
		addUserGame.stream().mapToInt(p -> p.getGamePrice()).forEach(price -> amount += price);
		System.out.println("�� �����ݾ� : " + amount);
	}

	public void removeGameFromCart(String gameName) {
		Iterator<Game> iterator = addUserGame.iterator();
		boolean found = false;
		while (iterator.hasNext()) {
			Game game = iterator.next();
			if (game.getGameName().equals(gameName)) {
				iterator.remove();
				System.out.println(gameName + " ������ ��ٱ��Ͽ��� �����Ǿ����ϴ�.");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("��ٱ��Ͽ� " + gameName + " ������ �����ϴ�.");
		}
	}

	// ����ī�װ��� 1,2,3 ����
	public void printGenre(String userInput) {
		String[] arr = { "RPG", "Horror", "FPS" };

		String genre = arr[Integer.parseInt(userInput) - 1];
		System.out.println("genre" + genre);
		ArrayList<Category> categories = order.getOrderMap().get(genre);
		for (Category category : categories) {
			System.out.println(category);
		}

	}

	// ����ֹ�����
	public void printOrders() {
		System.out.println("��� �ֹ� ����:");
//        for (Map.Entry<String, ArrayList<Order>> entry : orderList.entrySet()) {
//        	
//        	
//            System.out.println("�� �̸�: " + entry.getKey() + ", �ֹ� ����: " + entry.getValue());
//        	
//        }
		Set<String> keys = order.getOrderMap().keySet();
		Iterator<String> iter = keys.iterator();
		// value ��ȣ ���ֱ�

		while (iter.hasNext()) {
			String key = iter.next();
			// od.getOrderMap().get(key).get(0).getGames().get(0).getGamePrice();
			ArrayList<Category> categories = order.getOrderMap().get(key);
			System.out.println("�ֹ���: " + key);
			System.out.println(
					"�帣: " + order.getOrderMap().get(key).toString().replaceAll("\\[", "").replaceAll("\\]", ""));

			for (Category category : categories) {

				for (Game game : category.getGames()) {

					amount += game.getGamePrice();
				}

			}
			System.out.println(amount);
			System.out.println("==================================");
			amount = 0;

		}
	}

	public void lowerPrintOrders() {
		Order o = new Order();
		List<Game> sortredGames = o.getOrderMap().values().stream()
				
				.flatMap(category -> category.stream())
				.flatMap(game -> game.getGames().stream())
				.sorted(Comparator.comparingInt(Game::getGamePrice))
				.collect(Collectors.toList());

		sortredGames.forEach(System.out::println);
		System.out.println(sortredGames.size());

	}

	// ��ǰ�ֹ��ϱ�
	public void addOrder(String userId, Order order) {
		this.orderList.computeIfAbsent(userId, k -> new ArrayList<>()).add(order);
	}

	// ���� �ֹ����� �Ƹ� �츮 �˻����ó�� �����ؾ����� ����

	public Map<String, ArrayList<Order>> getOrderList() {
		return orderList;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void setOrderList(Map<String, ArrayList<Order>> orderList) {
		this.orderList = orderList;
	}

}
