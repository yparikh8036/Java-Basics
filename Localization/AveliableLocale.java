import java.util.Arrays;
import java.util.Locale;

public class AveliableLocale {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        Locale[] locales = Locale.getAvailableLocales();
        System.out.println(locales.length);
        Arrays.stream(locales).filter(locale -> locale.getLanguage().equals("en")).forEach(System.out::println);
    }
}