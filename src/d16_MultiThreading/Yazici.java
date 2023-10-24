package d16_MultiThreading;

public class Yazici {
	
	
	
	
	/*synchronized*/ void  dokumanYazdir(int koyaSayisi, String dokumanIsmi) {
		//synchronized ile thread i sirayla duzgun bir sekilde yazdirmayi saglami oluyoruz
		// AMA synchronized yapmayi tercih etmiyoruz. run method a bu durumu ekleyecegiz
		// belkide benim iki tane yazicim olacak bekletmek istemiyorum. Yani senk. burda olmasin
		for(int i=1; i<koyaSayisi; i++) {
			/*
			try{
				Thread.sleep(500); // bu sekilde synchronized yapmis oluyoruz ama bekletmek yerinemethod a ekleyelim
			}catch(InterruptedException e) {
				e.printStackTrace();
			}*/
			
			System.out.println(dokumanIsmi+" isimli dosyanin "+i+". kopyasi yazdirilildi");
		}
	}

}
