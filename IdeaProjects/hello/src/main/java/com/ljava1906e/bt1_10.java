package com.ljava1906e;

import java.util.Scanner;

// giải pt bậc 2
public class bt1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c,delta;
        System.out.print("Nhập lần lượt 3 số: ");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        delta = b*b - 4*a*c;
        double x1 = (float)(-b +Math.sqrt(delta))/(2*a) ;
        double x2 = (float)(-b -Math.sqrt(delta))/(2*a);
        float x3 =  -b/2*a;
        if (delta>0){
            System.out.println("pt có 2 nghiệm pb x1= " + x1 + " va x2= "+ x2);
        }else if (delta==0){
            System.out.println("pt có nghiệm kép x1=x2= " + x3);
        }else {
            System.out.println("pt vô nghiệm");
        }
    }
}
