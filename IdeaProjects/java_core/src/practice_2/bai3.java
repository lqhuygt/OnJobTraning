package practice_2;

import java.util.Scanner;

public class bai3 {
    /*
        Doc vao mot day so a co n phan tu la cac so nguyen
        nhap vao mot so X. xac dinh vi tri cua so nguyen to tren a gan voi X nhat
     */
    public static void main(String[] args) {
        int n,x,index = -1,min = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n va x : ");
        n = scanner.nextInt();
        x = scanner.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int currentMin = getMin(arr[i],x);
            if(ktSNT(arr[i]) && currentMin < min){
                min = currentMin;
                index = i;
            }
        }
        if(index!=1){ // tim thay gia tri thoa man
            System.out.println("chi so phan tu: " + index + ", gia tri = " + arr[index]);
        }else {
            System.out.println(" khong ton tai gia tri thoa man");
        }
    }

    public static int getMin (int a, int x){
        return Math.abs(a-x);
    }

    public static boolean ktSNT (int n){
        if(n<2){
            return false;
        }
        for (int i = 2; i <= (int)Math.sqrt(n) ; i++) {
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
}
