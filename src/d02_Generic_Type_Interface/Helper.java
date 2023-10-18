package d02_Generic_Type_Interface;

public class Helper implements Donusum<String, Integer>{

	@Override
	public String cevir(Integer x) {
		
		return x.toString();
	}

	@Override
	public Integer tersCeviri(String x) {
		
		return Integer.parseInt(x);
	}
	

}
