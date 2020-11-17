package OOP;

public class HinhVuong extends Hinh {
    double canh;

    @Override
    public String layTen() {
        return null;
    }

    public double tinhChuVi() {
        return 0;
    }

    public int Tinh() {
        return 0;
    }

    public double tinhDienTich() {
        double dienTich = canh*canh;
        return dienTich;
    }
}
