package kosa.steam;

import java.util.Scanner;

public class User {
	private String id;
	private ShopingList shopingList;
	private Scanner sc;

	public User() {
	}

	public User(String id, ShopingList shopingList) {
		super();
		this.id = id;
		this.shopingList = shopingList;
		sc = new Scanner(System.in);
	}

	// 검색
	public void searchGame() {
		System.out.print("검색할 게임 제목을 입력 해 주세요: ");
		String search = sc.nextLine();

		// System.out.println(shopingList.getGameList()[0].getGameName());
		for (int i = 0; i < 9; i++) {
			if (shopingList.getGameList()[i] != null) {
				if (shopingList.getGameList()[i].getGameName().indexOf(search) != -1) {
					shopingList.getGameList()[i].gameInfo();
				}
			}
		}
	}

	// 삭제
	public void deleteGame() {
		System.out.print("삭제할 게임 제목을 입력 해 주세요: ");
		String search = sc.nextLine();
		for (int i = 0; i < 9; i++) {
			if (shopingList.getGameList()[i] != null) {
				if (shopingList.getGameList()[i].getGameName().indexOf(search) != -1) {
					shopingList.getGameList()[i].setGameGere("");
				}
				shopingList.getGameList()[i].setGameName("");
				shopingList.getGameList()[i].setGamePrice(0);

			}
		}
	}

	// 가격 출력
	public int allPrice() {

		for (int i = 0; i < shopingList.getGameLists().length; i++) {
			if (shopingList.getGameLists() != null) {

			}

		}
		return shopingList.allPrice();
	}

}
