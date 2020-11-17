package Regular_Expression;
/*
    sử dung regular expression để:
    - Tìm kiếm gần đúng
    - Thay thế một cụm kí tự bằng một cụm kí tự khác
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phan2 {
   public static void main(String[] args) {
       String input = "    hello    abc   xyz good   night!";
       String regex = "[\\s]+"; //đếm số khoảng trắng
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(input);

    if(matcher.find()){
        System.out.println(matcher.replaceAll(" "));
    }

/*       String[] fullName = {"Trieu Van Than", "Nguyen Thi Hoa", "To Trong Phu", "Nguyen Van Tai",
               "Le Duc Anh", "Do Viet Hung", "Tran Thuy Ha"};
       for (int i = 0; i < fullName.length; i++) {
           CharSequence input;
           matcher = pattern.matcher(fullName[i]);
           if (matcher.find()) {
               System.out.println(fullName[i]);
           }
       } */
   }
}
