package practice_1;

import java.util.Scanner;

public class Bai9 {
    /*
        Hay viet chuong trinh tinh tong cac chu so cua mot so nguyen bat ki
     */
    public static void main(String[] args) {
        int n,x,sum=0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while(n>0){
            x = n%10;
            n /= 10;
            sum += x;
        }
        System.out.println("sum= "+ sum);
    }
}
