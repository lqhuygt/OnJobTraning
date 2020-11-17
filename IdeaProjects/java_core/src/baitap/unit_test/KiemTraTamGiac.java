package baitap.unit_test;

import java.util.Scanner;

public class KiemTraTamGiac {
    public static void main(String[] args) {
        kiemTraTamGiac(2,0,0);
    }

    public static int kiemTraTamGiac(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Đây là tam giác !");
            if ((a == b) && (b == c) && (c == a)){
                System.out.println("Và là tam giác đều !");
                return 1;
            }else if((a == b) || (b == c) || (c == a)){
                System.out.println("Và là tam giác cân !");
                return 2;
            }else if((a != b) && (b != c) && (c != a)){
                System.out.println("Và là tam giác thường !");
                return 3;
            }
        }else {
            System.out.println("Đây không phải tam giác !");
        }
        return 4;
    }
}
