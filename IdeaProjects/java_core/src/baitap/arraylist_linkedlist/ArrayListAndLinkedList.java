package baitap.arraylist_linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

//        List<Integer> numberList = new ArrayList<>();
//        System.out.println("Xin mời nhập phần tử");
//        int n = scaner.nextInt();
//        for (int i = 0; i < n; i++) {
//            numberList.add(scaner.nextInt());
//        }
//
//        List<Integer> newList = new ArrayList<>();
//        for (int i = 0; i < numberList.size() ; i++) {
//            if (!newList.contains(numberList.get(i))){
//                newList.add(numberList.get(i));
//            }
//        }
//
//        for (int element : newList ) {
//            System.out.print(element + " ");
//        }

        List<String> listSv = new ArrayList<>();
        System.out.println("Xin mời nhập lựa chọn: ");
        while (true) {
            System.out.println(" 1. Thêm sinh viên \n 2. Xóa sinh viên \n 3. Sửa tên sinh viên \n 4.In ra danh sách sinh viên \n 5.Thoát");
            int selected = scaner.nextInt();
            scaner.nextLine();
            if (selected == 5){
                break;
            }
            switch (selected){
                case 1:
                    System.out.println("Nhập tên sinh viên");
                    String name = scaner.nextLine();
                    while (!name.isEmpty()){
                        System.out.println("Nhập tên sinh viên");
                        listSv.add(name);
                        name = scaner.nextLine();
                    }
                    listSv.add(name);
                    break;
                case 2:
                    System.out.println("Nhập phần tử muốn xóa muốn xóa: ");
                    listSv.remove(scaner.nextInt());
                    break;
                case 3:
                    System.out.println("Nhập phần tử muốn sửa: ");
                    listSv.set(scaner.nextInt(), scaner.nextLine());
                    break;
                case 4:
                    System.out.println("-------Danh sách sinh viên-------");
                    for (String namesv : listSv ) {
                        System.out.println(namesv);
                    }
                    break;
            }
        }
    }
}
