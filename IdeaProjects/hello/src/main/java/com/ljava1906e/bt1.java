package com.ljava1906e;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        String name = new String();
        name = sc.nextLine();
        if(name.equals("alice") || name.equals("pop")){
            System.out.println("da dung ten");
        }else{
            System.out.println("Moi nhap lai");
        }

    }
}
