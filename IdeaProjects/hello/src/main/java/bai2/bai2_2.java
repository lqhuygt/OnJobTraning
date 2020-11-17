package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Viết hàm đảo ngược danh sách, tốt nhất là tại chỗ.
public class bai2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kì: ");
        String n = scanner.nextLine();

    }

    public static String getReverse(String str){
        String[] reverse = str.split(" ");
        str = "";
        str = reverse[str.length() -1] + "";
        for (int i = 0; i < reverse.length - 1 ; i++) {
            str = str + reverse[i] + "";
        }
       return str ;
    }
}
