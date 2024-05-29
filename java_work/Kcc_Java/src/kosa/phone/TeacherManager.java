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
		System.out.println("�˻��� �̸�: ");
		String search = sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (arr[i].getName().indexOf(search)!=-1) {
				arr[i].show();
			}
		}
	}

}
