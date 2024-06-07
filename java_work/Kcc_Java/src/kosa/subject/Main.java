package kosa.subject;

import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Order order = new Order();
//		for (Entry<String, Category> entry : order.getLinkedHashMap().entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue().getGameMap());
//		}
		Set<String> keys = order.getLinkedHashMap().keySet();
		for (String key : keys) {
			System.out.println(key);
			Game game=order.getLinkedHashMap().get(key).getGameMap().get("Çï´ÙÀÌ¹öÁî");
			System.out.println(game.toString());
			
		}

//		Set<String> keys = order.getLinkedHashMap().keySet();
//		for (String key : keys) {
//			System.out.println(key);
//			Category category = order.getLinkedHashMap().get(key);
//			if (category != null) {
//				for (Entry<String, Game> gameEntry : category.getGameMap().entrySet()) {
//					System.out.println(gameEntry.getKey() + " : " + gameEntry.getValue());
//				}
//			}
//		}

	}

}
