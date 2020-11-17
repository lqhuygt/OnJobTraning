package Regular_Expression;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormat {
    public static void main(String[] args)  {
//        Date now = new Date();
//        String pattern;
//        SimpleDateFormat simpleDateFormat
//                = new SimpleDateFormat("E dd/MM/yyyy hh:mm:ss:a z");
//        String myTime = simpleDateFormat.format(now);
//        System.out.println(myTime);
        Date now ;
        SimpleDateFormat simpleDateFormat
               = new SimpleDateFormat(" dd/MM/yyyy ");
        String input = "17/3/2078";

        try {
            now = simpleDateFormat.parse(input);
            System.out.println(now);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
