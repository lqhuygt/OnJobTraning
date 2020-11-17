package com.ljava1906e;

import java.util.Scanner;

public class bt1_4and5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,tong=0;
        System.out.printf("Nhập số n: ");
        n = scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            if(i%3==0 || i%5==0) {
                tong += i;
            }
        }
        System.out.printf("Tổng từ 1 đến " + n + " là bội của 3 và 5 là:" + tong);
    }
}
