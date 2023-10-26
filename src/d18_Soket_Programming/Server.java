package d18_Soket_Programming;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

public class Server {
	
	private ServerSocket server =null; // bu bizim sunucumuz olmayi saglayacak. soketimizi kabul edecek
	
	private Socket socket =null;
	
	private DataInputStream input =null; // server i girdi almayi saglayacagiz
	
	// server hangi porta musade ediyorsa cleint da onun uzerinden baglaniyor olacak. ornegin 500 portu
	public Server(int port) throws IOException {
		
		server = new ServerSocket(port);
		System.out.println("Server started...");
		
		System.out.println("Waiting for a cleint...");
		
		socket =server.accept();
		System.out.println("Bir cleint (istemci) kabul edildi!");
		
		//Istemcinin soketinden girdi aliniyor.
		input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		
		String metin = "";
	
		while(!metin.equals("Exit")) {
			metin = input.readUTF();
			System.out.println(metin); //burda cosola yazdiriyoruz
		}
		
		System.out.println("Baglanti sonlandiriliyor...");
		input.close();
		socket.close();
		
	}
	

	public static void main(String[] args) throws IOException {
		Server server =new Server(5000);
		//Server (Sunucu) Tarafının Programlanması - 3 burda kaldim

	}

}
