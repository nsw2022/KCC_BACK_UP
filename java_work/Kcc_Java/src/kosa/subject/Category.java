package kosa.subject;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	 
	
	@Override
	public String toString() {
//		String arr_toString = Arrays.to(games);
//		String repl = arr_toString.replaceAll("\\[","").replaceAll("\\]","");
		
		String listToString = games.toString();
        String withoutBrackets = listToString.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "");
		return genre+"\n" + withoutBrackets;
	}

	public void addPlayer(Game game) {
		games.add(game);
		
	}

	
	

}
