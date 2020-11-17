package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phan4 {
    /*
        - Kiểm tra định dạng mã sinh viên.
     */

    public static void main(String[] args) {
        String input = "1721050196";
        String regex = "^1[4-7]{1}210[1-5]{1}\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            System.out.println("OK");
        }else {
            System.out.println("Vui lòng nhập lại!");
        }
    }
}
