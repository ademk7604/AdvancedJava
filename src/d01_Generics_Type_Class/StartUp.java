package d01_Generics_Type_Class;

class GenericClass{
	private Object x;
	
	public Object getX() {
		return x;
	}
	public void setX(Object x) {
		this.x=x;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bu generic sinif objesidir";
	}
	public void xSinifiniSoyle() {
		System.out.println(x.getClass().getName());
	}
}

public class StartUp {
	public static void main(String[] args) {
		
		GenericClass g1 = new GenericClass();
		GenericClass g2 = new GenericClass();
		g1.setX(150);
		System.out.println(g1.getX());
		System.out.println(g1.getX().getClass().getName()); //java.lang.Integer
		g2.setX("150");
		System.out.println(g2);
		System.out.println(g2.getX().getClass().getName());
		g2.xSinifiniSoyle();
	}

}
