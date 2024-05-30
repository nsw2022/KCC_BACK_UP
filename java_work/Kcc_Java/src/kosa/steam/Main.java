package kosa.steam;

public class Main {
	
	public static void main(String[] args) {

		GameList[] gameLists = {
				new GameList("디아블로3", "RPG", 20_000),
				new GameList("메이플", "RPG", 30_000),
				new GameList("귀신의집", "공포", 10_000),
				new GameList("사이버펑크", "RPG", 60_000),
				new GameList("파이널 판타지", "판타지", 0)
		};
		
		ShopingList shoopingList = new ShopingList();
		for (GameList gameList : gameLists) {
			shoopingList.addGame(gameList);
		}
		
		User user = new User("승우",shoopingList);
		user.allPrice();
		user.searchGame();
		user.deleteGame();
		user.allPrice();
		
	}
	
}
