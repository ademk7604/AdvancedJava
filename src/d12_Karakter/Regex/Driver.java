package d12_Karakter.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {
	public static void main(String[] args) {
		/*
		 * RegEx, bir string degerin icerisinde arma yapmamizi saglar
		 * ^ satir baslangici, "Benim ismim" ^Benim dedigimizde Benim ile baslayan
		 * a-z arasindaki h., 0-9 rakamlar
		 * _ ve - iceriyormu?
		 * 3-12 3 ile 12 karakter uzunlugundami?
		 * [a-zA-Z0-9_-]{3,12}$stringin sonunu
		 * 
		 */
		/*
		 * ^ disinda, bazen disinda anlaminda da kullanabiliyoruz
		 * [a-e[p-t]] union birlesim a-e arasinda ya da p-t arasinda
		 * && intersection - kesisim noktasindami
		 * ^a-p a-p arasi disinda 
		 * . herhangi bir harf gelebilir  "ahmet" "..me."
		 * [abc] a b c harfleri
		 * [^abc] a, b ve c harfleri disinda bir harf olma durumu
		 * [a-zA-Z] a-z ya da A-Z arasinda
		 * [a-e[p-t]] a-e ya da p-t arsinda
		 * [a-z && [^bc]] a harfi ya da d-z arasinda(bc haric)
		 * [a-f&&[b-t]] b,c,d,e harflerinden birisi
		 * [a-z&&[^c-g]] c-g disindaki harfler
 		 */
		
		Pattern pattern;
		Matcher matcher;
		
		String arnacakKelime = "Adem";
		String metin = "Adem Jonas Ekrem";
		pattern = Pattern.compile(arnacakKelime, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(metin);
		
		if(matcher.find()) {
			System.out.println(arnacakKelime+" -"+metin+" - metni icerisinde");
		}else {
			System.out.println(arnacakKelime+" -"+metin+"- metni iceirisnde degil");
		}
		
		System.out.println(Pattern.matches(arnacakKelime, metin)); 
		// matches, dogrudan eslesme aradigi icn burda false doner
		System.out.println(Pattern.matches(metin, metin)); 
		// bu dogrudan eslesme olmu oluyor
		
		String ifade = "kedi|kopek";
		String regex = "\\|";
		// \\ ozel olan karakter ozel olmayan karaktere donduruluyor kedi kopek diye ayirdik
		// \\ isareti ozel karakteri normal karaktere cevirir
		
		pattern = Pattern.compile(regex); // yeniden pattern i olusturdum
		matcher = pattern.matcher(ifade); // patern icinde eslesme ariyorum
		if(matcher.find()) {
			String[] kelimeler = ifade.split(regex);
			for(String kelime:kelimeler) {
				System.out.println(kelime);
			}
		}else {
			System.out.println(regex+" karakteri olmadiginda kelimeler ayrilamadi");
		}
		
		// ders uygulama 3 sadika 2.50
		
		ifade = "kalem";
		regex = ".al.."; // . ile karakter sayisini belirtip olanin ariyoruz
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		System.out.println("5 harfli bir stringte 2. harf a 3. harf l mi? "+matcher.find()+" "+ ifade);
		System.out.println("5 harfli bir stringte 2. harf a 3. harf l mi? "+matcher.matches()+" "+ifade);
		
		ifade = "talip";
		matcher = pattern.matcher(ifade);
		System.out.println("5 harfli bir stringte 2. harf a 3. harf l mi? "+matcher.find()+" "+ ifade);
		System.out.println("5 harfli bir stringte 2. harf a 3. harf l mi? "+matcher.matches()+" "+ifade);
		
		ifade = "kiraz";
		regex = ".i...";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		System.out.println("5 harfli bir stringte 2. harf i mi? "+matcher.find()+" "+ ifade);
		System.out.println("5 harfli bir stringte 2. harf i mi? "+matcher.matches()+" "+ifade);
		
		ifade = "b"; // bb yazarsak false verir cunku tek harf ariyoruz suan
		regex = "[abc]";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		System.out.println("abc harflerinde bir harf mi? "+matcher.matches()+" "+ ifade);
		
		ifade = "d";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		System.out.println("abc harflerinde bir harf mi? "+matcher.matches()+" "+ ifade);
		
		regex = "[^abc]";
		ifade = "d";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		System.out.println("abc harfleri disinda bir harf mi? "+matcher.matches()+" "+ ifade);
		
		ifade = "b";
		matcher = pattern.matcher(ifade);
		System.out.println("abc harfleri disinda bir harf mi? "+matcher.matches()+" "+ ifade);
		
		regex = "[a-zA-Z]";
		ifade = "e";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		System.out.println("Kucuk yada Buyuk bir harf mi? "+matcher.find()+" "+ifade);
		
	
		ifade = "1";
		matcher = pattern.matcher(ifade);
		System.out.println("Kucuk yada Buyuk bir harf mi? "+matcher.find()+" "+ifade);
		
		regex = "[a-e[k-y]]";
		ifade = "v";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		System.out.println("a-Enum arasinda ya da k-y arasinda mi? "+matcher.matches()+" "+ifade);
		
		ifade = "g";
		matcher = pattern.matcher(ifade);
		System.out.println("a-Enum arasinda ya da k-y arasinda mi? "+matcher.matches()+" "+ifade);
		
		regex = "[a-z&&[^f-k]]";
		ifade = "t";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		System.out.println("a-z arasinda ve f-k arsi disinda bir harf mi? "+matcher.matches()+" "+ifade);
		
		regex = "[a-z&&[^f-k]]";
		ifade = "tt"; // burada iki harfi verdigimiz ciin false doner
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		System.out.println("a-z arasinda ve f-k arsi disinda iki t harfi var mi? "+matcher.matches()+" "+ifade);
		
		// bunu daha saglikli bir yolla cozecegiz birazdan
		regex = "[a-z&&[^f-k]][a-z&&[^f-k]]"; // iki defa verdigim icin her harften 2 defa olur o yuzden true
		ifade = "tt";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		System.out.println("a-z arasinda ve f-k arsi disinda iki t harfi var mi? "+matcher.matches()+" "+ifade);
		
		ifade = "g";
		matcher = pattern.matcher(ifade);
		System.out.println("a-z arasinda ve f-k arsi disinda bir harf mi? "+matcher.matches()+" "+ifade);
		
		regex = "[a-z&&[^fk]]";
		ifade = "g";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		System.out.println("a-z arasinda ve f yada k harfi disinda bir harf mi? "+matcher.matches()+" "+ifade);
		
		regex = "[a-z&&[^fk]]";
		ifade = "f";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		System.out.println("a-z arasinda ve f yada k harfi disinda bir harf mi? "+matcher.matches()+" "+ifade);
		
		regex = ".al..";
		ifade = "kalem";
		System.out.println(Pattern.matches(regex, ifade)); //matches eslesiyormu?
		
		// a veya b veya c bulunur
		regex = "[abc]"; // = "[a|b|c]" ayni manaya geliyor
		ifade = "b";
		System.out.println(Pattern.matches(regex, ifade));
		
		ifade = "d";
		System.out.println(Pattern.matches(regex, ifade));
		
		//a veya b veya disinda harf bulunur
		regex = "[^abc]";
		ifade = "d";
		System.out.println(Pattern.matches(regex, ifade));
		
		ifade = "c";
		System.out.println(Pattern.matches(regex, ifade));
		
		regex = "[a-z&&[fr]]"; // = regex = "[fr]"; demek istiyorum aslinda
		
		ifade = "r";
		System.out.println(Pattern.matches(regex, ifade));
		
		ifade = "h";
		System.out.println(Pattern.matches(regex, ifade));
		
		regex = "[a-z&&[^de]]"; // a dan z ye  de disindakiler
		ifade = "h";
		System.out.println(Pattern.matches(regex, ifade));
		
		ifade = "e";
		System.out.println(Pattern.matches(regex, ifade));
		regex = "[a-z&&[^d-h]]"; // a dan  z ye d ile h disindakiler
		ifade = "y";
		System.out.println(Pattern.matches(regex, ifade));
		
		ifade = "e";
		System.out.println(Pattern.matches(regex, ifade));
		
		
	}

}
