package kosa.subject;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Order {
    private LinkedHashMap<String, Category> linkedHashMap = new LinkedHashMap<>();
    private Date date;
    private TreeMap<String, Game> gameMap = new TreeMap<>();

    public Order() {
        initializeGames();
        linkedHashMap.put("��¿�", new Category(gameMap.get("FPS")));
    }
	
	
	public Order(TreeMap<String, Game> gameMap) {
        super();
        this.gameMap = gameMap;
        linkedHashMap.put("��¿�", new Category(gameMap.get("FPS")));
    }


	private void initializeGames() {
		
		gameMap.put("FPS", new Game("����̹���", "���� ����� ž�ٿ� ���� ����", 64_000));
        gameMap.put("FPS", new Game("GTFO", "����ũ�� �߿��� ���� ���� ����", 60_000));
        gameMap.put("FPS", new Game("����Ʈ4����", "���� ����Į���� ���� ����", 12_000));
        gameMap.put("FPS", new Game("�ݿ����Ƽ", "�������� ������ �ٷ� �и��͸� FPS ����", 80_000));
        gameMap.put("FPS", new Game("��Ʋ�׶���", "��Ը� ��Ʋ�ξ� ����", 32_000));
        
        gameMap.put("Horror", new Game("�Ľ��������", "���ڿ��� Ȱ���� �����ϴ� ���� ����", 33_000));
        gameMap.put("Horror", new Game("DEVOUR", "�Ƿ��� ��ġ�ϴ� ������ ���� ����", 5_000));
        gameMap.put("Horror", new Game("�̺�����", "���� ���� �帣�� ����", 25_000));
        gameMap.put("Horror", new Game("�����÷���Ÿ��2", "������ ���� ��Ұ� ���յ� ����", 25_000));
        gameMap.put("Horror", new Game("�ϳ׽þ�", "����� ���� ���ΰ��� �޴� ���� ����", 15_000));
        
        gameMap.put("RPG", new Game("���̹���ũ2077", "�̷� ���ø� ������� �� ���� ���� RPG", 72_000));
        gameMap.put("RPG", new Game("����3", "��Ȱ�� ���迡�� �������� ��Ÿ�� RPG", 32_000));
        gameMap.put("RPG", new Game("�巡����׸�2", "���� ��Ÿ�� ��Ÿ���� �׼� RPG", 98_000));
        gameMap.put("RPG", new Game("�������Ϳ���", "���͸� ����ϴ� �׼� RPG", 62_000));
        gameMap.put("RPG", new Game("���縵", "���� ����� ��ũ ��Ÿ���� ���յ� RPG", 70_000));
    }


	public LinkedHashMap<String, Category> getLinkedHashMap() {
		return linkedHashMap;
	}


	public void setLinkedHashMap(LinkedHashMap<String, Category> linkedHashMap) {
		this.linkedHashMap = linkedHashMap;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public TreeMap<String, Game> getGameMap() {
		return gameMap;
	}


	public void setGameMap(TreeMap<String, Game> gameMap) {
		this.gameMap = gameMap;
	}


	@Override
	public String toString() {
		return "Order [linkedHashMap=" + linkedHashMap + ", date=" + date + ", gameMap=" + gameMap + "]";
	}
	
	
}
