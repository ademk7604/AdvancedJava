package d06_Generic_MultipleType;

public class Driver {
	public static void main(String[] args) {
		
		Insan insan1 = new Insan("Ahmet", 1.73, 95.5f);
		Insan insan2 = new Insan("Mehmet", 2, 90.2);
		/*	
		insan1.bilgiVer();
		insan2.bilgiVer();	
		*/
		Student student1 = new Student("17545655", "Ahmet Mas", "2017");
		Student student2 = new Student<Long, String, Integer>(202654122215552L, "Adem Fatih", 2018);
		
		student1.bilgiVer();
		student2.bilgiVer();
		
	}

}
