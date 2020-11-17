package OOP;

public class Main {
    public static void main(String[] args) {
        Hinh htg = new HinhTamGiac(1.5d, 4.7d, 5.2d);
        Hinh hcn = new HinhChuNhat(4d,6d);
        System.out.print(((Hinh)htg).tinhChuVi() + " " + ((Hinh)hcn).tinhChuVi());

    }
}
