package Regular_Expression;
/*
    - Dùng để kiểm tra định dạng email.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "^[a-zA-Z][a-zA-Z0-9]*@{1}[a-zA-Z]+mail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            System.out.println("OK");
        }else {
            System.out.println("Vui long kiem tra lai thong tin email!");
        }
    }
}
