package create_list_employee;

public class Person {
    public  final double LuongCoBan = 2000000;
    private String ten;
    private Address address;

    public Person(String ten) {
        this.ten = ten;
    }

    public Person() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public double luong(){
        return LuongCoBan;
    }
}
