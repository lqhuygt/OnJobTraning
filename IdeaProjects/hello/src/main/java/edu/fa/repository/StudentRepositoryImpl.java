package edu.fa.repository;

import edu.fa.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    public List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("huy", "hà nội"));
        return studentList;
    }
}
