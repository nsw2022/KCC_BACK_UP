
package kosa.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MiniDos {
	private String dos;
	
	public MiniDos() {}

	public MiniDos(String dos) {
		super();
		this.dos = dos;
	}
	
	public void playDocs() {
		Scanner sc = new Scanner(System.in);
		String root = "C:\\kcc\\work\\java_work\\Kcc_Java\\src\\kosa";
		System.out.println();
		// cd abc -> cdabc cd/   abc
		// cd .. -> cd..
		// cd폴더명 ->폴더명
		while(true) {
			System.out.print(root + "> ");
			String user = sc.nextLine();
			user=user.replace(" ", "");
			if (user.equals("ls")) {
				ls(new File(root));
			}else if(user.equals("cd..")) {
				root=cdDotDot(new File(root));
			}else if(user.startsWith("cd")) {
				root=cdGoGo(new File(root), user.substring(2, user.length()));
			}else if(user.startsWith("mk")) {
				makeDir(new File(root), user.substring(5,user.length()));
			}else if(user.startsWith("vi")) {
				viGoGO(new File(root), user.substring(2, user.length()));
			}else if(user.startsWith("cat")) {
				catFile(new File(root),user.substring(3, user.length()));
			}	
		}
	}
	// cat
	private void catFile(File root,String fileName) {
		File[] arr = root.listFiles();
		FileReader fr = null;
		
		char note[] = new char[1024];
		if(arr.length==0) {
			System.out.println("파일이 하나도 없네요");
		}
		String tmp[] = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			tmp[i]=arr[i].getName();
		}
		for (String str : tmp) {
			if (str.equals(fileName)) {
				try {
					fr = new FileReader(root.getPath()+"\\"+str);
					fr.read(note);
					System.out.println(note);
				}catch (Exception e) {
					
				}finally {
					try {
						fr.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}
		}
	
	}
	

	// vi 
	private void viGoGO(File root,String fileName) {
		FileWriter writer = null;
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			writer = new FileWriter(root.getPath()+"\\"+fileName);
			while(true) {
				String str = sc.nextLine();
				if (str.equals("")) break;
				writer.write(str+="\n");
			}
		} catch (Exception e) {
		}finally {
			try {
				writer.close();
			} catch (Exception e2) {
				
			}
		}
		
	}

	// mkdir
	private void makeDir(File root, String fileName) {
		File makeD = new File(root.getPath()+"\\"+fileName);
		makeD.mkdir();
	}
	
	// cd 파일이동
	private String cdGoGo(File root,String cdName) {
		File[] arr = root.listFiles();
		if(arr.length==0) {
			System.out.println("파일이 하나도 없네요");
		}
		String tmp[] = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			tmp[i]=arr[i].getName();
		}
		for (String str : tmp) {
			if(str.equals(cdName)) {
				return root.getPath()+"\\"+cdName;				
			}
		}
		return root.getPath();
	}
	
	// cd..
	private String cdDotDot(File root) {
		return root.getParent();
	}
	// [  안녕  하세요    ] == 안녕하세요
	
	// ls
	public void ls(File file) {
		File[] arr = file.listFiles();
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + " ");
		}
		System.out.println();
	}
	
}
