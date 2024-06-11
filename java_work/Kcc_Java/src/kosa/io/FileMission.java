package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileMission {
	
	public static void main(String[] args) {
		//1. 바이트 스트림을 이용하여 이미지 파일을 복사해 보자.
//		String source = "C:\\kcc\\work\\java_work\\Kcc_Java\\src\\kosa\\io\\dog.jpg";
//		String copyDir = "C:\\upload\\dog.jpg";
//
//		CopyUtil.copyFile(new File(source), new File(copyDir));
		
		//2. 디렉토리 복사
//		String source2 = "C:\\kcc\\work\\java_work\\Kcc_Java\\src\\kosa";
//		String copyDir2 = "C:\\upload\\kosa";
//		CopyUtil.copyDirectory(new File(source2), new File(copyDir2));
		

		
		
		MiniDos md = new MiniDos();
		md.playDocs();
		
	}

}
