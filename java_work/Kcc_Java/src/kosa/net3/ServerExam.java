package kosa.net3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;//������ Ŭ���̾�Ʈ ����
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("���� ���� ��......");
			
			while(true) {
				socket = serverSocket.accept();//��û ��� ��
				Thread thread = new PerClientThread(socket);
				thread.start();
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//socket.close();
				//serverSocket.close();
			} catch (Exception e2) {}
		}
	}
}











