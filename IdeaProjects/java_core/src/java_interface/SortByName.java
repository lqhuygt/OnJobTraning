package java_interface;

import java.util.Comparator;

public class SortByName implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        String name1 = o1.getStudentName().substring(o1.getStudentName().lastIndexOf(" "));
        String name2 = o2.getStudentName().substring(o2.getStudentName().lastIndexOf(" "));
        return name1.compareTo(name2);
    }
}
