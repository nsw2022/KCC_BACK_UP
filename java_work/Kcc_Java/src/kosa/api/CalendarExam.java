package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class CalendarExam {
	
	public static void main(String[] args) {
		//	GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
		System.out.println(gc);
		
		String now = gc.get(Calendar.YEAR) + "�� "
				   + (gc.get(Calendar.MONTH)+1) + "�� "
				   + gc.get(Calendar.DATE)+"�� "
				   + gc.get(Calendar.HOUR)+"�� "
				   + gc.get(Calendar.MINUTE)+"��";
		System.out.println("����ð�: "+now);
		
		gc.add(Calendar.DATE, 100);
		
		String future = gc.get(Calendar.YEAR) + "�� "
				   + (gc.get(Calendar.MONTH)+1) + "�� "
				   + gc.get(Calendar.DATE)+"�� "
				   + gc.get(Calendar.HOUR)+"�� "
				   + gc.get(Calendar.MINUTE)+"��";
		System.out.println("����ð�: "+future);
		
		gc.set(2022,5,4);
		gc.add(Calendar.DATE, 1_000);
		
		// ���� �빮�� M �� ������ �ڿ� �ú��ʰ� ���� hh:mm:ss  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String str = sdf.format(gc.getTime());
		System.out.println(str);
		System.out.println("-----------------s");
		// ���� 2024 ~ 2030�� ���� �ڽ��� ������ ���� ����?
		// Calendar.DAY_OF_WEEK => ���� -> ��(1) ��(2) ȭ �� �� �� ��
		gc.set(2024,1,1);
		int testYear = 2024;
		for (int i = 0; i <7 ; i++) {
			gc.set(testYear,2,3);
			String str2 = sdf.format(gc.getTime());
			System.out.println(str2);
			switch (gc.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				System.out.println("��");
				break;
			case 2:
				System.out.println("��");
				break;
			case 3:
				System.out.println("ȭ");
				break;
			case 4:
				System.out.println("��");
				break;
			case 5:
				System.out.println("��");
				break;
			case 6:
				System.out.println("��");
				break;
			case 7:
				System.out.println("��");
				break;

			default:
				break;
			}
			System.out.println();
			testYear++;
		}
		System.out.println("---------Teacher Code--------");
		
		char week[]= {'��','��','ȭ','��','��','��','��'};
		
		for (int i = 2024; i <= 2030; i++) {
			gc.set(i, 5,4);//6�� 4��
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i+"���� ������ "+c+"���� �Դϴ�");
		}
		
		
	}

}
