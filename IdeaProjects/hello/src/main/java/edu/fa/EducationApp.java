package edu.fa;


import edu.fa.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EducationApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        StudentService studentService = context.getBean("studentService",StudentService.class);
        System.out.println(studentService.getAllStudent().size());
    }
}
