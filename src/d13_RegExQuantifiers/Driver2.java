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
		System.out.println(Pattern.matches(regex, "ab")); // false cunku sadece birini ariyor

		regex = "[abc]+";
		System.out.println("[abc]+ a yada b  yada c harlerinden biri bir defa yada birden fazla vardir");
		System.out.println(Pattern.matches(regex, "a"));
		System.out.println(Pattern.matches(regex, "b"));
		System.out.println(Pattern.matches(regex, "c"));
		System.out.println(Pattern.matches(regex, "aa"));
		System.out.println(Pattern.matches(regex, "bb"));
		System.out.println(Pattern.matches(regex, "cc"));
		System.out.println(Pattern.matches(regex, "ab"));
		System.out.println(Pattern.matches(regex, "abc abc")); // false
		System.out.println(Pattern.matches(regex, "ad")); // false d yok s
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

		// . herhangi bir karkter in manasina geliyor
		System.out.println("Herhangi bir karakter oldugunu kontrol eden meta karakter");
		System.out.println(Pattern.matches(".", "."));
		System.out.println(Pattern.matches("\\.", ".")); // (\\) ozel karakterden normal karaktere cevirdik evet . .
															// esittir
		System.out.println(Pattern.matches(".", "1"));
		System.out.println(Pattern.matches(".", "a"));
		System.out.println(Pattern.matches(".", "")); // false

		// d rakam olan karakter i(digit)
		regex = "\\d";
		System.out.println("Rakam kontrolu yapan meta karakteri: ");
		System.out.println(Pattern.matches(regex, "1"));
		System.out.println(Pattern.matches(regex + "*", "1546764334")); // =regex = "\\d*"; o sekilde de olur
		regex = "\\d\\d\\d"; // sadece 3 rakam icerenlere true verir
		System.out.println(Pattern.matches(regex, "234"));
		regex = "\\d*"; // sinirsiz rakam
		System.out.println(Pattern.matches(regex, "2333443"));
		System.out.println(Pattern.matches(regex, "a")); // false

		// D rakam olmayan karakter (non-digit)
		regex = "\\D";
		System.out.println(Pattern.matches(regex, "a"));
		System.out.println(Pattern.matches(regex, "ab")); // false dogrudan eslesme degidl iki karakter var burda
		System.out.println(Pattern.matches(regex + regex, "ab")); // bu sekilde true alirik
		System.out.println(Pattern.matches(regex + "*", "asdasdasdasd"));
		System.out.println(Pattern.matches(regex + "*", "asdasd4dasdasd")); // 4 d. oldugu icin

		// s bosluk olan karakter
		regex = "\\s";
		System.out.println("Bosluk kontolunu saglayan karakter");
		System.out.println(Pattern.matches(regex, " "));
		System.out.println(Pattern.matches(regex + "*", "      "));
		System.out.println(Pattern.matches(regex + "*", ""));
		System.out.println(Pattern.matches(regex + "+", " "));// true
		System.out.println(Pattern.matches(regex + "+", ""));// false
		System.out.println(Pattern.matches(regex + "+", "1"));// false
		System.out.println(Pattern.matches(regex + "+", " 1"));

		// S bosluk olmayan karakter
		regex = "\\S";
		System.out.println("Bosluk degil kontorlunu sag;layan karakter");
		System.out.println(Pattern.matches(regex, "A"));
		System.out.println(Pattern.matches(regex, "a"));
		System.out.println(Pattern.matches(regex, "1"));
		System.out.println(Pattern.matches(regex, "_"));
		System.out.println(Pattern.matches(regex, "-"));
		System.out.println(Pattern.matches(regex, " ")); // false
		String soyad = "Acik goz";
		System.out.println(Pattern.matches(regex + "*", soyad)); // false

		// w kelime karakteri [a-zA-Z_0-9]
		regex = "\\w";
		System.out.println("Kelime karakteri kontorlu yapan meta kararkteri: ");
		System.out.println(Pattern.matches(regex, "fatihkaan")); // birden fazla kararkter oldugu icin false
		System.out.println(Pattern.matches(regex, "f"));
		System.out.println(Pattern.matches(regex, "_"));
		System.out.println(Pattern.matches(regex, "1"));
		System.out.println(Pattern.matches(regex, "!"));
		System.out.println(Pattern.matches(regex, "-")); // - kelime karakter degil false
		System.out.println(Pattern.matches(regex + "*", "fatihkaan1233"));
		System.out.println(Pattern.matches(regex + "*", "2345"));
		System.out.println(Pattern.matches(regex + "*", "fatih_kaan"));
		System.out.println(Pattern.matches(regex + "*", "fatih kaan")); // false bosluk dahil degil
		System.out.println(Pattern.matches("[" + regex + "^ ]*", "fatih kaan")); // bosluk haricinde dedik true
		System.out.println(Pattern.matches("[" + regex + "^z[ ]]*", "fatih kaan"));

		regex = "[\\w[ ]]*"; // [a-zA-Z_0-9 ]* bu demek
		System.out.println(Pattern.matches(regex, "fatih kaan"));

		System.out.println(Pattern.matches(regex, "!")); // false
		regex = "[^\\w]"; // "[\\W]" demektir //^\\w koseli parantessiz kararkterlerle baslayan demektir
		System.out.println(Pattern.matches(regex, "!")); // true
		System.out.println(Pattern.matches(regex, "$")); // true

		// W kelime karakteri degil
		System.out.println("Kelime kararkteri degil kontorlunu yapan meta karkater");
		regex = "\\W"; // [^a-zA-Z_09]
		System.out.println(Pattern.matches("[^a-zA-Z_09]", " "));
		System.out.println(Pattern.matches("[^a-zA-Z_09]", "$"));
		System.out.println(Pattern.matches("[^a-zA-Z_09]", "!"));
		System.out.println(Pattern.matches(regex, " "));
		System.out.println(Pattern.matches(regex, "$"));
		System.out.println(Pattern.matches(regex, "!"));

		System.out.println(Pattern.matches(regex + "*", " %&'"));

		// b kelime karakter isiniri
		regex = "\\bahmet\\b"; // ahmet ile baslayip bitiyormu
		System.out.println(Pattern.matches(regex, "ahmet"));
		regex = "\\bahmet-\\b";
		System.out.println(Pattern.matches(regex, "ahmet-")); // - kelime karrkteri degil false
		regex = "\\-bahmet\\b";
		System.out.println(Pattern.matches(regex, "-ahmet")); // false

		// B kelime karakteri olmayan sinir kontrolu
		regex = "\\B%ahmet%\\B";
		System.out.println(Pattern.matches(regex, "%ahmet%"));
		regex = "\\B%ahmet%\\B";
		System.out.println(Pattern.matches(regex, "%ahmet")); //kelime karakteri ile bitiyor false
		regex = "\\Bahmet!\\B";
		System.out.println(Pattern.matches(regex, "ahmet!"));
		regex = "\\bahmet!\\B";
		System.out.println(Pattern.matches(regex, "ahmet!")); // kelime karakteri ile basladi olmayanla bitirdi true
		
		regex = "\\bahmet!";
		System.out.println(Pattern.matches(regex, "ahmet!"));
		
		regex = "\\b%ahmet!";
		System.out.println(Pattern.matches(regex, "%ahmet!"));
		
		// d - digit
		// D non digit
		// s space
		// S non space
		// w Word Character z-zZ-Z_0-9
		// W non wordCharacter
		
		regex = "\\d\\D\\s\\S\\w\\W";
		System.out.println(Pattern.matches(regex, "1- !_ "));
		System.out.println(Pattern.matches(regex, "karpuz"));
		
		/*
		 * https://www.autoregex.xyz/
		 * sitesinden istedigini otomatik kodunu bulabilirsin
		 * find all words without "ahmet" word
		 * ^(?!.*ahmet)\b\w+\b$
		 */
	}

}
