package kosa.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("���� ���� ��........");
			
			// ��� ���� ��û�� Ŭ���̾�Ʈ ����
			socket = serverSocket.accept();
			
			InputStream in = socket.getInputStream();//�б��
			OutputStream out = socket.getOutputStream();//�����
			
			byte arr[] = new byte[100];
			in.read(arr);
			
			System.out.println("Ŭ���̾�Ʈ���� ���� �޼���: " + new String(arr));
			
			String message = "�ݰ��� Ŭ���̾�Ʈ~";
			out.write(message.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
				serverSocket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
