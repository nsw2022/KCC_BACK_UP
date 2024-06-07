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
        linkedHashMap.put("노승우", new Category(gameMap.get("FPS")));
    }
	
	
	public Order(TreeMap<String, Game> gameMap) {
        super();
        this.gameMap = gameMap;
        linkedHashMap.put("노승우", new Category(gameMap.get("FPS")));
    }


	private void initializeGames() {
		
		gameMap.put("FPS", new Game("헬다이버즈", "협력 기반의 탑다운 슈팅 게임", 64_000));
        gameMap.put("FPS", new Game("GTFO", "팀워크가 중요한 공포 생존 게임", 60_000));
        gameMap.put("FPS", new Game("래프트4데드", "좀비 아포칼립스 생존 게임", 12_000));
        gameMap.put("FPS", new Game("콜오브듀티", "현실적인 전투를 다룬 밀리터리 FPS 게임", 80_000));
        gameMap.put("FPS", new Game("배틀그라운드", "대규모 배틀로얄 게임", 32_000));
        
        gameMap.put("Horror", new Game("파스모포비아", "초자연적 활동을 조사하는 공포 게임", 33_000));
        gameMap.put("Horror", new Game("DEVOUR", "악령을 퇴치하는 협력형 공포 게임", 5_000));
        gameMap.put("Horror", new Game("이블위딘", "생존 공포 장르의 게임", 25_000));
        gameMap.put("Horror", new Game("파피플레이타임2", "공포와 퍼즐 요소가 결합된 게임", 25_000));
        gameMap.put("Horror", new Game("암네시아", "기억을 잃은 주인공이 겪는 공포 게임", 15_000));
        
        gameMap.put("RPG", new Game("사이버펑크2077", "미래 도시를 배경으로 한 오픈 월드 RPG", 72_000));
        gameMap.put("RPG", new Game("위쳐3", "광활한 세계에서 펼쳐지는 판타지 RPG", 32_000));
        gameMap.put("RPG", new Game("드래곤즈도그마2", "고전 판타지 스타일의 액션 RPG", 98_000));
        gameMap.put("RPG", new Game("몬스터헌터월드", "몬스터를 사냥하는 액션 RPG", 62_000));
        gameMap.put("RPG", new Game("엘든링", "오픈 월드와 다크 판타지가 결합된 RPG", 70_000));
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
