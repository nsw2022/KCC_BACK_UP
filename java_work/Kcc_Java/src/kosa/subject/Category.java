package kosa.subject;

import java.util.ArrayList;
import java.util.TreeMap;

public class Category {

	private String genre;
	private ArrayList<Game> games = new ArrayList<>();
	
	public Category() {}
	
	public Category(String genre) {
		this.genre = genre;
	}
	
	// 카테고리별 목록보기

	public void addGame(Game game) {
		games.add(game);
	}

	public ArrayList<Game> getGames() {
		return games;
	}
	

	@Override
	public String toString() {
		return "Category [genre=" + genre + ", games=" + games + "]";
	}

	public void addPlayer(Game game) {
		games.add(game);
		
	}

	
	

}
