package kosa.steam;

public class GameList {
	
	private String gameName, gameGere;
	private int gamePrice;
	
	public GameList() {}

	public GameList(String gameName, String gameGere, int gamePrice) {
		super();
		this.gameName = gameName;
		this.gameGere = gameGere;
		this.gamePrice = gamePrice;
	}

	public void gameInfo() {
		System.out.println("게임 이름 : "+gameName);
		System.out.println("게임 장르 : "+gameGere);
		System.out.println("게임 가격 : "+gamePrice);
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameGere() {
		return gameGere;
	}

	public void setGameGere(String gameGere) {
		this.gameGere = gameGere;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	

}
