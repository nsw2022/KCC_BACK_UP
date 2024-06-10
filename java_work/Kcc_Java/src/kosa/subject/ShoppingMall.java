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
	private Map<String, ArrayList<Order>> orderList = new HashMap<>(); // 사용자별 주문 목록
	private int amount; // 총 가격
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

			System.out.println("1.게임 목록보기 2.장바구니에 담기 3.내주문보기 4.주문삭제하기  5.결제 6.이전화면");
			System.out.print("입력 : ");
			String menu = DataInput.sc.nextLine();
			switch (menu) {
			case "1":
				System.out.println("장르를 선택하세요");
				System.out.println("1.RPG  2.Horror  3.FPS");
				System.out.print("입력: ");
				String userInput = DataInput.sc.nextLine();
				printGenre(userInput);
				break;

			case "2":
				System.out.println("장바구니에 담을 게임을 입력하세요");
				System.out.println("입력: ");
				String addGame = DataInput.sc.nextLine();
				Set<String> keys = order.getOrderMap().keySet();
				Iterator<String> iter = keys.iterator();
				// value 괄호 없애기

				while (iter.hasNext()) {
					String key = iter.next();
					// od.getOrderMap().get(key).get(0).getGames().get(0).getGamePrice();
					ArrayList<Category> categories = order.getOrderMap().get(key);
//					System.out.println("주문자: " + key);
//					System.out
//							.println("장르: " + order.getOrderMap().get(key).toString().replaceAll("\\[", "").replaceAll("\\]", ""));

					for (Category category : categories) {

						for (Game game : category.getGames()) {
							if (game.getGameName().equals(addGame)) {
								// System.out.println("이벤트 테스트");
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
				System.out.println("주문 취소할 게임을 입력해주세요");
				System.out.print("입력 : ");
				String removeGame = DataInput.sc.nextLine();
				removeGameFromCart(removeGame);
				break;

			case "5":
				// List에있는 애들 clear 하기전에 더하자 Stream으로
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

	// 결제
	private void payAll() {
		addUserGame.stream().mapToInt(p -> p.getGamePrice()).forEach(price -> amount += price);
		System.out.println("총 결제금액 : " + amount);
	}

	public void removeGameFromCart(String gameName) {
		Iterator<Game> iterator = addUserGame.iterator();
		boolean found = false;
		while (iterator.hasNext()) {
			Game game = iterator.next();
			if (game.getGameName().equals(gameName)) {
				iterator.remove();
				System.out.println(gameName + " 게임이 장바구니에서 삭제되었습니다.");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("장바구니에 " + gameName + " 게임이 없습니다.");
		}
	}

	// 게임카테고리별 1,2,3 보기
	public void printGenre(String userInput) {
		String[] arr = { "RPG", "Horror", "FPS" };

		String genre = arr[Integer.parseInt(userInput) - 1];
		System.out.println("genre" + genre);
		ArrayList<Category> categories = order.getOrderMap().get(genre);
		for (Category category : categories) {
			System.out.println(category);
		}

	}

	// 모든주문내역
	public void printOrders() {
		System.out.println("모든 주문 내역:");
//        for (Map.Entry<String, ArrayList<Order>> entry : orderList.entrySet()) {
//        	
//        	
//            System.out.println("고객 이름: " + entry.getKey() + ", 주문 내역: " + entry.getValue());
//        	
//        }
		Set<String> keys = order.getOrderMap().keySet();
		Iterator<String> iter = keys.iterator();
		// value 괄호 없애기

		while (iter.hasNext()) {
			String key = iter.next();
			// od.getOrderMap().get(key).get(0).getGames().get(0).getGamePrice();
			ArrayList<Category> categories = order.getOrderMap().get(key);
			System.out.println("주문자: " + key);
			System.out.println(
					"장르: " + order.getOrderMap().get(key).toString().replaceAll("\\[", "").replaceAll("\\]", ""));

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

	// 상품주문하기
	public void addOrder(String userId, Order order) {
		this.orderList.computeIfAbsent(userId, k -> new ArrayList<>()).add(order);
	}

	// 개별 주문보기 아마 우리 검색기능처럼 구현해야할지 싶음

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
