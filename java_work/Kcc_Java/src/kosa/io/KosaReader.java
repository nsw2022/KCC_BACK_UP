package kosa.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class KosaReader {
	
	public static void main(String[] args) {
		//파일(pome.txt)에 있는 문자열 데이터를 읽어 오기
		// 'a' == 97
		// 'A' == 65
		FileReader reader =null;
		char arr[] = new char[10];
		
		try {
			// FileReader 생성
			reader = new FileReader("pome.txt");
			
			// 하나씩 읽어오기
//			while (true) {
//				int data = reader.read();
//				if (data == -1) break;
//				System.out.print((char)data);
//				
//			}
			
			// 한번에 읽기
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
