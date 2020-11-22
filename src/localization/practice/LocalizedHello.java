package localization.practice;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {

	public static void main(String[] args) {
		Locale currentLocale = new Locale("fr", "CA");
		ResourceBundle resBundle = ResourceBundle.getBundle("localization.practice.ResourceBundle", Locale.getDefault());
		System.out.printf(resBundle.getString("Greeting"));
	}

}
