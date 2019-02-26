package Collection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;



public class Nine {
    public static void main(String[] args) {
        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMMM-YYYY");
        Locale locale = new Locale("it","ch");

        Locale locale1[] = Locale.getAvailableLocales();

        DateFormat dateFormat;
        for(Locale l : locale1)
        {
           dateFormat= DateFormat.getDateInstance(DateFormat.FULL,l);
            System.out.println( l.getDisplayCountry() +" :  "+dateFormat.format(new Date()));
        }


    }
}
