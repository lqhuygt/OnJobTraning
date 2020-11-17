package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phan5 {

    // - Kiểm tra định dạng số điện thoại.

    public static void main(String[] args) {
        String phoneNumber = "(098).212.4444";
        String input = "0398902420";

        String regex1 = "^[(]{1}09[2-8][)]{1}.\\d{3}.\\d{4}$" ;
        String regex2 = "^03[1-9]\\d{7}";
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher1 = pattern1.matcher(phoneNumber);
        Matcher matcher2 = pattern2.matcher(input);

        if(matcher1.find()){
            System.out.println("OK");
        }else {
            System.out.println("Vui lòng nhập lại!");
        }

        if(matcher2.find()){
            System.out.println("OK");
        }else {
            System.out.println("Vui lòng nhập lại!");
        }
    }
}