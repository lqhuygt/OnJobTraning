package com.docghifile;

import java.io.Serializable;
import java.util.Scanner;

public class SinhVien implements Serializable {
    private String msv;
    private String hoTen;
    private float diem;

    public SinhVien() {
    }

    public SinhVien(String msv, String hoTen, float diem) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Moi ban nhap msv: ");
        String msv = scanner.nextLine();
        System.out.println("Moi ban nhap Ho Tên");
        String hoTen = scanner.nextLine();
        System.out.println("Moi ban nhap diem");
        float diem = scanner.nextFloat();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "msv='" + msv + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }
}
