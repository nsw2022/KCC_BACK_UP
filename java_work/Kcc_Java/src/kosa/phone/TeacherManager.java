package kosa.phone;

// 전화번호 관리 전반적인 기능
public class TeacherManager {
	private TeacherPhone arr[];
	// private Scanner sc;

	private int count;

	public TeacherManager() {
		arr = new TeacherPhone[10];
		// sc = new Scanner(System.in);
	}
	
	public void addPhoneInfo() {
	    System.out.print("1.일반 2.회사 3.동창: ");
	    String flag = DataInput.sc.nextLine();

	    while (true) {
	        String[] basicInfo = result(); // 이름, 전화번호, 생년월일을 한 번에 입력받음
	        if (basicInfo == null || basicInfo.length < 3) {
	            System.out.println("입력 정보가 부족합니다. 다시 입력하세요.");
	            continue;
	        }

	        switch (flag) {
	            case "1":
	                arr[count++] = new TeacherPhone(basicInfo[0], basicInfo[1], basicInfo[2]);
	                return;

	            case "2":
	                System.out.print("부서: ");
	                String dept = DataInput.sc.nextLine();
	                System.out.print("직책: ");
	                String position = DataInput.sc.nextLine();
	                arr[count++] = new Company(basicInfo[0], basicInfo[1], basicInfo[2], dept, position);
	                return;

	            case "3":
	                System.out.print("전공: ");
	                String major = DataInput.sc.nextLine();
	                System.out.print("학년: ");
	                String year = DataInput.sc.nextLine();
	                arr[count++] = new Universe(basicInfo[0], basicInfo[1], basicInfo[2], major, year);
	                return;

	            default:
	                System.out.println("잘못된 선택입니다. 1, 2, 또는 3을 입력해주세요.");
	                flag = DataInput.sc.nextLine();
	                break;
	        }
	    }
	}

	private String[] result() {
	    System.out.print("이름: ");
	    String name = DataInput.sc.nextLine();
	    System.out.print("전화번호: ");
	    String phone = DataInput.sc.nextLine();
	    System.out.print("생년월일: ");
	    String birthdate = DataInput.sc.nextLine();
	    return new String[]{name, phone, birthdate};
	}


	public void listPhoneInfo() {
		System.out.print("1.일반 2.회사 3.동창");
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
//		System.out.println("검색할 이름: ");
//		String search = sc.nextLine();
//		for (int i = 0; i < count; i++) {
//			if (arr[i].getName().indexOf(search)!=-1) {
//				arr[i].show();
//			}
//		}
		// 검색하고자하는 이름으로 1개의 PhoneInfo 객체의 내용을 출력한다

		int idx = -1;
		System.out.print("1.일반 2.회사 3.동창");
		String flag = DataInput.sc.nextLine();
		System.out.print("이름: ");
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
			System.out.println("존재하지 않습니다.");
		}
	}

	public void updatePhoneInfo() {
		// 이름을 입력 => 해당 phoneInfo 추출 => 수정 전화번호 입력 => 전화번호 수정이 완료

		int idx = -1;

		System.out.print("수정할 이름: ");
		String name = DataInput.sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				arr[i].show();
				idx = i;
				System.out.println("수정할 내용 입력");
				// PhoneInfo객체를 생성해서 배열에 추가하는 것
				System.out.println("이름: ");
				name = DataInput.sc.nextLine();
				System.out.println("전화번호: ");
				String phoneNo = DataInput.sc.nextLine();
				System.out.println("생년월일: ");
				String birth = DataInput.sc.nextLine();

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
		String name = DataInput.sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				// 1. 해당번째의 참조변수 요소를 null 바꿈
				// 2. 뒤에요소를 %로 접근
				/*
				 * i=0 // (0+1)%count => 1 i=1 // (1+1)%count ->2 ... count가 4까지라 가정 i=4
				 * //(4+1)%count=>1 ※ --------------------------------- i=0 // (0+1)%100 => 1
				 * i=1 // (1+1)%count ->2 삭제했다 가정 i=2 // (2+1)%100 -> 3
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
		/*
		 * idx가 검색한 이름의 순서를 기억하고있음 1이라고 가정 i=0 // i=1 // idx가 여기 i=2 // count가 4까지라 가정
		 * i=4 //
		 * 
		 * count까지로하면 한번더 복사함 j=1; 1<3; j++ 1 2까지 순회 0번방은 어차피 괜춘함
		 * 
		 * j=1 arr[1] = arr[1+1] j=2 arr[2] = arr[2+1]
		 * 
		 * arr[3] = null count 도 줄여줘야함 그래야 댕겨짐
		 * 
		 */
//		for (int j = idx; j < count - 1; j++) { // idx부터 시작해서 배열의 마지막 바로 전 요소까지 반복
//			arr[j] = arr[j + 1]; // 현재 인덱스에 다음 인덱스의 요소를 할당
//		}
//		arr[count - 1] = null; // 마지막 요소를 null로 설정하여 객체 연결 해제
//		count--; // 전체 요소 수를 하나 감소

		// 강사님 버전
		for (int j = idx; j < count; j++) {
			if (j == arr.length - 1) { // 요소의 마지막이면 댕겨줄게 없음 고로 스탑
				arr[j] = null;
			} else {
				arr[j] = arr[j + 1]; // 땡겨잇
			}
		}
		count--;// 다음요소가 제자리에 들어가기 위해 count를 빼줘야함
		

	}
	

}
