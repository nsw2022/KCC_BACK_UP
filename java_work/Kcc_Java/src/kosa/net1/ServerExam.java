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
			System.out.println("서버 실행 중........");
			
			// 방금 전에 요청한 클라이언트 소켓
			socket = serverSocket.accept();
			
			InputStream in = socket.getInputStream();//읽기용
			OutputStream out = socket.getOutputStream();//쓰기용
			
			byte arr[] = new byte[100];
			in.read(arr);
			
			System.out.println("클라이언트에서 보낸 메세지: " + new String(arr));
			
			String message = "반가워 클라이언트~";
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
