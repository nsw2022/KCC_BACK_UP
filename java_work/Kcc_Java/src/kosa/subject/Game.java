package kosa.subject;

public class Game {
	private String gameName, gameInfo;
	private int gamePrice;
	
	public Game() {}

	

	public Game(String gameName, String gameInfo,  int gamePrice) {
		super();
		this.gameName = gameName;
		this.gameInfo = gameInfo;
		
		this.gamePrice = gamePrice;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameInfo() {
		return gameInfo;
	}
	
	public void setGameInfo(String gameInfo) {
		this.gameInfo = gameInfo;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}



	@Override
	public String toString() {
		return "Game [gameName=" + gameName + ", gameInfo=" + gameInfo + ", gamePrice=" + gamePrice + "]";
	}
	
	
}
