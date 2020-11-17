package java_interface;

import java.util.Comparator;

public class SortByMark implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        float res = o1.getStudentAVGMark() - o2.getStudentAVGMark();
        if(res > 0){
            return -1; // do nothing
        }
        else if(res < 0){
           return 1; // swap o1,o2
        }
        return 0;
    }
}
