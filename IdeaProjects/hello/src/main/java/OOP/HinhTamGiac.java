package OOP;

public class HinhTamGiac extends Hinh{
    double canh1, canh2, canh3;

    public HinhTamGiac(double canh1, double canh2, double canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    @Override
    public String layTen() {
        return null;
    }

    public double tinhChuVi() {
        double chuvi = canh1 + canh2 + canh3;
        return chuvi;
    }

    public int Tinh() {
        return 0;
    }

    public double tinhDienTich() {
        return 0;
    }
}
