package baitap.kethua;

public class Manager extends Employee{
    private double luongTrachNhiem;
    private double tienLuongManager;

    public Manager(String name, int tuoi, String gioiTinh, double luongCoBan, double heSoCoBan, double tienLuong, double luongTrachNhiem, double tienLuongManager) {
        super(name, tuoi, gioiTinh, luongCoBan, heSoCoBan, tienLuong);
        this.luongTrachNhiem = luongTrachNhiem;
        this.tienLuongManager = tienLuongManager;
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public double getTienLuongManager() {
        return tienLuongManager;
    }

    public void setTienLuongManager(double tienLuongManager) {
        this.tienLuongManager = tienLuongManager;
    }
}
