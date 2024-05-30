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

	// �˻�
	public void searchGame() {
		System.out.print("�˻��� ���� ������ �Է� �� �ּ���: ");
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

	// ����
	public void deleteGame() {
		System.out.print("������ ���� ������ �Է� �� �ּ���: ");
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

	// ���� ���
	public int allPrice() {

		for (int i = 0; i < shopingList.getGameLists().length; i++) {
			if (shopingList.getGameLists() != null) {

			}

		}
		return shopingList.allPrice();
	}

}
