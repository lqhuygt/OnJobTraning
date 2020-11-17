package bai3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai3_3 {
    public static void main(String[] args) {
        bai3_3 checkClassMate = new bai3_3();
        String name;
        String birthday;
        String email;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời bạn nhập Tên của bạn cùng lớp: ");
            name = scanner.nextLine();
            System.out.println("Mời bạn nhập ngày sinh của bạn đó: ");
            birthday = scanner.nextLine();
            System.out.println("Mời bạn nhập email của bạn đó: ");
            email = scanner.nextLine();
            if (checkClassMate.checkNameAndBirthday(name,birthday) == false ||
                checkClassMate.checkEmail(email) == false){
                System.out.println("Mời bạn nhập lại!");
            }
        }while(checkClassMate.checkNameAndBirthday(name,birthday) == false ||
                checkClassMate.checkEmail(email) == false);
        System.out.println("Tên của bạn đó: " + name);
        System.out.println("Ngày sinh bạn đó: " + birthday);
        System.out.println("Email của bạn đó: " + email);
    }

    public boolean checkNameAndBirthday(String name, String birthday) {
            boolean resultName = false;
            boolean resultBirthday = false;

            String regexName = "^[a-zA-Z]{20}$";
            resultName = name.matches(regexName);
            String regexBirthday = "^\\d{2}/\\d{2}/[1900-2019]$";
            resultBirthday = birthday.matches(regexBirthday);
            return resultName&resultBirthday;
        }

     public boolean  checkEmail (String email){
         boolean resultEmail = false;
         String regexEmail = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}+gmail.com$";
         resultEmail = email.matches(regexEmail);
         return resultEmail;
     }

    }


