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
		int laborerId = Console.inNum("������ID�� �Է��ϼ���.");
		if (laborerId != 0) {
			try {
				laborerService.delLaborer(laborerId);
				Console.info("�����ڸ� �����߽��ϴ�.");
			} catch (Exception e) {
				Console.err(e.getMessage());
			}
		}else {
			Console.info("���� ����մϴ�.");
		}
		
	}

	private void fixLAborer() {
		int laborerId = Console.inNum("������ID�� �Է��ϼ���. ");
		if(laborerId != 0) {
			String laborerName = Console.inStr("�����ڸ��� �Է��ϼ���.", 5);
			LocalDate hireDate = Console.inDate("�Ի����� �Է��ϼ���.");
			try {
				laborerService.fixLaborer(new Laborer(laborerId, laborerName, hireDate));
				Console.info("�����ڸ� �����߽��ϴ�.");
			} catch (Exception e) {
				Console.err(e.getMessage());
			}
		}else {
			Console.info("���� ����մϴ�.");
		}
		
	}

	private void addLaborer() {
		String laborerName = Console.inStr("�����ڸ��� �Է��ϼ���", 5);
		if (!laborerName.equals("0")) {
			LocalDate hireDate = Console.inDate("�Ի����� �Է��ϼ���.");
			laborerService.addLaborer(laborerName, hireDate);
			Console.info("�����ڸ� �߰��߽��ϴ�.");
			
		}else {
			Console.info("�߰� ����մϴ�.");
		}
	}

	private void listLaborers() {
		List<Laborer> laborers = laborerService.getLaborers();
		System.out.println("ID �̸� \t�Ի���");
		System.out.println("=================");
		if (!laborers.isEmpty()) laborers.forEach(Console::info);
		else Console.info("�����ڰ� �����ϴ�.");
		
	}

	private Job choose() {
		int choice = 0;
		boolean isGood = false;
		do {
			choice = Console.inNum(menu);
			if(choice < 0||choice>Job.length() -1 ) Console.err("�޴� ��ȣ�� �Է��ϼ���.");
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
