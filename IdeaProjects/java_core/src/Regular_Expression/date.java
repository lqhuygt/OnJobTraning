package Regular_Expression;

import java.text.DateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        long nowOther = System.currentTimeMillis();
        Date now = new Date();
        Date tomorrow_1000 = new Date(nowOther + (24 * 60 * 60 *1000*1000L));
        Date yesterday_1000 = new Date(nowOther - (24 * 60 * 60 *1000*1000L));
        long nowInMs = now.getTime();
        System.out.println(yesterday_1000);
        System.out.println(now);
        System.out.println(tomorrow_1000);
        System.out.println(now.before(yesterday_1000));
    }
}
