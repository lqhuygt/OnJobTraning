package OOP;

import java.util.Scanner;

public class canbo {
    String hoTen;
    String namSinh;
    String gioiTinh;
    String diaChi;

    public canbo() {
    }

    public canbo(String hoTen, String namSinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.println(" Nhap nam sinh: ");
        namSinh = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        gioiTinh = scanner.nextLine();
    }

    public  void output(){
        System.out.println("Ten: " + hoTen + " Nam sinh: " + namSinh + "Gioi tinh: "
                            + gioiTinh + " Dia chi:" + diaChi);
    }
}
