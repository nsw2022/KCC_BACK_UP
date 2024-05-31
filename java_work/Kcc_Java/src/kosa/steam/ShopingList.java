package kosa.steam;

public class ShopingList {
	private GameList[] gameLists ;
	private int allPrice;
	private int count;

	public ShopingList() {
		super();
		gameLists = new GameList[10];
	}
	
	public int allPrice() {
		for (int i = 0; i < count; i++) {
			if (gameLists != null) {
				allPrice += gameLists[i].getGamePrice();
				
			}
		}
		System.out.println("ÃÑÇÕÀº: " + allPrice);
		return allPrice;
	}
	public void addGame(GameList gameList) {
		gameLists[count++] = gameList;
//		System.out.println(count);
//		System.out.println(Arrays.toString(gameLists));
	}

	public GameList[] getGameList() {
		return gameLists;
	}

	public void setGameList(GameList[] gameList) {
		this.gameLists = gameList;
	}

	public GameList[] getGameLists() {
		return gameLists;
	}

	public void setGameLists(GameList[] gameLists) {
		this.gameLists = gameLists;
	}

	public int getAllPrice() {
		return allPrice;
	}

	public void setAllPrice(int allPrice) {
		this.allPrice = allPrice;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
		
}
