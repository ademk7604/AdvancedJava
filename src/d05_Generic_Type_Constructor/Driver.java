package d05_Generic_Type_Constructor;

public class Driver {
	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Corolla", 2020);
		Car car2 = new Car("Peugeot", 208, 2022);
		Car car3 = new Car<String>("Mercedes", "C20", "2021");
		/*
		 * Car<String>("Mercedes", "C20", "2021"); burda String vererek Siniftaki T
		 * (object) olarak kabul edilen ve her typi kabul methodu ezmis oluyoruz. Bu
		 * sekilde T yi belirleyip esnekligi ortadan kaldirip belirledigin Tipte
		 * verileri kayit edebiliyoruz
		 * obje olusturulurken Constuctor a ne oldugunu yani String oldugunu soylemezsek
		 * istedigimizi gecirebiliyoruz. String olarak caktigimizda o sekilde olustuuryoruz
		 */

	}

}
