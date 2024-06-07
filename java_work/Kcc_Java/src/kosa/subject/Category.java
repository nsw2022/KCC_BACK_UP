package kosa.subject;


import java.util.TreeMap;

public class Category {
	
	private String genre;
	private TreeMap<String, Game> gameMap;
	private Game game;

	public Category(String genre, TreeMap<String, Game> gameMap) {
		super();
		this.genre = genre;
		this.gameMap = gameMap;
	}

	

	public Category(Game game) {
		super();
		this.game = game;
	}



	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public TreeMap<String, Game> getGameMap() {
		return gameMap;
	}

	public void setGameMap(TreeMap<String, Game> gameMap) {
		this.gameMap = gameMap;
	}

	@Override
	public String toString() {
		return "Category [genre=" + genre + ", gameMap=" + gameMap + ", game=" + game + "]";
	}
	
	
}
