package d14_RegExQuantifiersLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class driver {
	public static void main(String[] args) {
		Pattern pattern;
		Matcher matcher;
		String regExPattern;
		String text;
		Scanner sc = new Scanner(System.in);
		boolean varMi = true;
		while (true) {

			System.out.print("Bir RegEx modeli giriniz: ");
			regExPattern = sc.nextLine();

			pattern = Pattern.compile(regExPattern);

			System.out.print("Bir metin giriniz: ");
			text = sc.nextLine();

			matcher = pattern.matcher(text);

			while (matcher.find()) {
				System.out.println("Basangic indeksi: " + matcher.start());
				System.out.println("Bitis indeksi: " + matcher.end());
				System.out.println("Bulunan metin: -" + matcher.group());
				varMi = true;
			}
			if (!varMi) {
				System.out.println("girilen regExPattern e uygun eslesme bulunamadi");
			}
		}

	}

}
