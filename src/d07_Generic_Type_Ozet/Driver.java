package d07_Generic_Type_Ozet;

public class Driver {
	
	public static void main(String[] args) {
		(new Elma<String, String, Integer, Float, Long>()).bilgiVer(1, 1.1, 1.1f);
		(new Elma<String, String, Integer, Float, Long>()).bilgiVer("", "", 1);
		
	}

}
