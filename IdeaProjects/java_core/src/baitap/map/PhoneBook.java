package baitap.map;

import java.util.Scanner;

public class PhoneBook {
    private String fullName;
    private String phoneNumber;

    public PhoneBook() {
    }

    public PhoneBook(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào họ tên: ");
        fullName = scanner.nextLine();
        System.out.println("Nhập vào số điện thoại: ");
        phoneNumber = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
