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
//		System.out.println("검색할 이름: ");
//		String search = sc.nextLine();
//		for (int i = 0; i < count; i++) {
//			if (arr[i].getName().indexOf(search)!=-1) {
//				arr[i].show();
//			}
//		}
		// 검색하고자하는 이름으로 1개의 PhoneInfo 객체의 내용을 출력한다

		int idx = -1;

		System.out.print("이름: ");
		String name = sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				arr[i].show();
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}
	}

	public void updatePhoneInfo() {
		// 이름을 입력 => 해당 phoneInfo 추출 => 수정 전화번호 입력 => 전화번호 수정이 완료

		int idx = -1;

		System.out.print("수정할 이름: ");
		String name = sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				arr[i].show();
				idx = i;
				System.out.println("수정할 내용 입력");
				// PhoneInfo객체를 생성해서 배열에 추가하는 것
				System.out.println("이름: ");
				name = sc.nextLine();
				System.out.println("전화번호: ");
				String phoneNo = sc.nextLine();
				System.out.println("생년월일: ");
				String birth = sc.nextLine();

				arr[i].setName(name);
				arr[i].setPhoneNo(phoneNo);
				arr[i].setBirth(birth);
				System.out.println("*****수정완료*****");
				arr[i].show();
			}
		}
		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}

	}

	public void deletePhoneInfo() {
		// 이름 입력 => 대상 객체 검색 => 인덱스 찾기 => 해당 객체 삭제 (이후에 index 땅기기)
		int idx = -1;

		System.out.print("삭제할 이름: ");
		String name = sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				// 1. 해당번째의 참조변수 요소를 null 바꿈
				// 2. 뒤에요소를 %로 접근
				/*
				 * i=0 // (0+1)%count => 1 i=1 // (1+1)%count ->2 ... count가 4까지라 가정 i=4 //
				 * (4+1)%count=>1 ※ --------------------------------- i=0 // (0+1)%100 => 1 i=1
				 * // (1+1)%count ->2 삭제했다 가정 i=2 // (2+1)%100 -> 3
				 * 
				 * ... count가 4까지라 가정 i=4 // (4+1)%100=>1 ※
				 */
//				arr[i]=null;
//				
//				arr[i]=arr[(i+1)%(100)];
//				if ((i+1)%count==1) continue;
				//
				// ---------------------------------
				//
				// i는 이름 찾은 번째일꺼
				// 삭제하는건 1번째 count는 3번 입력
				// i = 1 j=1
				// arr[1]= arr[2]
				// .. arr[2] = arr[3] [여기서 에러 그론고로]
				// 현재번째의 마지막까지 가기에 count -1를 처리해줘야함
				// arr[count-1] = 근디 여기서 문제... 값을 넣어버리면 답이없음 그게 출력됨

//				for (int j = i; j <= count-1; j++) {
//					arr[j] = arr[j+1];
//				}
//				arr[count-1]=new TeacherPhone("","","");
				idx = i;

			}
		}
		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}
		// 요소를 삭제하고 배열 요소를 앞으로 당김
		for (int j = idx; j < count - 1; j++) { // idx부터 시작해서 배열의 마지막 바로 전 요소까지 반복
			arr[j] = arr[j + 1]; // 현재 인덱스에 다음 인덱스의 요소를 할당
		}
		arr[count - 1] = null; // 마지막 요소를 null로 설정하여 객체 연결 해제
		count--; // 전체 요소 수를 하나 감소
	}

}
