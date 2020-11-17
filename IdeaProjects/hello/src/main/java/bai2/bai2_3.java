package bai2;

import java.util.Scanner;
import java.util.*;

// Viết hàm kiểm tra 1 phần tử xem có xuất hiện trong list k?
public class bai2_3 {
    public static boolean checkList( List<Integer> list, int n){
        int d = 0;
        boolean e = false;
        for ( int i : list)
            if (i == n) { e = true; }
            else d++;


        if (d == list.size()) e = false;
        return e;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("nhap so: ");
        n = scanner.nextInt();

        System.out.print("nhap mang : ");
        boolean continueEnterValue = true;
        List<Integer> list = new ArrayList<Integer>();
        do {
            try {
                list.add(scanner.nextInt());
            } catch (Exception e) {
                continueEnterValue = false;
            }
        } while (continueEnterValue);
        System.out.println(checkList(list,n));
    }
}
