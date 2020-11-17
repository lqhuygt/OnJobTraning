package OOP;

import java.util.Scanner;

public class PhanSo {
    private int tuso,mauso;

    public PhanSo() {

    }

    public PhanSo(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }


    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public int UCLN(int a, int b){
        while (a!=b){
            if(a>b){
                a -= b;
            }else {
                b -=a;
            }
        }
        return a;
    }

    public void toiGianPS(){
        int i = UCLN(this.getTuso(),this.getMauso());
        this.setTuso(getTuso()/i);
        this.setMauso(getMauso()/i);
    }

    public void congPS(PhanSo ps){
        int tuso = this.getTuso() * ps.getMauso() + this.getMauso() * ps.getTuso();
        int mauso = this.getMauso() * ps.getMauso();
        PhanSo phanSoTong = new PhanSo(tuso,mauso);
        phanSoTong.toiGianPS();
        System.out.println("Tong hai phan so = " + phanSoTong.tuso + "/" + phanSoTong.mauso);
    }

    public void truPS(PhanSo ps){
        int tuso = this.getTuso() * ps.getMauso() - this.getMauso() * ps.getTuso();
        int mauso = this.getMauso() * ps.getMauso();
        PhanSo phanSoHieu = new PhanSo(tuso,mauso);
        phanSoHieu.toiGianPS();
        System.out.println("Hieu hai phan so = " + phanSoHieu.tuso + "/" + phanSoHieu.mauso);
    }

    public void nhanPS(PhanSo ps){
        int tuso = this.getTuso() * ps.getMauso() * this.getMauso() * ps.getTuso();
        int mauso = this.getMauso() * ps.getMauso();
        PhanSo phanSoTich = new PhanSo(tuso,mauso);
        phanSoTich.toiGianPS();
        System.out.println("Tich hai phan so = " + phanSoTich.tuso + "/" + phanSoTich.mauso);
    }

    public void chiaPS(PhanSo ps){
        int mauso = this.getMauso() * ps.getMauso() / this.getMauso() * ps.getTuso() ;
        PhanSo phanSoThuong = new PhanSo(tuso,mauso);
        phanSoThuong.toiGianPS();
        System.out.println("Thuong hai phan so = " + phanSoThuong.tuso + "/" + phanSoThuong.mauso);
    }

    public static void main(String[] args) {

        PhanSo phanSo1 = new PhanSo(12,3);
        PhanSo phanSo2 = new PhanSo(4,6);
        
        phanSo1.congPS(phanSo2);
        phanSo1.truPS(phanSo2);
        phanSo1.nhanPS(phanSo2);
        phanSo1.chiaPS(phanSo2);
    }
}
