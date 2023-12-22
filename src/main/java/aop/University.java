package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
private List<Student> students = new ArrayList<>();


public void addStudents(){
    Student st1 = new Student ("Rizvan Karimov",4, 1.8);
    Student st2 = new Student ("Elena Sidorova",2, 2.5);
    Student st3 = new Student ("Ivan Petrov",1, 3.8);
    students.add(st1);
    students.add(st2);
    students.add(st3);
}

public List<Student> getStudents(){
    System.out.println("Information from method getStudents: ");
    System.out.println(students);
    return students;
};
}
