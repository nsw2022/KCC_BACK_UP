package kosa.net2;

import java.net.ServerSocket;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.75.8",9000);
			Thread receive = new ClintRecevie(socket);
			Thread sender = new ClientSender(socket);
			receive.start();
			sender.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
