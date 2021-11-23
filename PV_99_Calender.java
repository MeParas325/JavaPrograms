import java.util.Calendar;
import java.util.TimeZone;

public class PV_99_Calender {
    public static void main(String[] args) {
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getTimeZone());
        // System.out.println(c.getCalendarType());

        // Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        // System.out.println(c1.getTimeZone().getID());
        // System.out.println(c1.getCalendarType());

        Calendar c2 = Calendar.getInstance();
        System.out.println(c2.getTimeZone().getID());
        System.out.println(c2.getCalendarType());
    }
}
