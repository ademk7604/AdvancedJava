package d17_InterThread;

public class Driver {
	/*threadler arasi haberlesme gorecegiz
	 * 2 threadin birbiri arasinda ayni kaynaktan veri eklemesi ve cekmesini gorecegiz
	 * Producer ve Consumer probleminin nasil cozuldugunu gorecegiz
	 * NEDEN Problem
	 * 1. Producer surekli uretip gerceklestirse ve buffer i doudrursa
	 *  belli bir sure sonra bazi seyler uretilemez hale gelecek
	 * 2. Consumer surekli tuketecek olursa, c. tammaen tukettiginde ortaya hata metdaha gelecek
	 * Kisacasi Producer ve Consumer arasinsa bir senkranizasyon olmali
	 * Asil SORUN, source daki urunleri sirali bir halde verilerin tuketilmesini amacliyorsak,
	 * ve Producer esnasinda, bizim Consumer imiz producer in urettigi degerleri sirayla tuketmiyorsa
	 * bizim burda yine bir problemimiz ortaya cikiyor
	 * YANI AMACIMIZ: Ayni kaynak uzerinde senkron bir sekilde 
	 * uretim ile tuketim islemini gerceklestirmeyi saglamak*/
	public static void main(String[] args) {
		Source source = new Source();
		new Producer(source);
		new Consumer(source);
		//biri kaynagi dolduruyor digeri tuketiyor
		
	}
	

}
