package d13_RegExQuantifiers;

import java.util.regex.Pattern;

public class Driver {
	public static void main(String[] args) {
		
		//a? a bir defa vardir ya da hic yoktur.
		System.out.println(Pattern.matches("a?", "a")); //true
		System.out.println(Pattern.matches("a?", ""));  //true
		System.out.println(Pattern.matches("a?", "aa"));// false
		System.out.println(Pattern.matches("a?", "b")); //false
		
		//a+ a bir ya da birden fazla vardir. 0.35 saniye 
		
		
		
		
		//a* a hic yok ya da bir yada birden fazla vardir.
		//a{n} a sadece n defa vardir 
		//a{n,} a n defa yada daha fazla vardir.
		//{n,m} a en az n defa en fazla m defa vardir
		
	}

}
