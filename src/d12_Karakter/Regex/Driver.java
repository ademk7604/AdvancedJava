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
		
		
		
	}

}
