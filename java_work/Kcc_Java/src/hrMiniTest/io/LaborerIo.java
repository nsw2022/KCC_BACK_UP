package hrMiniTest.io;

import java.time.LocalDate;
import java.util.List;

import hrMiniTest.domain.Laborer;
import hrMiniTest.service.LaborerService;

public class LaborerIo {
	private LaborerService laborerService;
	private String menu;
	
	public LaborerIo() {}

	public LaborerIo(LaborerService laborerService) {
		super();
		this.laborerService = laborerService;
		this.menu = Job.labels();
	}
	
	public void play() {
		Job job = null;
		while( (job = choose()) != Job.EXIT) {
			switch (job) {
			case LIST:
				listLaborers();
			break;
			
			case ADD :
				addLaborer();
			break;
			
			case FIX :
				fixLAborer();
			break;
			
			case DEL:
				delLaborer();
			break;
			
			}
		}
	}

	private void delLaborer() {
		int laborerId = Console.inNum("구직자ID를 입력하세요.");
		if (laborerId != 0) {
			try {
				laborerService.delLaborer(laborerId);
				Console.info("구직자를 삭제했습니다.");
			} catch (Exception e) {
				Console.err(e.getMessage());
			}
		}else {
			Console.info("삭제 취소합니다.");
		}
		
	}

	private void fixLAborer() {
		int laborerId = Console.inNum("구직자ID를 입력하세요. ");
		if(laborerId != 0) {
			String laborerName = Console.inStr("구직자명을 입력하세요.", 5);
			LocalDate hireDate = Console.inDate("입사일을 입력하세요.");
			try {
				laborerService.fixLaborer(new Laborer(laborerId, laborerName, hireDate));
				Console.info("구직자를 수정했습니다.");
			} catch (Exception e) {
				Console.err(e.getMessage());
			}
		}else {
			Console.info("수정 취소합니다.");
		}
		
	}

	private void addLaborer() {
		String laborerName = Console.inStr("구직자명을 입력하세요", 5);
		if (!laborerName.equals("0")) {
			LocalDate hireDate = Console.inDate("입사일을 입력하세요.");
			laborerService.addLaborer(laborerName, hireDate);
			Console.info("구직자를 추가했습니다.");
			
		}else {
			Console.info("추가 취소합니다.");
		}
	}

	private void listLaborers() {
		List<Laborer> laborers = laborerService.getLaborers();
		System.out.println("ID 이름 \t입사일");
		System.out.println("=================");
		if (!laborers.isEmpty()) laborers.forEach(Console::info);
		else Console.info("구직자가 없습니다.");
		
	}

	private Job choose() {
		int choice = 0;
		boolean isGood = false;
		do {
			choice = Console.inNum(menu);
			if(choice < 0||choice>Job.length() -1 ) Console.err("메뉴 번호를 입력하세요.");
			else isGood = true;
		} while (!isGood);
		return Job.valueOf(choice);
	}

	public LaborerService getLaborerService() {
		return laborerService;
	}

	public void setLaborerService(LaborerService laborerService) {
		this.laborerService = laborerService;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	
	
}
