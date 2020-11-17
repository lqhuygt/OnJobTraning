package baitap.mang;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        float sum = 0;
        System.out.print("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
        int mang[] = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ":");
            mang[i] = scanner.nextInt();
            sum = sum + mang[i];
        }

        System.out.println("Trung bình cộng của mảng = " + sum/n);
    }
}
