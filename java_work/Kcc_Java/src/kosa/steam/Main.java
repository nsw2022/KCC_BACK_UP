package kosa.steam;

public class Main {
	
	public static void main(String[] args) {

		GameList[] gameLists = {
				new GameList("��ƺ��3", "RPG", 20_000),
				new GameList("������", "RPG", 30_000),
				new GameList("�ͽ�����", "����", 10_000),
				new GameList("���̹���ũ", "RPG", 60_000),
				new GameList("���̳� ��Ÿ��", "��Ÿ��", 0)
		};
		
		ShopingList shoopingList = new ShopingList();
		for (GameList gameList : gameLists) {
			shoopingList.addGame(gameList);
		}
		
		User user = new User("�¿�",shoopingList);
		user.allPrice();
		user.searchGame();
		user.deleteGame();
		user.allPrice();
		
	}
	
}
