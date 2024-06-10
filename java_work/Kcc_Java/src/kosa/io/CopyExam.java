package kosa.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyExam {
	
	public static void main(String[] args) {
		//poem2.txt => poem3.txt : 복사를 구현해보자
		
		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader("pome2.txt");
			writer = new FileWriter("pome3.txt");
			
			while(true) {
				int n = reader.read();
				if (n==-1) break;
				writer.write((char)n);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				writer.close();
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
