package edu.fa.service;

import edu.fa.model.Student;
import edu.fa.repository.StudentRepository;
import edu.fa.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl() {
    }

    public StudentServiceImpl(StudentRepository studentRepository) {
        System.out.println("Constructor Injection");
        this.studentRepository = studentRepository;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudent() {
        return studentRepository.getAllStudent();
    }
}
