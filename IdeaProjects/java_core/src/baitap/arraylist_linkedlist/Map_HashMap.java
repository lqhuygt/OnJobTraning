package baitap.arraylist_linkedlist;

import java.time.Period;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(map.get(1));

        Set<Integer> set = map.keySet();

        for (Integer i : set) {
            System.out.println(i + " " + map.get(i));
        }

        System.out.println();
        System.out.println("Sau khi xóa");
        map.remove(1);
        Set<Integer> set1 = map.keySet();

        for (Integer i : set1) {
            System.out.println(i + " " + map.get(i));
        }

        Map<String, Person> personMap = new HashMap<>();
        personMap.put("A", new Person(1));

        Person person = personMap.get("A");
    }
}
