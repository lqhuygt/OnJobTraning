package practice_1;

import java.util.Scanner;

public class Bai14 {
    /*
        Nhap 2 so tu nhien m va n sao cho m<n. Hay liet ke cac so chinh phuong trong doan [m,n]
        Co bao nhieiu so chinhs phuong.
     */
    public static void main(String[] args) {
        int m,n,count=0;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();

        if((m>=0 && n>=0) || n>=0){
            for(int i=m; i<=n; i++){
                if(n>=0){
                    if((int)Math.sqrt(i) * (int)Math.sqrt(i) == i){
                        count++;
                        System.out.printf("%10d",i);
                        if(count%10==0){
                            System.out.println();
                        }
                    }
                }
            }
        }
        System.out.println("\nso luong so chinh phuong la: " + count);
    }
}
