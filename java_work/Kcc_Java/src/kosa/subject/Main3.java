package kosa.subject;

public class Main3 {
	public static void main(String[] args) {
		ShoppingMall mall = new ShoppingMall();

		Person p1 = new Person("김지훈", 1);
		Category c1 = new Category("RPG");
		c1.addGame(new Game("던전앤파이터", "액션쾌감", 1_000_000));

		mall.addOrder(p1.getUserId(), c1);

		Person p2 = new Person("김동현", 2);
		Category c2 = new Category("RPG");
		c2.addGame(new Game("메이플스토리", "제일 좋아하는 단풍잎 게임", 2_000_000));

		mall.addOrder(p2.getUserId(), c2);

		mall.printOrders();
	}
}
