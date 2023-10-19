package d04_Generic_Type_Lab;

public class Animal {
	private String firstName;

	//public Animal() {
		
	//}
	public Animal(String firstName) {
		this.firstName=firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	@Override
	public String toString() {
		
		return firstName;
	}
	
}
