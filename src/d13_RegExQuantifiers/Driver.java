package d13_RegExQuantifiers;

import java.util.regex.Pattern;

public class Driver {
	public static void main(String[] args) {

		// a? a bir defa vardir ya da hic yoktur.
		System.out.println(Pattern.matches("a?", "a")); // true
		System.out.println(Pattern.matches("a?", "")); // true
		System.out.println(Pattern.matches("a?", "aa"));// false
		System.out.println(Pattern.matches("a?", "b")); // false

		System.out.println("+ sembolunun incelenmesi");
		// a+ a bir ya da birden fazla vardir.
		System.out.println(Pattern.matches("a", "a"));
		System.out.println(Pattern.matches("a", "aa"));
		System.out.println(Pattern.matches("a", "")); // false
		System.out.println(Pattern.matches("a", "b")); // false

		System.out.println("* sembolunun incelenmesi");
		// a* a hic yok ya da bir yada birden fazla vardir.
		System.out.println(Pattern.matches("a*", "a"));
		System.out.println(Pattern.matches("a*", "aa"));
		System.out.println(Pattern.matches("a*", "aaa"));
		System.out.println(Pattern.matches("a*", ""));
		System.out.println(Pattern.matches("a*", "b")); // false

		System.out.println("a{n} sembolunun incelenmesi");
		// a{n} a sadece n defa vardir
		System.out.println(Pattern.matches("a{4}", "aaaa"));
		System.out.println(Pattern.matches("a{4}", "aaa"));
		System.out.println(Pattern.matches("a{4}", "aaaaa"));

		System.out.println("a{n} sembolunun incelenmesi");
		// a{n,} a n defa yada daha fazla vardir.
		System.out.println(Pattern.matches("a{2,}", "aa"));
		System.out.println(Pattern.matches("a{2,}", "aaa"));
		System.out.println(Pattern.matches("a{2,}", "aaaaaa"));
		System.out.println(Pattern.matches("a{2,}", "a")); // false
		System.out.println(Pattern.matches("a{2,}", "")); // false

		System.out.println("a{n,m} sembolunun incelenmesi");
		// {n,m} a en az n defa en fazla m defa vardir
		System.out.println(Pattern.matches("a{2,5}", "aa"));
		System.out.println(Pattern.matches("a{2,5}", "aaa"));
		System.out.println(Pattern.matches("a{2,5}", "aaaa"));
		System.out.println(Pattern.matches("a{2,5}", "aaaaa"));
		System.out.println(Pattern.matches("a{2,5}", "")); // false
		System.out.println(Pattern.matches("a{2,5}", "bbb"));// false
		
		

	}

}
