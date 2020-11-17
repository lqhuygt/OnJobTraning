package practice_2;

import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
    /*
        Nhap 2 mang a[n] , b[n], va so nguyen P(0<= p <= n)
        hay chen mang b[] vao vi tri p cua a[]
     */

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a,b,c;
        int m,n,k,p;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        k = m+n;

        System.out.println("nhap vao mang a[] gom " + m +" phan tu ");
        a = nhap(m);
        System.out.println("nhap vao mang b[] gom " + n + " phan tu");
        b = nhap(n);
        c = new int[k];
        System.out.println("nhap vi tri can chen p :");

        do{
            p = scanner.nextInt();
        }while (p>=m || p<0);

        //copy du lieu tu 2 mang vao mang dich
        for (int i = 0; i < p; i++) {
            c[i] = a[i];
        }

        //copy ca mang b vao mang c
        for (int i = 0; i < n; i++) {
            c[i+p] = b[i];
        }

        //copy phan con lai cua mang a vao mang c
        for (int i = p; i < m; i++) {
            c[i+n] = a[i];
        }

        System.out.println(" mang a[]: " + Arrays.toString(a));
        System.out.println(" mang b[]: " + Arrays.toString(b));
        System.out.println(" mang c[]: " + Arrays.toString(c));
    }

    public static int[] nhap(int n){
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        return x;
    }
}
