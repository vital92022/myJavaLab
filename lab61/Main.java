package lab61;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    private static Collection<Stationery> collection = new Collection<>();

    public static void main(String[] args) throws IOException, InterruptedException {
        //Application application = new Application();
        //application.start();

        Add a;
        Set s;
        Remove r;
        for (int i = 0; i < 10; i++) {
            a = new Add(collection);
            r = new Remove(collection);
            s = new Set(collection);
            a.start();
            r.start();
            s.start();
        }
        GregorianCalendar calendar =  new GregorianCalendar(2017, 0, 22);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "." + (calendar.get(Calendar.MONTH)+1) + "." + calendar.get(Calendar.YEAR));
    }
}
