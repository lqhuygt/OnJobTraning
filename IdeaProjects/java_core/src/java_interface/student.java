package java_interface;

public class student implements Comparable<student>{
    private String studentID;
    private int studentYear;
    private float studentAVGMark;
    private String studentName;

    public student() {

    }

    public student(String studentID) {

    }

    public student(String studentID, int studentYear, float studentAVGMark, String studentName) {
        this.studentID = studentID;
        this.studentYear = studentYear;
        this.studentAVGMark = studentAVGMark;
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    public float getStudentAVGMark() {
        return studentAVGMark;
    }

    public void setStudentAVGMark(float studentAVGMark) {
        this.studentAVGMark = studentAVGMark;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String toString(){
        return "Student{" + " studentID= " + studentID + '\'' +
                ", studentYear=" + studentYear +
                ", studentAVGMark=" + studentAVGMark +
                ", studentName=" + studentName + '\'' + '}';
    }

    @Override
    public int compareTo(student o) {
        String name1 = studentName.substring(studentName.lastIndexOf(" "));
        String name2 = o.studentName.substring(o.studentName.lastIndexOf(" "));
        return name1.compareTo(name2); // gia tri 1 - gia tri 2 > 0 thi swap
    }
}
