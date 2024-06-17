package kosa.abc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Management {
	//��� �ʵ� ����
	private BufferedReader in;
	private int inputNum;
	private String name;
	private String memberNum;
	private String position;
	private String time;
	private Member s;
	private static final int MEMBER_NUM_LEN = 8;
	private static final int Time_NUM_LEN = 5;
	// ����Ʈ ������
	// �����, �޴� ���� ��ȣ, Member ��ü ����
	public Management(){
		in = new BufferedReader(new InputStreamReader(System.in));
		inputNum = 0;
		s = Member.genTo();
	}
	
	public int getInputNum() {
		return this.inputNum;
	}
	// �޴� ���� ��ȣ�� ������ ��ȯ
	public void setInputNum() throws IOException {
		this.inputNum = Integer.parseInt(in.readLine());
	}
	public String getName() {
		return this.name;
	}
	
	public void setName() throws IOException {
		this.name = in.readLine();
	}
	
	public String getMemberNum() {
		return this.memberNum;
	}
	// ��� �ڸ� �� �˻縦 ���� ���ǿ� �´� ���� �Է½� ���
	public void setMemberNum() throws IOException {
		while(true) {
			this.memberNum = in.readLine();
			if(this.memberNum.length() != MEMBER_NUM_LEN) {
				System.out.println("*����� " + MEMBER_NUM_LEN + "�ڸ� �Դϴ�.");
				System.out.println("*�ٽ��Է��� �ֽñ� �ٶ��ϴ�.");
				System.out.print("��� : ");
			} else {
				break;
			}
		}
	}
	public String getPosition() {
		return this.position;
	}

	public void setPosition() throws IOException {
		this.position = in.readLine();
	}
	
	
	public String getTime() {
		return this.time;
	}
	// �ð� �ڸ� �� �˻縦 ���� ���Ŀ� �´� ���� �Է½� ���
	public void setTime() throws IOException {
		while(true) {
			this.time = in.readLine();
			if (this.time.length() != Time_NUM_LEN) {
				System.out.println("*�ð��� ������ hh:mm �Դϴ�.");
				System.out.println("*���Ŀ� �°� �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
				System.out.print("�ð� : ");
			} else {
				break;
			}
		}
	}
	

public static void main(String[] args) {
	// Management ��ü ����
	Management m =new Management();
	
	while(true) {
		try {
			// �޴� ���
			printMenu();
			// �޴� ���� ��ȣ �Է¹ޱ�
			m.setInputNum();
			// ���ð��� ���� �б�
			switch(m.getInputNum()) {
			case 1:
				System.out.print("�̸� : ");
				m.setName();
				System.out.print("��� : ");
				m.setMemberNum();
				System.out.print("�ð�(hh:mm) : ");
				m.setTime();
				m.s.goWork(m.getName(), m.getMemberNum(), m.getTime());
				
				break;
			case 2:
				System.out.print("�̸� : ");
				m.setName();
				m.s.leaveWork(m.getName());
				
				break;
			case 3:
				System.out.print("�̸� : ");
				m.setName();
				m.s.checkGo(m.getName());
				break;
			case 4:
				m.s.printGo();
				break;
			case 5:
				System.out.print("�̸� : ");
				m.setName();
				System.out.print("��� : ");
				m.setMemberNum();
				System.out.print("��å : ");
				m.setPosition();
				m.s.addMember(m.getName(), m.getMemberNum(), m.getPosition());
				break;
			case 6:
				m.s.printMember();
				break;
			case 7:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			default:
				// 1~7�� �ƴ� �ٸ� ���� �Է½� ���� ������
				throw new Exception();
			}
			
			// ���ǿ� ���� �ʴ� ���ڸ� �Է½� ����ó���Ͽ� ����ϱ�
		} catch(Exception e){
			System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
			System.out.println("1 ~ 7 ������ ���ڸ� �Է��� �ּ���.");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}
		
	}

}
// �޴� ����
public static void printMenu() {
	System.out.println("==========�����������α׷�==========");
	System.out.println("1. ����ϱ�");
	System.out.println("2. ����ϱ�");
	System.out.println("3. ���Ȯ��");
	System.out.println("4. ����� Ȯ��");
	System.out.println("5. ������");
	System.out.println("6. �������Ʈ ����");
	System.out.println("7. ���α׷� ����");
	System.out.println("*���α׷� ����� ��� �����ʹ� �Ҹ�˴ϴ�.");
	System.out.println("��ȣ�Է� : ");
}




public static class  Member {
	// ��ϻ������Ʈ, ��ϻ���������Ʈ, ��ϻ����å����Ʈ, ������̸�����Ʈ, ����ڻ������Ʈ, ����ڽð�����Ʈ ����
	private ArrayList<String> nameList;
	private ArrayList<String> memberNumList;
	private ArrayList<String> positionList;
	private ArrayList<String> todayMem;
	private ArrayList<String> todayNum;
	private ArrayList<String> todayTime;
	private static Member memB;
	
	//����Ʈ ����, �ǹ̾���.
	private Member() {}
	
	//��ü�� �̱������� ����
	public static Member genTo() {
		if (memB == null) {
			memB = new Member();
			memB.nameList = new ArrayList<String>();
			memB.positionList = new ArrayList<String>();
			memB.todayMem = new ArrayList<String>();
			memB.memberNumList = new ArrayList<String>();
			memB.todayNum = new ArrayList<String>();
			memB.todayTime = new ArrayList<String>();
		}
		return memB;
	}
	// ��� ����Ʈ�� ����ϱ�
	public void addMember(String name, String memberNum, String position) {
		boolean Flag = true;
		// �������Ʈ�� ���� ����� ���� �� �ߴ�
		if (Member.memB.memberNumList.size() != 0) {
			for(int i = 0 ; i<Member.memB.memberNumList.size(); ++i) {
				if(memberNum.equals(Member.memB.memberNumList.get(i))) {
					System.out.println("*�̹� ��ϵ� ����Դϴ�.\n");
					Flag = false;
				}
			}
		}
		// �������Ʈ�� �̸�, ���, ��å ���
		if(Flag) {
			this.nameList.add(name);
			this.memberNumList.add(memberNum);
			this.positionList.add(position);
			System.out.println("\n����� �Ϸ�Ǿ����ϴ�.\n");
		}
	}
	// ��� ����Ʈ ����Ʈ �ϱ�
	public void printMember() {
		if(Member.memB.nameList.size() < 1) {
			System.out.println("*��ϵ� ����� �����ϴ�.");
			System.out.println("*��� ��� �� ��ȸ�Ͻñ� �ٶ��ϴ�.\n");
		} else {
			System.out.println("--------------- ��� ��� ---------------");
			for(int i = 0; i<Member.memB.nameList.size(); ++i) {
				System.out.println("* " + "�̸� : " + Member.memB.nameList.get(i) + ", "+ "��� : " + Member.memB.memberNumList.get(i) + ", "+ "��å : " + Member.memB.positionList.get(i));
			}
			// �̸�, ���, ��å ������ ����� ������� �����ϱ�
			System.out.println("--------------------------------------");
			System.out.println();
		}
	}
	// ��� ����Ʈ ���
	public void goWork(String name, String memberNum, String time) {
		boolean Flag = true;
		int count = 0;
		// ��� ����Ʈ�� ���� ����� ���� �� �ߴ�.
		if (Member.memB.todayNum.size() != 0) {
			for(int i = 0 ; i<Member.memB.todayNum.size(); ++i) {
				if(memberNum.equals(Member.memB.todayNum.get(i))) {
					System.out.println("*�̹� �⼮ó�� �Ǿ����ϴ�.\n");
					Flag = false;
				} 
			}
		}
		// �������Ʈ�� �Է��� ����� ���� �� �ߴ�.
		for(int i = 0; i<Member.memB.memberNumList.size(); ++i) {
			if(memberNum.equals(Member.memB.memberNumList.get(i))) {
				count ++;
			}
		}
		if (count == 0) {
			System.out.println("\n�������� �ȵǾ� �ִ� ��ȣ�Դϴ�. ��� �� �̿����ּ���.\n");
			Flag = false;
		}
		// �������Ʈ�� �̸�, ���, �ð� ���
		if(Flag) {
			this.todayMem.add(name);
			this.todayNum.add(memberNum);
			this.todayTime.add(time);
			System.out.println("\n���ó���� �Ϸ�Ǿ����ϴ�.\n");
		}
	}
	// ��� �ϱ�
	public void leaveWork(String name) {
		if(Member.memB.todayMem.size() != 0) {
			// �Է��� ��� �̸��� ���� �� ����
			for(int i = 0 ; i<Member.memB.todayMem.size(); ++i) {
				if(name.equals(Member.memB.todayMem.get(i))) {
					Member.memB.todayMem.remove(i);
					Member.memB.todayNum.remove(i);
					Member.memB.todayTime.remove(i);
					System.out.println("\n���ó���� �Ϸ�Ǿ����ϴ�.\n");
				}
			}
			//�Է��� ��� �̸��� ���� �� �ߴ�.
		}else {
			System.out.println("*�̹� ���ó���� �Ǿ����ϴ�.\n");
		}
	}
	// ����� Ȯ��
	public void checkGo(String name) {
		// �ӽ÷� 1000�̶�� ���� �־���. ���� ��� ���� 1000�� �� �� ���ܰ� ����.
		int k = 1000;
		// �Է��� �̸��� ����Ʈ�� ������ �̸��� �ϳ��� �ְ� �Ǹ� �ش� ����� ������ ���
		if(Member.memB.todayMem.size() != 0) {
			for(int i = 0 ; i<Member.memB.todayMem.size(); ++i) {
				if(name.equals(Member.memB.todayMem.get(i))) {
					k = i;
				}
			} 
			if(k != 1000) {
				System.out.println(Member.memB.todayMem.get(k) +"���� " + Member.memB.todayTime.get(k) + "�� ����Ͽ����ϴ�.\n");
			}else {
				System.out.println("* �ش� ����� ������� ���� �����Դϴ�.\n");
			}
		}
	}
	// ����ڸ���Ʈ ����ϱ�
	public void printGo() {
		// ������� �̸�, ���, ��� �ð��� ������� ����.
		if(Member.memB.todayMem.size() < 1) {
			System.out.println("���� ����ڰ� �����ϴ�.\n");
		} else {
			System.out.println("---------------����� ���---------------");
			System.out.println("�̸�       ���                   ��ٽð�");
			for(int i = 0; i<Member.memB.todayMem.size(); ++i) {
				System.out.println(Member.memB.todayMem.get(i) + "     " + Member.memB.todayNum.get(i) + "     "+ Member.memB.todayTime.get(i));
			}
		System.out.println("--------------------------------------");
		System.out.println();
		}
	}
	
}	
}