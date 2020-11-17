package baitap.mang;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();

        int mang[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            mang[i] = scanner.nextInt();
        }

        //In ra màn hình mảng vừa nhập
        System.out.print("Các phần tử bạn vừa nhập là: ");
        for (int m: mang) {
            System.out.print(m + " ");
        }

        // In ra màn hình mảng đảo ngược
        System.out.println();
        for (int i = 0; i < n/2 ; i++) {
            int temp=mang[i];
            mang[i]=mang[n-1-i];
            mang[n-1-i]=temp;
        }
        System.out.print("Các phần tử sau khi đảo ngược là: ");
        for (int i = 0; i <n ; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();

        //tìm giá trị lớn nhất nhỏ nhất trong mảng
        int max = mang[0];
        int min = mang[0];
        for (int i = 0; i < mang.length ; i++) {
            if (mang[i]<min){
                min = mang[i];
            }
            if (mang[i]>max){
                max = mang[i];
            }
        }
        System.out.println("giá trị nhỏ nhất là: " + min + " và " + "giá trị lớn nhất là: " + max);

        //tìm các số nguyên tố trong mảng
        System.out.print("Các số nguyên tố trong mảng là: ");
        for (int i = 0; i < mang.length ; i++) {
            if (nguyento(mang[i])){
                System.out.print(mang[i] + " ");
            }
        }

        //sắp xếp và in mảng theo thứ tự tăng dần
        System.out.println();
        System.out.print("Mảng sau khi sắp xếp theo thứ tự tăng dần: ");
        for (int i = 0; i < mang.length; i++) {
            for (int j = i+1; j < mang.length; j++) {
                if (mang[i] > mang[j]){
                    int temp = mang[j];
                    mang[j] = mang[i];
                    mang[i] = temp;
                }
            }
            System.out.print(mang[i] + " ");
        }

    }

    public static boolean nguyento(int n) {

        if (n<2) return false;

        int i;

        for (i = 2; i <= sqrt(n); i++)

            if (n % i == 0)

                return false;

        return true;

    }
}
