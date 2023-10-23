package d14_RegExQuantifiersLab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDogrulayici {
	private Pattern pattern;
	private Matcher matcher;
	
	private static final String EMAIL_PATTERN = 
			"^[\\w-]+@[a-zA-Z0-9]+\\.[a-z-A-Z]{1,3}";

	public EmailDogrulayici() {
		pattern = Pattern.compile(EMAIL_PATTERN);
		
	}
	public boolean dogrula(final String text) {
		matcher = pattern.matcher(text);
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		EmailDogrulayici eD = new EmailDogrulayici();
		System.out.println(eD.dogrula("devadmkok@gmial.com"));
		System.out.println(eD.dogrula("dev123admkok@gmial.com"));
		System.out.println(eD.dogrula("dev_admkok@gmial.com"));
		System.out.println(eD.dogrula("dev-admkok@gmial.com"));
		System.out.println(eD.dogrula("dev$admkok@gmial.com"));//false
		System.out.println(eD.dogrula("dev_admkok@gmial.comm"));//false
		System.out.println(eD.dogrula("dev_admkok@gmial.c"));
		System.out.println(eD.dogrula("dev_admkok@gmial.comm"));//false
		System.out.println(eD.dogrula("+dev_admkok@gmial.com"));//false
		
		Pattern pattern = Pattern.compile("^fatih.*acikgoz$"); //basi fatih sonu acikgoz olan hersey (.*) .......... gibi
		Matcher matcher = pattern.matcher("fatih kaan acikgoz");
		System.out.println(matcher.find());

	}

}
