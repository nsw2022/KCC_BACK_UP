package kosa.oop;



public class AccountMain2 {

	public static void main(String[] args) {
		
		Account arr[] = {
				new Account("111-111","ȫ�浿",10_000),
				new CheckingAccount("111-111","ȫ�浿",20_000,"222-222"),
				new TeacherMinusAccount("333-333","��浿",30_000,20_000)
		};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof CheckingAccount) {
				try {
					((CheckingAccount) arr[i]).pay("222-222",5_000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(arr[1].getBalance());
		
		/*
		 �θ�� ����ȯ
		Account ca = new CheckingAccount("111-111", "�¿�", 10_000, "222-222");
		CheckingAccount obj = (CheckingAccount) ca;
		try {
			obj.pay("222-222",3_000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		**/
	
//		CheckingAccount ca = new CheckingAccount("111-111","�¿�",10_000,"222-222");
//		try {
//		ca.pay("222-222", 3_000);
	//	} catch (Exception e) {
	//		e.printStackTrace();
	//	}
//		System.out.println(ca.getBalance());
//		TeacherMinusAccount tma = new TeacherMinusAccount("111-111","�¿�",10_000,2_000);
//		try {
//			tma.withdraw(12_001);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(tma.getBalance());

	}

}
