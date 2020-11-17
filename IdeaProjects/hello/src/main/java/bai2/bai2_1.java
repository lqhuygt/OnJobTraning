package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

// Write a function that returns the largest element in a list.
public class bai2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập số lượng phần tử vào 1 mảng: ");
        int n;
        n = scanner.nextInt();
        int[] max = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] = ");
            max[i] = scanner.nextInt();
        }
        System.out.println( findMax(max,n));
    }

    public static int findMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
