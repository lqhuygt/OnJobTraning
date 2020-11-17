package create_list_employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui long nhap vao thong tin 3 nhan vien: ");
        for (int i = 0; i <employees.length ; i++) {
            String tenDuong = scanner.nextLine();
            String ten = scanner.nextLine();
            double luong = scanner.nextDouble();

            Address address = new Address(tenDuong);
            Employee employee = new Employee(ten, luong);

            employee.setAddress(address);

            employees[i] = employee;
            scanner.nextLine();
        }
        System.out.println("Thong tin nhan vien nhap vao: ");
        for (Employee employee: employees) {
            System.out.println(employee.getTen() + "dia chi:" + employee.getAddress().getTenDuong()
            + "luong:  " + employee.getLuong());
        }
    }
}
