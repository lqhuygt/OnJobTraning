package practice_1;

import java.util.Scanner;

public class Bai6 {
    /*
        Tinh tong S=1+3+5+..+n neu n la so le
                  S=2+4+6+..+n neu n la so chan
     */
    public static void main(String[] args) {
        int n,i;
        long sum=0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if(n%2 == 0){
            i=2;
        }else {
            i=1;
        }

        for (; i <=n ; i+=2) {
            sum +=i;
        }
        System.out.println("result = " + sum);
    }
}
