package d02_Generic_Type_Interface;

public class StartUp {
public static void main(String[] args) {
	Helper h1 = new Helper();
	String string1 = "546";
	int sayi1 = 478;
	System.out.println(h1.cevir(sayi1));
	System.out.println(h1.tersCeviri(string1));
}
}
