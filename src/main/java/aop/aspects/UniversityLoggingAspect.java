package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {


    @Before("execution(* get*(..))")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: logging attempt to get a list of students before method getStudents");
    }

    @AfterReturning(pointcut = "execution(* get*(..))", returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students){
    Student firstStudent = students.get(0);

    String nameStudent = firstStudent.getNameSurname();
    nameStudent = "Mr. " + nameStudent; // telebeninn adini deyishirik
    firstStudent.setNameSurname(nameStudent);

    int course = firstStudent.getCourse();
    course = course + 1;
    firstStudent.setCourse(course);

    double avgGrade = firstStudent.getAvgGrade();
    avgGrade = avgGrade + 1;
    firstStudent.setAvgGrade(avgGrade);


        System.out.println("afterGetStudentsLoggingAdvice: logging attempt to get a list of students after method getStudents");
    }
}
