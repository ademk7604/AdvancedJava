package d18_Soket_Programming;

public class DriverBilgilendirme {
	/*s.p. java ile calisan uygulamalarin haberlesmesi icin kullaniliyor
	 * iki programin birbiri arsinda veri aktarimi gorevini goruyor
	 * chat uygulamalari S.P. kullaniyor whatsapp
	 * Java Soket P., Farkli Java Runtime Environment (JRE) (calismalarin) lerin birbiri ile haberlesmesini saglar
	 * Java Çalışma Zamanı Ortamı (JRE)
	 * Bunun yaninda bir de agda calisan iki programin cift yonlu birbiri ile baglantida kalmasini saglamak
	 */
	public static void main(String[] args) {
		/* Cleint (islemci) lar da bu sunuculardan hizmet aliyorlar
		 * Server (sunucu) ile hizmet veriyoruz
		 * 
		 * Cleint -> request (istek) -> server
		 * Cleint <- response (cevap) <- Server
		 * Kisacasi Cleint sunucudan ister Sunucu da cevap verir
		 * Tabi ne zaman istiyor ne kadarin suresince bunlarin cevabini verecegiz
		 */
		
		/* Peki Soket nedir?
		 * Ag uzerinde calisan iki program arasinda iki yonlu iletisim
		 * baglantisinin bir uc noktasi oluyor.
		 * Yani biz bir soket aciyoruz bu soket uzerinden haberlesmeyi sagliyoruz
		 * iletisimi bu soket uzerinde sagliyoruz
		 * Ayni zaman da Soket bir baglanti numarasi numarasina bagli oluyor,
		 * ve boylece TCP katmani verilerin gonderilecegi uygulamayi tanimlayabiliyor
		 * SIMDI BIZIM KATMANLARIMIZ var
		 * TCP  Transmission Control Protocol - iletisim kontrol protokolü - veri aktarimini kontrol eden bir protokol
		 * İletim Kontrol Protokolü (TCP), uygulama programlarının ve bilgi işlem cihazlarının 
		 * bir ağ üzerinden mesaj alışverişinde bulunmasını sağlayan bir iletişim standardıdır
		 * TCP, verileri gonderilecegi uygulamayi tanimliyor. 
		 * iki tarafta da soketler aciliyor orada nasil gonderilecegini belirleyebiliyoruz 
		 */
		
		/*  bunun disinda bizim portlarimiz var. port-> kapi diyebiliriz, sunucunun bir kapisi var. 
		 * Server port<-> Communication <-> cleint port portlar uzerinde sunucu ile cleint ieltisim sagliyor.
		 * burdan server in birden fazla port olabiliyor
		 * FTP (File Transfer Protocol) 21, SFTP (Secure File Transfer Protocol) 22 
		 * 
		 * Server soket'in ve bizim normal soketin metotlari vardir.
		 * getInputStream getOutputStream gibi metotlar
		 * public InputStream get InputStream() ornegin. yani girdi stream ini donduruyor
		 * public OutputStream get InputStream() ciktiyi donduruyor
		 * public synchronized void close() - soketi kapatiyor.
		 * Public Socket accept()- soketi donduruyor. cleint ile server arasinda bir baglanti kuruyor
		 * public synchronized void close() ile hem sunucu hemde clein i kapatiyorsunuz
		 * 
		 */
		
		/*
		 *  CLEINT SIDE PROGRAMMING
		 *  1) oncelikle Soket baglantiisni kurmaliyiz
		 *  2) IP Adresi ni yani nerden haberlesecegim bunun yaninda TCP baglanti noktasini saglamak gerekiyor
		 *  Istemci ile iletisim
		 *  Kapat
		 */
		
		/*
		 * SERVER SIDE PROGRAMMING
		 * 1) Soket baglantisi kurma
		 * Istemcinin istegini bekler
		 * Istemci ile iletisim
		 * Baglantiyi kapat
		 */
	}

}
