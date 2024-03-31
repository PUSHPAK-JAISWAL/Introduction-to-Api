import java.time.LocalDate;
import java.time.LocalTime;

public class A2 {
    public static void main(String args[]) {
       LocalDate ld = LocalDate.now();
       System.out.println(ld);
       int day = ld.getDayOfMonth();
       int month = ld.getMonthValue();
       int year = ld.getYear();
       System.out.println(day);
       System.out.println(month);
       System.out.println(year);

       LocalTime lt = LocalTime.now();
       System.out.println(lt);
       int hour = lt.getHour();
       int min = lt.getMinute();
       long mm = lt.getNano();
       System.out.println(hour);
       System.out.println(min);
       System.out.println(mm);
    }
}
