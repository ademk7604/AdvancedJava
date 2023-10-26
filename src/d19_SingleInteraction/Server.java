package d19_SingleInteraction;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
	private static final int PORT = 5002;
	
	public static void main(String[] args) throws IOException {
		ServerSocket sunucu = new  ServerSocket(PORT);
		
		System.out.println("[SERVER] The server is waiting to connection a cleint");
		
		//istemciyi sunucuya kabul ediyorum
		Socket cleint = sunucu.accept();
		System.out.println("[SERVER] a Cleint is connected");
		
		//PrintWriter in outoFlush argumanini belirlememiz gerekiyor.  
		// outoFlush true yaparak bafferi temizlemizliyoruz, ki bos mesaj gelmesin
		while(true) {
			PrintWriter output = new PrintWriter(cleint.getOutputStream(), true);
			output.println((new Date()).toString());
			cleint = sunucu.accept();
			System.out.println("[SERVER] a Cleint is connected");
		}
		
		/*
		System.out.println("[SUNUCU] Tarih bilgisi gonderildi. Baglanti kapatiliyor");
		sunucu.close();
		cleint.close();
		*/
		
		
		
	}

}
