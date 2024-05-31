package kosa.phone;

// ��ȭ��ȣ ���� �������� ���
public class TeacherManager {
	private TeacherPhone arr[];
	// private Scanner sc;

	private int count;

	public TeacherManager() {
		arr = new TeacherPhone[10];
		// sc = new Scanner(System.in);
	}
	
	public void addPhoneInfo() {
	    System.out.print("1.�Ϲ� 2.ȸ�� 3.��â: ");
	    String flag = DataInput.sc.nextLine();

	    while (true) {
	        String[] basicInfo = result(); // �̸�, ��ȭ��ȣ, ��������� �� ���� �Է¹���
	        if (basicInfo == null || basicInfo.length < 3) {
	            System.out.println("�Է� ������ �����մϴ�. �ٽ� �Է��ϼ���.");
	            continue;
	        }

	        switch (flag) {
	            case "1":
	                arr[count++] = new TeacherPhone(basicInfo[0], basicInfo[1], basicInfo[2]);
	                return;

	            case "2":
	                System.out.print("�μ�: ");
	                String dept = DataInput.sc.nextLine();
	                System.out.print("��å: ");
	                String position = DataInput.sc.nextLine();
	                arr[count++] = new Company(basicInfo[0], basicInfo[1], basicInfo[2], dept, position);
	                return;

	            case "3":
	                System.out.print("����: ");
	                String major = DataInput.sc.nextLine();
	                System.out.print("�г�: ");
	                String year = DataInput.sc.nextLine();
	                arr[count++] = new Universe(basicInfo[0], basicInfo[1], basicInfo[2], major, year);
	                return;

	            default:
	                System.out.println("�߸��� �����Դϴ�. 1, 2, �Ǵ� 3�� �Է����ּ���.");
	                flag = DataInput.sc.nextLine();
	                break;
	        }
	    }
	}

	private String[] result() {
	    System.out.print("�̸�: ");
	    String name = DataInput.sc.nextLine();
	    System.out.print("��ȭ��ȣ: ");
	    String phone = DataInput.sc.nextLine();
	    System.out.print("�������: ");
	    String birthdate = DataInput.sc.nextLine();
	    return new String[]{name, phone, birthdate};
	}


	public void listPhoneInfo() {
		System.out.print("1.�Ϲ� 2.ȸ�� 3.��â");
		String flag = DataInput.sc.nextLine();
		for (int i = 0; i < count; i++) {
			
			if (flag.equals("1")  && !(arr[i] instanceof Company) &&(!(arr[i] instanceof Universe))) {
				arr[i].show();
			} else if (flag.equals("2") && arr[i] instanceof Company) {
				arr[i].show();
			} else if (flag.equals("3") && arr[i] instanceof Universe) {
				arr[i].show();
			}

		}
	}

	public void searchPhoneInfo() {
//		System.out.println("�˻��� �̸�: ");
//		String search = sc.nextLine();
//		for (int i = 0; i < count; i++) {
//			if (arr[i].getName().indexOf(search)!=-1) {
//				arr[i].show();
//			}
//		}
		// �˻��ϰ����ϴ� �̸����� 1���� PhoneInfo ��ü�� ������ ����Ѵ�

		int idx = -1;
		System.out.print("1.�Ϲ� 2.ȸ�� 3.��â");
		String flag = DataInput.sc.nextLine();
		System.out.print("�̸�: ");
		String name = DataInput.sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (arr[i].getName().indexOf(name) != -1) {
				if (flag.equals("1") && arr[i] instanceof TeacherPhone) {
					arr[i].show();
					idx = i;
				} else if (flag.equals("2") && arr[i] instanceof Company) {
					arr[i].show();
					idx = i;
				} else if (flag.equals("3") && arr[i] instanceof Universe) {
					arr[i].show();
					idx = i;
				}
			}
		}
		if (idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}

	public void updatePhoneInfo() {
		// �̸��� �Է� => �ش� phoneInfo ���� => ���� ��ȭ��ȣ �Է� => ��ȭ��ȣ ������ �Ϸ�

		int idx = -1;

		System.out.print("������ �̸�: ");
		String name = DataInput.sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				arr[i].show();
				idx = i;
				System.out.println("������ ���� �Է�");
				// PhoneInfo��ü�� �����ؼ� �迭�� �߰��ϴ� ��
				System.out.println("�̸�: ");
				name = DataInput.sc.nextLine();
				System.out.println("��ȭ��ȣ: ");
				String phoneNo = DataInput.sc.nextLine();
				System.out.println("�������: ");
				String birth = DataInput.sc.nextLine();

				arr[i].setName(name);
				arr[i].setPhoneNo(phoneNo);
				arr[i].setBirth(birth);
				System.out.println("*****�����Ϸ�*****");
				arr[i].show();
			}
		}
		if (idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		}

	}

	public void deletePhoneInfo() {
		// �̸� �Է� => ��� ��ü �˻� => �ε��� ã�� => �ش� ��ü ���� (���Ŀ� index �����)
		int idx = -1;

		System.out.print("������ �̸�: ");
		String name = DataInput.sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				// 1. �ش��°�� �������� ��Ҹ� null �ٲ�
				// 2. �ڿ���Ҹ� %�� ����
				/*
				 * i=0 // (0+1)%count => 1 i=1 // (1+1)%count ->2 ... count�� 4������ ���� i=4
				 * //(4+1)%count=>1 �� --------------------------------- i=0 // (0+1)%100 => 1
				 * i=1 // (1+1)%count ->2 �����ߴ� ���� i=2 // (2+1)%100 -> 3
				 * 
				 * ... count�� 4������ ���� i=4 // (4+1)%100=>1 ��
				 */
//				arr[i]=null;
//				
//				arr[i]=arr[(i+1)%(100)];
//				if ((i+1)%count==1) continue;
				//
				// ---------------------------------
				//
				// i�� �̸� ã�� ��°�ϲ�
				// �����ϴ°� 1��° count�� 3�� �Է�
				// i = 1 j=1
				// arr[1]= arr[2]
				// .. arr[2] = arr[3] [���⼭ ���� �׷а��]
				// �����°�� ���������� ���⿡ count -1�� ó���������
				// arr[count-1] = �ٵ� ���⼭ ����... ���� �־������ ���̾��� �װ� ��µ�

//				for (int j = i; j <= count-1; j++) {
//					arr[j] = arr[j+1];
//				}
//				arr[count-1]=new TeacherPhone("","","");
				idx = i;

			}
		}
		if (idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		// ��Ҹ� �����ϰ� �迭 ��Ҹ� ������ ���
		/*
		 * idx�� �˻��� �̸��� ������ ����ϰ����� 1�̶�� ���� i=0 // i=1 // idx�� ���� i=2 // count�� 4������ ����
		 * i=4 //
		 * 
		 * count�������ϸ� �ѹ��� ������ j=1; 1<3; j++ 1 2���� ��ȸ 0������ ������ ������
		 * 
		 * j=1 arr[1] = arr[1+1] j=2 arr[2] = arr[2+1]
		 * 
		 * arr[3] = null count �� �ٿ������ �׷��� �����
		 * 
		 */
//		for (int j = idx; j < count - 1; j++) { // idx���� �����ؼ� �迭�� ������ �ٷ� �� ��ұ��� �ݺ�
//			arr[j] = arr[j + 1]; // ���� �ε����� ���� �ε����� ��Ҹ� �Ҵ�
//		}
//		arr[count - 1] = null; // ������ ��Ҹ� null�� �����Ͽ� ��ü ���� ����
//		count--; // ��ü ��� ���� �ϳ� ����

		// ����� ����
		for (int j = idx; j < count; j++) {
			if (j == arr.length - 1) { // ����� �������̸� ����ٰ� ���� ��� ��ž
				arr[j] = null;
			} else {
				arr[j] = arr[j + 1]; // ������
			}
		}
		count--;// ������Ұ� ���ڸ��� ���� ���� count�� �������
		

	}
	

}
