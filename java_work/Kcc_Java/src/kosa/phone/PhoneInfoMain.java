package kosa.phone;

import java.util.Scanner;

public class PhoneInfoMain {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		String name = "";
		String phoneNum = "";
		String birthDay = "";
		String flag = "";//1추가 2전체 3검색 4종료
		int count = 0;
		
		System.out.println();
		PhoneInfo[] phonArr = new PhoneInfo[10];//10개 만듬
		while (true) {
			System.out.println();
			System.out.println("전화번호부 : 이름. 전화번호, 생년월일, 한명의 전화 내역을 출력");
			System.out.println(">1.추가 2.전체출력 3.검색 4.수정 5.삭제 6.종료");
			flag = sc.nextLine();

			if (flag.equals("1")) {

				System.out.println(">메뉴 :1");
				System.out.print(">이름 : ");
				name = sc.nextLine();
				System.out.print(">전화번호 : ");
				phoneNum = sc.nextLine();
				System.out.print(">생년월일 : ");
				birthDay = sc.nextLine();
				// 객체는 그때마다 생성이야
				PhoneInfo newPhoneInfo = new PhoneInfo();
				newPhoneInfo.addPhoneInfo(name, phoneNum, birthDay);
				phonArr[count] = newPhoneInfo; // 배열에 객체 할당
				count++;
			} else if (flag.equals("2")) {
				System.out.println(">메뉴 :2");
				for (int i = 0; i < phonArr.length; i++) {
					if (phonArr[i]!=null) {
						phonArr[i].listPhoneInfo();
					}
				}
			}else if(flag.equals("3")) {
				System.out.println(">메뉴 3:");
				System.out.print(">검색이름 : ");
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
		System.out.println(">메뉴 :4");
		System.out.println(">프로그래밍 종료");
		sc.close();
	}
}
