package practice_2;

import java.util.Arrays;
import java.util.Scanner;

public class bai6 {
    /*
        Nhap so lieu cho day so nguyen a0,a1,..,aN-1 va mot gia tri X
        gia su day a dc sap xep theo thu tu tang dan. Hay chen gia tri X vao day a
        sao cho van giu duoc tinh sap xep  cua mang.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,x;
        int[] arr;
        n = scanner.nextInt();
        System.out.println("nhap cac phan tu cua mang co: "+ n + " phan tu");
        arr = nhap(n,scanner);
        System.out.println("nhap x:");
        x = scanner.nextInt();

        int index=-1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > x){
                index=i;
                break;
            }
        }
        if(index == -1){
            //chen vao cuoi
            arr[n] = x;
        }
        else{
            //dich phai toan bo cac phan tu tu vi tri index
            for (int i = n; i > index; i--) {
                arr[i]=arr[i-1];
            }
            arr[index] = x;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static int[] nhap(int n, Scanner scanner){
        int[] x = new int[n+1];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        return x;
    }
}
