package d09_Memory_Management_StackVS_M;

import java.util.Stack;

public class DriverStack {
	/*
	 * Simdiye kadar Ram kullandik Stack ve Heap kisimalrina deginecegiz ikisinin
	 * karsilastirmasini yapacagiz. Bolum sonu Cop toplanmasi sonucunde ram de daha
	 * once olusturmus oldugumuz degiskenlerin bosa cikmasi sonucunda sonunda
	 * kullanilmayan alanlarin asilmasi adina g. Collection u kullanak yapacagiz
	 */
	/*
	 *  Stack - Yigin, ust  uste binen verilerin sirayla cikmasina saglamak. 
	 *  FILO ilk giren son cikar. yada LIFO so giren ilk cikar :)
	 *  1. Gecici degiskenlerin depolandigi yerdir.
	 *  2. Bir isi yurutmek icin kullanilir
	 *  3. Yiginda depolanan degiskenler onlari olusturan islev calistigi surece var olur
	 *  Orengin, bir method icinde degisken olusturuldugunda, 
	 *  o degiskenler yiginda olmaya devam ediyor.
	 *  ne zaman methodla isimiz bitti o olusturulan lokal degiskenler o yigin dan kalkiyor.
	 *  4. Boyutlari kullanilan isletim sistemine gore degisir. benimki xx isletim s. 8GB Ram :)
	 *  5. Kullanilan bolgeler is bitince baska programlar kullanabilsin diye serbest birakiliyor. 
	 *  
	 *  Yerel DEgiskenler NEDEN Stack te depolaniyor?
	 *  // Stack Methods, push pop top peek isEmpty 
	 */
	public static void main(String[] args) {
		Stack<Integer> yigin = new Stack<Integer>();
		yigin.add(10);
		yigin.add(20);
		yigin.add(30);
		
		System.out.println(yigin.peek()); // 30 en utteki degeri verir
		yigin.pop();					// en usttekini siler bu sefer 20 ustte olur
		System.out.println(yigin.peek());
		yigin.pop();
		System.out.println(yigin.peek());
		yigin.pop();
		System.out.println(yigin.isEmpty());
		
		//System.out.println(yigin.peek()); java.util.EmptyStackException
		
	}
}
