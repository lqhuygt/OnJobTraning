package com.docghifile;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so luong sinh vien: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n ; i++) {
            System.out.println("Moi ban nhap sinh vien thu: " + (i+1));
            SinhVien sinhVien = new SinhVien();
            sinhVien.input();

            //ghi file
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("sinhvien.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(sinhVien);

                fileOutputStream.close();
                objectOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //doc file
            try {
                FileInputStream fileInputStream = new FileInputStream("sinhvien.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                objectInputStream.readObject();

                fileInputStream.close();
                objectInputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            System.out.println("Thong tin cac sinh vien la: " + sinhVien.toString());
        }
    }
}
