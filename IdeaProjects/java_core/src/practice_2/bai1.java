package practice_2;

import java.util.Scanner;

public class bai1 {
    /*
        Doc vao day so a co n phan tu la cac so nguyen duong.
        Kiem tra mang co phai la doi xung hay khong .
     */
    public static void main(String[] args) {
        int n;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //kiem tra doi xung
        boolean ok = true;
        int x;
        int mid = n/2;
        for (int i = 0; i <= mid; i++) {
            x = n-1-i;
            if(arr[i] != arr[x]){
                ok=false;
                break;
            }
        }
        if(ok==true){
            System.out.println("mang doi xung");
        }else {
            System.out.println("mang khong doi xung");
        }
    }
}
