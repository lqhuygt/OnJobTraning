package com.ljava1906e;

import java.util.ArrayList;
import java.util.Scanner;

public class bt1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.print("Nhập chuỗi :");
        s = scanner.nextLine();
        char arr[] = s.toCharArray();

        for (int  i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
        }

    }
}
