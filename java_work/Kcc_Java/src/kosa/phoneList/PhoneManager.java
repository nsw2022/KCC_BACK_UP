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

// ��ȭ��ȣ ���� �������� ���
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
//	                arr[count++] = new TeacherPhone(basicInfo[0], basicInfo[1], basicInfo[2]);
				arr.add(new PhoneInfo(basicInfo[0], basicInfo[1], basicInfo[2]));
				return;

			case "2":
				System.out.print("�μ�: ");
				String dept = DataInput.sc.nextLine();
				System.out.print("��å: ");
				String position = DataInput.sc.nextLine();
				arr.add(new Company(basicInfo[0], basicInfo[1], basicInfo[2], dept, position));
				return;

			case "3":
				System.out.print("����: ");
				String major = DataInput.sc.nextLine();
				System.out.print("�г�: ");
				String year = DataInput.sc.nextLine();
				arr.add(new Universe(basicInfo[0], basicInfo[1], basicInfo[2], major, year));

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
		return new String[] { name, phone, birthdate };
	}

	public void listPhoneInfo() {
		System.out.print("1.�Ϲ� 2.ȸ�� 3.��â");
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
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}

	public void updatePhoneInfo() {
		// �̸��� �Է� => �ش� phoneInfo ���� => ���� ��ȭ��ȣ �Է� => ��ȭ��ȣ ������ �Ϸ�

		int idx = -1;

		System.out.print("������ �̸�: ");
		String name = DataInput.sc.nextLine();
		for (int i = 0; i < arr.size(); i++) {
			if (name.equals(arr.get(i).getName())) {
				arr.get(i).show();
				idx = i;
				System.out.println("������ ���� �Է�");
				// PhoneInfo��ü�� �����ؼ� �迭�� �߰��ϴ� ��
				System.out.println("�̸�: ");
				name = DataInput.sc.nextLine();
				System.out.println("��ȭ��ȣ: ");
				String phoneNo = DataInput.sc.nextLine();
				System.out.println("�������: ");
				String birth = DataInput.sc.nextLine();

				arr.get(i).setName(name);
				arr.get(i).setPhoneNo(phoneNo);
				arr.get(i).setBirth(birth);
				System.out.println("*****�����Ϸ�*****");
				arr.get(i).show();
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
		for (int i = 0; i < arr.size(); i++) {
			if (name.equals(arr.get(i).getName())) {
				idx = i;
				arr.remove(i);
			}
		}
		if (idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		}

		count--;// ������Ұ� ���ڸ��� ���� ���� count�� �������

	}

	public void sortedPhoneInfo() {
		System.out.print("1.�̸�  2.����  3. ����ȣ");
		String userInput = DataInput.sc.nextLine();
		System.out.print("1.���� 2.�ø�");
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

	// ��ü �����ϱ�
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

	// �ҷ�����
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
