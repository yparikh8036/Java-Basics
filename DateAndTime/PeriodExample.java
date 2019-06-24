import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {

        Period period = Period.between(LocalDate.of(2016, Month.JANUARY, 1), LocalDate.of(2018, Month.JULY, 18));
        System.out.println(period.getYears() + "\n " + period.getMonths() + "  \n" + period.getDays() + " \n" + period);
    }
}