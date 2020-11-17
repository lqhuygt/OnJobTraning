package baitap.kethua;

public class Programer extends Student {
   private int namKinhNghiem;

    public Programer(String name, int tuoi, String gioiTinh, String msv, int namKinhNghiem) {
        super(name, tuoi, gioiTinh, msv);
        this.namKinhNghiem = namKinhNghiem;
    }

    public int getNamKinhNghiem() {
        return namKinhNghiem;
    }

    public void setNamKinhNghiem(int namKinhNghiem) {
        this.namKinhNghiem = namKinhNghiem;
    }
}
