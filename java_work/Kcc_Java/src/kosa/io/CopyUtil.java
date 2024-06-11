package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyUtil {
	
	// ���丮 ����(�ش� ���� �����ؼ� ���ο� ���丮 ���� �� ��� ������ ����)
	
	
	// ����Ʈ ���� ���� ���� 1���� �����ϴ� �޼���
	public static void copyFile(File source, File dest) {
		FileInputStream in = null;
        FileOutputStream out = null;
        int data = 0;
        byte arr[] = new byte[1024];
        try {
            in = new FileInputStream(source);
            out = new FileOutputStream(dest);
            while ((data = in.read(arr)) != -1) {
                out.write(arr, 0, data);
            }
            System.out.println("���� �Ϸ�");
		}catch (Exception e) {
			
		}finally {
			try {
				if(out!=null)out.close();
				if(in!=null)in.close();
			} catch (Exception e2) {
				
			}
		}
	}

	public static void copyDirectory(File source, File dest) {
		if (source.isDirectory()) {
			dest.mkdir();
			File[] fileList = source.listFiles();
			for (int i = 0; i < fileList.length; i++) {
				File soutceFile = fileList[i];
				if (soutceFile.isDirectory()) {
					
					//new File("���丮 ���",�����̸�)
					copyDirectory(soutceFile, new File(dest,soutceFile.getName()));
					
				}else {
//					System.out.println(soutceFile.getName());
//					System.out.println(soutceFile.getPath());
//					System.out.println(dest.getPath());
					copyFile(soutceFile, new File(new File(dest.getPath()),soutceFile.getName()));
				}
			}
			
		}
		
	}
	
	// ����Ʈ ���� ���� ���� 1���� �����ϴ� �޼���
	/*
	���� ���۸� ����
	public static void copyFile(File source, File dest) {
		File origin = new File(source.getPath());
		File copy = new File(dest.getPath());
		try {
			Files.copy(origin.toPath(), copy.toPath(),StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {}
		
	}
	*/
	/* ���� �ȵ� �� ����� �Ǵµ� ����
	public static void copyFile(File source, File dest) {
		FileOutputStream fos=null;
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream(dest);
			fis = new FileInputStream(source);
			byte[] arr = new byte[3];

			try {
				while (true) {
					int len = fis.read(arr);
					if(len==-1)break;
					fos.write(arr,0,len);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	*/

}
