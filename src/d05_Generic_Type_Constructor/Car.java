package d05_Generic_Type_Constructor;

public class Car<T> {

	private T brand;
	private T model;
	private T year;
	//Bu sekilde T her turlu type alir. ama nesne olusturulurken Type yani  T belirlenebilir
	public Car(T brand, T model, T year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public void bilgiVer() {
		String bilgi = "Brand: " + brand + " Model: " + model + " Year: " + year;
		System.out.println(bilgi);
	}

	@Override
	public String toString() {
		return "Brand: " + brand + " Model: " + model + " Yil: " + year;
	}

}
