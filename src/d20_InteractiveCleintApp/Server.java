package d20_InteractiveCleintApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int PORT = 5002;
	
	private static String[] isimler = {"Fatih","Aysel","Mehmet","Melek"};
	private static String[] meslekler = {"Bilg. Muh","Doktor","Ogretmen","Asci"};
	
	public static void main(String[] args) throws IOException {
	
		ServerSocket server =new ServerSocket(PORT);
		System.out.println("[SERVER] --> The server is waiting to connection a client");
		
		Socket client = server.accept();
		System.out.println("[SERVER] --> a client connected " );
		
		PrintWriter output = new PrintWriter(client.getOutputStream(), true);
		BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		while(true) {
			String clientRequest =input.readLine();
			if(clientRequest.contains("bir kisi soyle")) {
				output.println(rastgeleKisiSec());
			}else if(clientRequest.equals("Exit")) {
				output.println("Hoscakal, yine beklerinz");
				System.out.println("Sunucu Kapatildi");
				break;
			}else {
				output.println("Rastgele bir kisi bilgisi almak icin \"bir kisi soyle\" yaziniz!");
			}

		}
		output.close();
		input.close();
	}
	
	public static String rastgeleKisiSec() {
	//Rastgele bir isim ve meslek ikilisi olusturalim
		//Math.random => [0,1)
		//[0-0.25) * 4 => [0,1) => 0
		//[0.75,1) *4 => {3,4)
		
		int no = (int) (Math.random()*isimler.length);
		return isimler[no]+" "+meslekler[no];
	}
	
	

}
