package kosa.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileExam {

	public static void main(String[] args) {
		String path = "C:\\kcc\\work\\java_work\\Kcc_Java\\";
		File file = new File(path);
		// files(path);
//		File file = new File(path);
//		System.out.println(file.separator);
//		String[] contents = file.list();
//		for (String string : contents) {
//			System.out.println(string);
//		}
		//System.out.println(fact(3));
		
		//내버전
		//printFileSystem(path);
		
		//강사님버전
		show(file);

	}

	public static int fact(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * fact(n - 1);
		}

	}
	
	public static void show(File file) {
		File list[] = file.listFiles();
		for (int i = 0; i < list.length; i++) {
			if(list[i].isDirectory()) {
				System.out.println();
				System.out.println("** "+ list[i].getName() + "  **");
				show(list[i]);
			}else {
				System.out.println(" - " + list[i].getName());
			}
			
		}
	}

	public static void printFileSystem(String path) {

		File directory = new File(path);

		String[] contents = directory.list();
		File file = null;

		for (String content : contents) {

			file = new File(directory.getAbsolutePath() + File.separator + content);

			if (file.isDirectory()) {

				printFileSystem(file.getAbsolutePath());
				System.out.println("나는 폴더이요" + file.getAbsolutePath());
			} else {
				System.out.println("나는 파일이요" + file.getAbsolutePath());
				// System.out.println(file.getAbsolutePath());
			}

		}
	}

	public static File files(String path) {

		File f = new File(path);
		if (f.isDirectory()) {
			System.out.println("디렉토리 입니다.");
			System.out.println(f.getName() + "폴더입니다.");
			File arr[] = f.listFiles();
			for (File file : arr) {
				System.out.println(file.getName());
			}
		} else if (f.isFile()) {
			System.out.println("파일입니다." + f.getName());
		}
		return files(path);
	}

}
