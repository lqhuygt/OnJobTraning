package practice_1;

import java.util.Scanner;

public class Bai10 {
    /*
        Viet chuong trinh phan tich mot so nguyen thanh thua so
        nguyen to VD: 28 = 2x2x7
     */
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i=2;
        if(n==1){
            System.out.println(n + " = " + n);
        }else {
            System.out.printf(n + " = ");
            while(n!=1){
                if(n%i==0){
                    System.out.printf(i + " x ");
                    n/=i;
                }else {
                    i++;
                }
            }
            System.out.printf("\b\b\b");
        }
    }
}
