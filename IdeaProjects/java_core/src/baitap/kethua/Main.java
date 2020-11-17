package baitap.kethua;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // sử dụng mảng
        System.out.print("Nhập số nhân viên trong công ty: ");
        int soNhanVien = scanner.nextInt();
        Employee[] employees = new Employee[soNhanVien];

        System.out.println("Nhập thông tin nhân viên");
        for (int i = 0; i < soNhanVien ; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].nhap();
            employees[i].tinhLuong();
        }

        System.out.println("Thông tin của các nhân viên trong công ty: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(employees[i].toString());
        }
        // sắp xếp lương theo chiều giảm dần
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            for (int j = i+1; j < employees.length; j++) {
                if (employees[i].getTienLuong() < employees[j].getTienLuong()){
                    Employee temp = new Employee();
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        System.out.println("Danh sách nhân viên sau khi sắp xếp theo lương giảm dần là: ");
        for (int i = 0; i < employees.length ; i++) {
            System.out.println(employees[i].toString());
        }

//        // sử dụng colections
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số nhân viên: ");
//        int n = scanner.nextInt();
//
//        List<Employee> employeeList = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            scanner.nextLine();
//            Employee employee = new Employee();
//            System.out.println("Nhập Sinh viên thứ " + (i+1));
//            employee.nhap();
//            employee.tinhLuong();
//            employeeList.add(employee);
//        }
//
//        System.out.println("Danh sách nhân viên vừa nhập là: ");
//        for (Employee emp : employeeList){
//            System.out.println(emp.toString());
//        }
//
//        //sắp xếp lương theo chiều giảm dần
//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if (o1.getTienLuong() < o2.getTienLuong()) {
//                    return 1;
//                } else {
//                    if (o1.getTienLuong() == o2.getTienLuong()) {
//                        return 0;
//                    } else {
//                        return -1;
//                    }
//                }
//            }
//        });
//
//        System.out.println();
//        System.out.println("Danh sách sắp xếp nhân viên theo tiền lương giảm dần là: ");
//        for (Employee emp: employeeList) {
//            System.out.println(emp.toString());
//        }
    }
}
