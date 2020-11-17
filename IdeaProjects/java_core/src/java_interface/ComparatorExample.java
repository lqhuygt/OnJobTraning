package java_interface;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
        public static void main(String[] args) {
            ArrayList<student> list = new ArrayList<>();
            list.add(new student("1721050196", 4, 3.25f,
                    "Le Quang Huy"));
            list.add(new student("1721057162", 4, 3.10f,
                    "Tran Van Dao"));
            list.add(new student("1721050293", 4, 3.58f,
                    "Que Ngoc Hieu"));
            list.add(new student("1721052942", 4, 3.21f,
                    "Pham Tuan Thanh"));

            System.out.println("truoc khi sap xep: ");
            for (var x : list) {
                System.out.println(x);
            }

            System.out.println();
            System.out.println("sau khi sap xep theo ten tang dan:");
            Collections.sort(list, new SortByName()); // sap xep theo tieu chi dua ra o phuowng thuc.
            for (var x : list) {
                System.out.println(x);
            }

            System.out.println();
            System.out.println("sau khi sap xep theo diem giam dan:");
            Collections.sort(list, new SortByMark()); // sap xep theo tieu chi dua ra o phuowng thuc.
            for (var x : list) {
                System.out.println(x);
            }

            System.out.println();
            System.out.println("sau khi sap xep theo ID tang dan:");
            Collections.sort(list, new SortByID()); // sap xep theo tieu chi dua ra o phuowng thuc.
            for (var x : list) {
                System.out.println(x);
            }
        }
}

