package kosa.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class KosaReader {
	
	public static void main(String[] args) {
		//����(pome.txt)�� �ִ� ���ڿ� �����͸� �о� ����
		// 'a' == 97
		// 'A' == 65
		FileReader reader =null;
		char arr[] = new char[10];
		
		try {
			// FileReader ����
			reader = new FileReader("pome.txt");
			
			// �ϳ��� �о����
//			while (true) {
//				int data = reader.read();
//				if (data == -1) break;
//				System.out.print((char)data);
//				
//			}
			
			// �ѹ��� �б�
//			reader.read(arr);
//			System.out.println(arr);
			while (true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);
				if(data==-1) break;
				System.out.println(arr);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}

}
