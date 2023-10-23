package d13_RegExQuantifiers;

import java.util.regex.Pattern;

public class Driver2 {
	public static void main(String[] args) {

		String regex = "[abc]?";
		System.out.println("[abc]? a yada b  yada c harlerinden biri vardir yada hicbiri yoktur");
		System.out.println(Pattern.matches(regex, "a"));
		System.out.println(Pattern.matches(regex, "b"));
		System.out.println(Pattern.matches(regex, "c"));
		System.out.println(Pattern.matches(regex, ""));
		System.out.println(Pattern.matches(regex, "ab")); //false cunku sadece birini ariyor 

		
		regex = "[abc]+";
		System.out.println("[abc]+ a yada b  yada c harlerinden biri bir defa yada birden fazla vardir");
		System.out.println(Pattern.matches(regex, "a"));
		System.out.println(Pattern.matches(regex, "b"));
		System.out.println(Pattern.matches(regex, "c"));
		System.out.println(Pattern.matches(regex, "aa"));
		System.out.println(Pattern.matches(regex, "bb"));
		System.out.println(Pattern.matches(regex, "cc"));
		System.out.println(Pattern.matches(regex, "ab"));
		System.out.println(Pattern.matches(regex, "abc abc")); //false 
		System.out.println(Pattern.matches(regex, "ad"));		//false d yok s
		System.out.println(Pattern.matches(regex, ""));
		
		
		
		regex = "[abc]*"; // "[abc][abc][abc][abc]....." demektir sonsuz
		System.out.println("[abc]* a b c den biri hic yoktur yada en az bir defa vardir");
		System.out.println(Pattern.matches(regex, "attt"));
		System.out.println(Pattern.matches(regex, "b"));
		System.out.println(Pattern.matches(regex, "c"));
		System.out.println(Pattern.matches(regex, "")); 
		System.out.println(Pattern.matches(regex, "abcd"));
		System.out.println(Pattern.matches(regex, "def"));
		System.out.println(Pattern.matches(regex, "avbaab"));
		
		regex = "[abc]{3}"; // muhakkak 3 karakter olmasi laizm
		System.out.println(Pattern.matches(regex, "aaa"));
		System.out.println(Pattern.matches(regex, "bbb"));
		System.out.println(Pattern.matches(regex, "ccc"));
		System.out.println(Pattern.matches(regex, "abc"));
		System.out.println(Pattern.matches(regex, "aa"));
		System.out.println(Pattern.matches(regex, "ddd"));
		
		regex = "[abc]{3,6}"; // en az 3 en falza a yada b ya da c karaklerini olsun
		System.out.println(Pattern.matches(regex, "aaa"));
		System.out.println(Pattern.matches(regex, "bbb"));
		System.out.println(Pattern.matches(regex, "ccc"));
		System.out.println(Pattern.matches(regex, "abc"));
		System.out.println(Pattern.matches(regex, "aabbc"));
		System.out.println(Pattern.matches(regex, "bbaaac"));
		
		regex = "[abc]{2,}"; // en az 2 tane bu karakterlerden istedigin olsun
		System.out.println(Pattern.matches(regex, "aaa"));
		System.out.println(Pattern.matches(regex, "bbb"));
		System.out.println(Pattern.matches(regex, "cc"));
		System.out.println(Pattern.matches(regex, "abc"));
		System.out.println(Pattern.matches(regex, "aa"));
		System.out.println(Pattern.matches(regex, "bbaaacd"));

	}

}
