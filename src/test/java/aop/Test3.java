package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        String bookName = universityLibrary.returnBook();
        System.out.println("Returned book: " + bookName);

        context.close();
        System.out.println("Method main ends");
    }
}
