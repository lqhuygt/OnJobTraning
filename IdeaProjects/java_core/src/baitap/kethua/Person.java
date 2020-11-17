package baitap.kethua;

import java.util.Scanner;

public class Person {
    private String name;
    private int tuoi;
    private String gioiTinh;

    public Person() {
    }

    Scanner scanner = new Scanner(System.in);

    public Person(String name, int tuoi, String gioiTinh) {
        this.name = name;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhap(){
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'';
    }
}
