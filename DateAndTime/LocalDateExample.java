import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());

        System.out.println(LocalDate.of(2016, 1, 1));

        // System.out.println(LocalDate.of(2016, 14, 1));
        // Invalid value for MonthOfYear (valid values 1 - 12): 14

        System.out.println(LocalDate.of(2016, Month.FEBRUARY, 1));

        System.out.println(LocalDate.now().plusDays(180L));


    }
}