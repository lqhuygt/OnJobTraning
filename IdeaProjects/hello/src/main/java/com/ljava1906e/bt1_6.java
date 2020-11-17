package com.ljava1906e;

import java.util.Scanner;

public class bt1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soBiMat = 7;
        int n;
        int dem=0;
        while (true) {
            System.out.printf("Mời bạn đoán số bí mật: ");
            n = scanner.nextInt();
            dem++;
            if (n > soBiMat) {
                System.out.println("Số bạn đoán lớn hơn số bí mật");;
            } else if (n < soBiMat) {
                System.out.println("Số bạn đoán nhỏ hơn số bí mật");
            } else {
                System.out.println("Bạn đã đoán đúng");
                break;
            }
        }
        System.out.printf("số lần thử là: " + dem);
    }
}
