package kosa.phone;

import java.util.Scanner;

// 전화번호 관리 전반적인 기능
public class TeacherManager {
	private TeacherPhone arr[];
	private Scanner sc;
	private int count;

	public TeacherManager() {
		arr = new TeacherPhone[10];
		sc = new Scanner(System.in);
	}

	public void addPhoneInfo() {
		// 키보드로부터 이름, 전화번호, 생년월일을 입력 받아
		// PhoneInfo객체를 생성해서 배열에 추가하는 것
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.println("생년월일: ");
		String birth = sc.nextLine();

		arr[count++] = new TeacherPhone(name, phoneNo, birth);

	}

	public void listPhoneInfo() {
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}

	public void searchPhoneInfo() {
		System.out.println("검색할 이름: ");
		String search = sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (arr[i].getName().indexOf(search)!=-1) {
				arr[i].show();
			}
		}
	}

}
