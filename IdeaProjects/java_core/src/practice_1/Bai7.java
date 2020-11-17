package practice_1;

import java.util.Scanner;

public class Bai7 {
    /*
        Nhap so tu nhien n roi tinh tong: S=1+1/2+1/3+...+1/n
     */
    public static void main(String[] args) {
        int n;
        double sum=0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            sum += (double)1/i;
        }
        System.out.printf("result = %2.3f", sum); // %2.3f lay sau dau phay 3 so va cach 2 khoang trang
    }
}
