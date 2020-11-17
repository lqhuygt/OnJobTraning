package practice_1;

import java.util.Scanner;

public class Bai8 {
    /*
        Nhap STN n roi liet ke cac uoc so cua no. Co bao nhieu uoc so
     */
    public static void main(String[] args) {
        int n , count=0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nn co " + count + " uoc so");
    }
}
