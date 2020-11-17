package baitap.kethua;

import java.util.Scanner;

public class Employee extends Person {
    private double luongCoBan;
    private double heSoCoBan;
    private double tienLuong;

    Scanner scanner = new Scanner(System.in);

    public Employee(String name, int tuoi, String gioiTinh, double luongCoBan, double heSoCoBan, double tienLuong) {
        super(name, tuoi, gioiTinh);
        this.luongCoBan = luongCoBan;
        this.heSoCoBan = heSoCoBan;
        this.tienLuong = tienLuong;
    }

    public Employee() {

    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoCoBan() {
        return heSoCoBan;
    }

    public void setHeSoCoBan(double heSoCoBan) {
        this.heSoCoBan = heSoCoBan;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = scanner.nextDouble();
        System.out.print("Nhập hệ số cơ bản: ");
        heSoCoBan = scanner.nextDouble();
    }

    public double tinhLuong() {
        this.tienLuong = this.luongCoBan * this.heSoCoBan;
        return this.tienLuong;
    }

    @Override
    public String toString() {
        return super.toString() + ", luongCoBan=" + luongCoBan +
                ", heSoCoBan=" + heSoCoBan +
                ", tienLuong=" + tienLuong;
    }
}
