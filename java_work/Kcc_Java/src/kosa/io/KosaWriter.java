package kosa.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KosaWriter {
	public static void main(String[] args) {
		// 키보드로 부터 문자열을 입력받아 파일에 쓰는 예제를 구현하자.
		// "q"를 입력하기 전까지 문자열을 파일에 쓰도록 하자.
		// FileWiter : write(문자열)
		// 파일명 : poem2.txt 미리 생성 X
		// 코드 실행 후 리플래쉬 => 파일 생성 확인 O
		// close()구현
		Scanner sc=null;
		FileWriter writer = null;
		try {
			sc = new Scanner(System.in);
			writer= new FileWriter("pome2.txt");
			while(true) {
				String str = sc.nextLine();
				if (str.equals("q")) break;
				writer.write(str+"\n");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
