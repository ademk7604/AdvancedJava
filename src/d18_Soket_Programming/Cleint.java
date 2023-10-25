package d18_Soket_Programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//Simdi iki uygulama calistiracagiz yani biri CLEINT digeri SERVER
public class Cleint {
	// Soket, input, output  ile socket olusturalim
	private Socket socket = null;
	private DataInputStream input = null; 
	private DataOutputStream output = null;
	
	
	//olusturdugumuz soketi acmadan once API adresine ve baglanacagimiz port numarasina (TCP) ihtiyacimiz var
	
	public Cleint(String address, int port) throws UnknownHostException, IOException {
		//address imiz localhost olacak
		//baglanti kurmak// Cleint objesi olustugu anada constructor server ile baglantiyi kurmus olacak
		socket = new Socket(address,port); // herhangi bir hata firlatmazsa alt kodda devam edecek
		System.out.println("Cleint sunucuya baglandi!");
		
		// System.in ile terminal uzerinde veri alalim
		input =new DataInputStream(System.in);
		
		// soket outputstream uzerinde bir veri ciktisi akisi olarak kullaniyorum.
		output = new DataOutputStream(socket.getOutputStream());
		
		
		String metin = "";
		while(!metin.equals("Exit")) {
			try {
				metin = input.readLine(); // sokete veri gonderiyor
				output.writeUTF(metin); // bu sokete yazdiriyoruz
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
			// Baglantiyi kapat, hata firlatabilir bu methodlar  methoda throw eklemistik
			input.close();
			output.close();
			socket.close();
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Cleint cleint = new Cleint("127.0.0.1", 5002);
		
	}

}
