package baitap.kethua;

public class Student extends Person{
    private String msv;

    public Student(String name, int tuoi, String gioiTinh, String msv) {
        super(name, tuoi, gioiTinh);
        this.msv = msv;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
}
