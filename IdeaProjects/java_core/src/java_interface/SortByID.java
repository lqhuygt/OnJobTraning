package java_interface;

import java.util.Comparator;

public class SortByID implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        return o1.getStudentID().compareTo(o2.getStudentID());
    }
}
