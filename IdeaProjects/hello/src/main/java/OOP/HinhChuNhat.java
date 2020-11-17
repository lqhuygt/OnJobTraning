package OOP;

public class HinhChuNhat extends Hinh {
    double dai, rong;

    public HinhChuNhat(Double dai, Double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public String layTen() {
        return null;
    }

    public double tinhChuVi() {
        double chuvi = (dai + rong)*2;
        return chuvi;
    }

    public int Tinh() {
        return 0;
    }

    public double tinhDienTich() {
        return 0;
    }
}
