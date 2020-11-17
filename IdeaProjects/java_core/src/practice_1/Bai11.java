package practice_1;

import java.util.Scanner;

public class Bai11 {
    /*
        Viet chuong trinh liet ke n so nguyen to dau tien
     */
    public static void main(String[] args) {
        int n,count=0,x=2;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (true){
            if( isNgTo(x) ){
                System.out.printf(x + " ");
                count++;
            }
            if(count==n){
                break;
            }
            if(x==2){
                x++;
            }else {
                x +=2;
            }
        }
    }

    public static boolean isNgTo (int n){
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
