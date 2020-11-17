package java_interface;

// sử dụng comparable interface.

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
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
        for(var x: list){
            System.out.println(x);
        }

        System.out.println("sau khi sap xep:");
        Collections.sort(list); // sap xep theo tieu chi dua ra o phuowng thuc.
        for(var x: list){
            System.out.println(x);
        }
    }
}
