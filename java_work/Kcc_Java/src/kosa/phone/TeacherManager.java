package kosa.phone;

import java.util.Scanner;

// ��ȭ��ȣ ���� �������� ���
public class TeacherManager {
	private TeacherPhone arr[];
	private Scanner sc;
	private int count;

	public TeacherManager() {
		arr = new TeacherPhone[10];
		sc = new Scanner(System.in);
	}

	public void addPhoneInfo() {
		// Ű����κ��� �̸�, ��ȭ��ȣ, ��������� �Է� �޾�
		// PhoneInfo��ü�� �����ؼ� �迭�� �߰��ϴ� ��
		System.out.println("�̸�: ");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ: ");
		String phoneNo = sc.nextLine();
		System.out.println("�������: ");
		String birth = sc.nextLine();

		arr[count++] = new TeacherPhone(name, phoneNo, birth);

	}

	public void listPhoneInfo() {
		for (int i = 0; i < count; i++) {
			arr[i].show();
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

		System.out.print("�̸�: ");
		String name = sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				arr[i].show();
				idx = i;
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
		String name = sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				arr[i].show();
				idx = i;
				System.out.println("������ ���� �Է�");
				// PhoneInfo��ü�� �����ؼ� �迭�� �߰��ϴ� ��
				System.out.println("�̸�: ");
				name = sc.nextLine();
				System.out.println("��ȭ��ȣ: ");
				String phoneNo = sc.nextLine();
				System.out.println("�������: ");
				String birth = sc.nextLine();

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
		String name = sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				// 1. �ش��°�� �������� ��Ҹ� null �ٲ�
				// 2. �ڿ���Ҹ� %�� ����
				/*
				 * i=0 // (0+1)%count => 1 i=1 // (1+1)%count ->2 ... count�� 4������ ���� i=4 //
				 * (4+1)%count=>1 �� --------------------------------- i=0 // (0+1)%100 => 1 i=1
				 * // (1+1)%count ->2 �����ߴ� ���� i=2 // (2+1)%100 -> 3
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
		for (int j = idx; j < count - 1; j++) { // idx���� �����ؼ� �迭�� ������ �ٷ� �� ��ұ��� �ݺ�
			arr[j] = arr[j + 1]; // ���� �ε����� ���� �ε����� ��Ҹ� �Ҵ�
		}
		arr[count - 1] = null; // ������ ��Ҹ� null�� �����Ͽ� ��ü ���� ����
		count--; // ��ü ��� ���� �ϳ� ����
	}

}
