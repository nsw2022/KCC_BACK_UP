package kosa.net3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class PerClientThread extends Thread {
	Socket socket = null;
	PrintWriter writer = null;
	static List<PrintWriter> list =
			Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	public PerClientThread() {}	

	public PerClientThread(Socket socket) {
		super();
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sendAll(String msg) {
		for(PrintWriter writer : list) {
			writer.println(msg);
			writer.flush();
		}
	}

	@Override
	public void run() {
		String name = "";
		try {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			name = br.readLine();
			sendAll("## " + name + "�� ���� �ϼ̽��ϴ�. ##");
			while(true) {
				String msg = br.readLine();
				String msg2 = URLDecoder.decode(msg, "utf-8");
				
				if(msg2.equals("��")) break;
				
				msg2 = name + " : " + msg2;
				sendAll(msg2);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sendAll("##" + name + "�� ���� �ϼ̽��ϴ�. ## ");
			list.remove(writer);
			try {
				socket.close();
			} catch (Exception e2) {}
		}
	}
	

}



















