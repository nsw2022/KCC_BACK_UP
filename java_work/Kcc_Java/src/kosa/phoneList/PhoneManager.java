package kosa.phoneList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// 전화번호 관리 전반적인 기능
public class PhoneManager implements Serializable {
//	private TeacherPhone arr[];
	private List<PhoneInfo> arr;
	// private Scanner sc;

	private int count;

	public PhoneManager() {
//		arr = new TeacherPhone[10];
		arr = new ArrayList<PhoneInfo>();
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
//	                arr[count++] = new TeacherPhone(basicInfo[0], basicInfo[1], basicInfo[2]);
				arr.add(new PhoneInfo(basicInfo[0], basicInfo[1], basicInfo[2]));
				return;

			case "2":
				System.out.print("부서: ");
				String dept = DataInput.sc.nextLine();
				System.out.print("직책: ");
				String position = DataInput.sc.nextLine();
				arr.add(new Company(basicInfo[0], basicInfo[1], basicInfo[2], dept, position));
				return;

			case "3":
				System.out.print("전공: ");
				String major = DataInput.sc.nextLine();
				System.out.print("학년: ");
				String year = DataInput.sc.nextLine();
				arr.add(new Universe(basicInfo[0], basicInfo[1], basicInfo[2], major, year));

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
		return new String[] { name, phone, birthdate };
	}

	public void listPhoneInfo() {
		System.out.print("1.일반 2.회사 3.동창");
		String flag = DataInput.sc.nextLine();
		for (int i = 0; i < arr.size(); i++) {

			if (flag.equals("1") && !(arr.get(i) instanceof Company) && (!(arr.get(i) instanceof Universe))) {

				arr.get(i).show();
			} else if (flag.equals("2") && arr.get(i) instanceof Company) {

				arr.get(i).show();
			} else if (flag.equals("3") && arr.get(i) instanceof Universe) {

				Iterator<PhoneInfo> iterator = arr.iterator();
				while (iterator.hasNext()) {
					PhoneInfo p = iterator.next();
					System.out.println(p.getName());

				}
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
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().indexOf(name) != -1) {
				if (flag.equals("1") && arr.get(i) instanceof PhoneInfo) {
					arr.get(i).show();
					idx = i;
				} else if (flag.equals("2") && arr.get(i) instanceof Company) {
					arr.get(i).show();
					idx = i;
				} else if (flag.equals("3") && arr.get(i) instanceof Universe) {
					arr.get(i).show();
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
		for (int i = 0; i < arr.size(); i++) {
			if (name.equals(arr.get(i).getName())) {
				arr.get(i).show();
				idx = i;
				System.out.println("수정할 내용 입력");
				// PhoneInfo객체를 생성해서 배열에 추가하는 것
				System.out.println("이름: ");
				name = DataInput.sc.nextLine();
				System.out.println("전화번호: ");
				String phoneNo = DataInput.sc.nextLine();
				System.out.println("생년월일: ");
				String birth = DataInput.sc.nextLine();

				arr.get(i).setName(name);
				arr.get(i).setPhoneNo(phoneNo);
				arr.get(i).setBirth(birth);
				System.out.println("*****수정완료*****");
				arr.get(i).show();
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
		for (int i = 0; i < arr.size(); i++) {
			if (name.equals(arr.get(i).getName())) {
				idx = i;
				arr.remove(i);
			}
		}
		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}

		count--;// 다음요소가 제자리에 들어가기 위해 count를 빼줘야함

	}

	public void sortedPhoneInfo() {
		System.out.print("1.이름  2.생일  3. 폰번호");
		String userInput = DataInput.sc.nextLine();
		System.out.print("1.내림 2.올림");
		String userSort = DataInput.sc.nextLine();
		switch (userInput) {
		case "1":
			Collections.sort(arr, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					if (userSort.equals("1")) {
						return o1.getName().compareTo(o2.getName());

					} else {
						return -1;
					}
				}
			});
			break;
		case "2":
			Collections.sort(arr, new Comparator<PhoneInfo>() {
				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					if (userSort.equals("1")) {
						return o1.getBirth().compareTo(o2.getBirth());

					} else {
						return -1;
					}
				}
			});
			break;

		default:
			break;
		}

	}

	// 객체 저장하기
	public void saveObject() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("phoneInfo.ser"));
			oos.writeObject(arr);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 불러오기
	public void loadObject() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("phoneInfo.ser"));
			arr = (List<PhoneInfo>) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public List<PhoneInfo> getArr() {
		return arr;
	}

	public void setArr(List<PhoneInfo> arr) {
		this.arr = arr;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
