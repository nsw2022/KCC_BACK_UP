package kosa.phone;

import java.util.Scanner;

public class PhoneInfoMain {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		String name = "";
		String phoneNum = "";
		String birthDay = "";
		String flag = "";//1�߰� 2��ü 3�˻� 4����
		int count = 0;
		
		System.out.println();
		PhoneInfo[] phonArr = new PhoneInfo[10];//10�� ����
		while (true) {
			System.out.println();
			System.out.println("��ȭ��ȣ�� : �̸�. ��ȭ��ȣ, �������, �Ѹ��� ��ȭ ������ ���");
			System.out.println(">1.�߰� 2.��ü��� 3.�˻� 4.���� 5.���� 6.����");
			flag = sc.nextLine();

			if (flag.equals("1")) {

				System.out.println(">�޴� :1");
				System.out.print(">�̸� : ");
				name = sc.nextLine();
				System.out.print(">��ȭ��ȣ : ");
				phoneNum = sc.nextLine();
				System.out.print(">������� : ");
				birthDay = sc.nextLine();
				// ��ü�� �׶����� �����̾�
				PhoneInfo newPhoneInfo = new PhoneInfo();
				newPhoneInfo.addPhoneInfo(name, phoneNum, birthDay);
				phonArr[count] = newPhoneInfo; // �迭�� ��ü �Ҵ�
				count++;
			} else if (flag.equals("2")) {
				System.out.println(">�޴� :2");
				for (int i = 0; i < phonArr.length; i++) {
					if (phonArr[i]!=null) {
						phonArr[i].listPhoneInfo();
					}
				}
			}else if(flag.equals("3")) {
				System.out.println(">�޴� 3:");
				System.out.print(">�˻��̸� : ");
				name = sc.nextLine();
				for (int i = 0; i < phonArr.length; i++) {
					if (phonArr[i]!=null) {
						phonArr[i].searchPhoneInfo(name);
					}
				}
			}else if (flag.equals("4")||count==11) {
				break;
			}
		}
		System.out.println(">�޴� :4");
		System.out.println(">���α׷��� ����");
		sc.close();
	}
}
