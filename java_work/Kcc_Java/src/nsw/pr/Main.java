package nsw.pr;

public class Main {
	
	public static void main(String[] args) {
		
		PhoneManagerPr pmp = new PhoneManagerPr();
		
		while (true) {
			System.out.println("��ȭ��ȣ�� : �̸�. ��ȭ��ȣ, �������, �Ѹ��� ��ȭ ������ ���");
			System.out.println(">1.�߰� 2.��ü��� 3.�˻� 4.���� 5.���� 6.����");
			System.out.println(">�޴� �Է�: ");
			String menu = DataInput.sc.nextLine();
			switch (menu) {
			case "1":
				pmp.addPhoneInfo();
				break;
				
			case "2":
				pmp.listPhoneInfo();
				break;
				
			case "3":
				pmp.searchPhonInfo();
				break;
				
			case "4":
				pmp.updatePhoneInfo();
				break;
				
			case "5":
				pmp.deletePhoneInfo();
				break;
				
			case "6":
				System.out.println("���α׷� ����");
				break;

			default:
				System.out.println("�߸��Է��ϸ� ��Ӹ�");
				break;
			}
		}
		
	}
	
}
