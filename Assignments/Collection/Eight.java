package Collection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Eight {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMMM-YYYY");
        System.out.println(dateFormat.format(Calendar.getInstance().getTime()));
    }
}
