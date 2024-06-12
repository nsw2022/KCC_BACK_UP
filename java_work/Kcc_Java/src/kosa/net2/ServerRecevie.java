package kosa.net2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerRecevie extends Thread {
	
	private Socket socket;
	
	public ServerRecevie() {}
	
	public ServerRecevie(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String str = br.readLine();
				if(str == null) break;
				System.out.println("���� ���� : " + str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
