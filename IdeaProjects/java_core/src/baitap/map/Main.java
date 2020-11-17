package baitap.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, PhoneBook> phoneBookHashMap = new HashMap<>();

//        PhoneBook phoneBookSet = new PhoneBook();
//        phoneBookSet.setFullName("Huy");
//        phoneBookSet.setPhoneNumber("03989902420");
//        phoneBookHashMap.put(phoneBookSet.getFullName(),phoneBookSet);

        Map<String, PhoneBook> phoneBookHashMap1 = new HashMap<>();
        System.out.println("Xin mời nhập vào lựa chọn: ");
        while (true){
            System.out.println(" 1. Thêm danh bạ \n 2. Tìm kiếm và hiển thị số điện thoại theo tên \n" +
                    " 3. Tìm kiếm và hiển thị tên theo số điện thoại \n 4. xóa liên hệ trong danh bạ \n 5. Thoát");
            int selected = scanner.nextInt();
            scanner.nextLine();
            if (selected == 5){
                break;}

            switch (selected){
                case 1:
                    //Thêm mới một phần tử trong danh bạ
                    System.out.print("Mời bạn nhập vào số số liên hệ trong danh bạ: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập liên hệ thứ " + (i+1) + ": ");
                        PhoneBook phoneBook = new PhoneBook();
                        phoneBook.input();
                        phoneBookHashMap.put(phoneBook.getFullName(), phoneBook);
                        phoneBookHashMap1.put(phoneBook.getPhoneNumber(), phoneBook);
                    }

                    //in ra thông tin danh bạ
                    System.out.println();
                    System.out.println("Thông tin danh bạ vừa nhập là: ");
                    Set<String> set = phoneBookHashMap.keySet();
                    for (String pb: set) {
                        System.out.println(phoneBookHashMap.get(pb.toString()));
                    }
                    break;
                case 2:
                    //Tìm kiếm theo họ tên
                    System.out.println();
                    System.out.println("Nhập vào tên danh bạ bạn muốn tìm kiếm: ");
                    try {
                        String pbName = scanner.nextLine();
                        PhoneBook pbFind = phoneBookHashMap.get(pbName);

                        //hiển thị thông tin đã tìm kiếm theo tên
                        System.out.println();
                        System.out.println("Thông tin đã tìm kiếm theo tên là: ");
                        System.out.println(pbFind.toString());
                    }catch (Exception e){
                        System.out.println("Không tìm thấy tên trong danh bạ: " + e);
                    }
                    break;
                case 3:
                    //Tìm kiếm theo họ tên
                    System.out.println();
                    System.out.println("Nhập vào số điện thoại bạn muốn tìm kiếm: ");
                    try {
                        String pbNumber = scanner.nextLine();
                        PhoneBook pbFindNumber = phoneBookHashMap1.get(pbNumber);

                        //hiển thị thông tin đã tìm kiếm theo tên
                        System.out.println();
                        System.out.println("Thông tin đã tìm kiếm theo số điện thoại là: ");
                        System.out.println(pbFindNumber.toString());
                    }catch (Exception e){
                        System.out.println("Không tìm thấy số điện thoại trong danh bạ: " + e);
                    }
                    break;
                case 4:
                    // remove liên hệ từ danh bạ
                    System.out.println();
                    System.out.println("Nhập vào tên liên hệ bạn muốn xóa: ");
                    String removeName = scanner.nextLine();
                    if(phoneBookHashMap.containsKey(removeName)){
                        phoneBookHashMap.remove(removeName);

                        //hiển thị danh sách danh bạ sau khi xóa
                        System.out.println();
                        System.out.println("Danh sách danh bạ sau khi xóa là: ");
                        Set<String> setRemove = phoneBookHashMap.keySet();
                        for (String pb : setRemove) {
                            System.out.println(phoneBookHashMap.get(pb.toString()));
                        }
                    }else {
                        System.out.println("Không tìm thấy tên trong danh bạ! ");
                    }
                    break;
            }
        }
    }
}
