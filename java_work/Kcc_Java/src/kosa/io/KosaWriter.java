package kosa.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KosaWriter {
	public static void main(String[] args) {
		// Ű����� ���� ���ڿ��� �Է¹޾� ���Ͽ� ���� ������ ��������.
		// "q"�� �Է��ϱ� ������ ���ڿ��� ���Ͽ� ������ ����.
		// FileWiter : write(���ڿ�)
		// ���ϸ� : poem2.txt �̸� ���� X
		// �ڵ� ���� �� ���÷��� => ���� ���� Ȯ�� O
		// close()����
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
