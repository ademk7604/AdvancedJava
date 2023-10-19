package d04_Generic_Type_Lab;

public class Dog extends Animal{

	public Dog(String firstName) {
		super(firstName);
		
	}
	@Override
	public String toString() {
		return super.toString()+": HAv hav....";
	}

}
