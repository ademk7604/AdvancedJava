package d20_InteractiveCleintApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cleint {
	// ikiside birbirine veri aktarimini saglayacak bir uygulama yapalim. interaktifi saglayalim
	private static final String SERVER_IP = "127.0.0.1";
	private static final int PORT = 5002;
	
	
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket(SERVER_IP, PORT);
		//soket uzerinden gelen input lari akis halinde aliyor
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//terminal uzerinden veri alimi yapmak icin ->System.in
		BufferedReader klavye = new BufferedReader(new InputStreamReader(System.in));
		
		// soket in cikis ucuna ekleyelim
		PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
		
		while(true) {
			System.out.println("Cleint reads -->");
			String komut = klavye.readLine();
			output.println(komut); // output a klaviyeden yazdigim ekleniyor
			String sunucuCevap = input.readLine();
			System.out.println("[SERVER] --> "+ sunucuCevap);
			if(komut.equals("Exit")) {
				break;
			}
		}
		socket.close();
		System.exit(0);
		
	}
}
