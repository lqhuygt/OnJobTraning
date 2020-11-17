package Regular_Expression;

import java.time.LocalDate;

public class localDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate myDate = localDate.of(1999 , 3, 17);
        System.out.println("MYDATE: " + myDate);

        myDate = myDate.plusDays(1);
        System.out.println("Sau khi + them 1 ngay: " + myDate);
    }
}
