package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    UniversityLibrary library = context.getBean( UniversityLibrary.class);
    SchoolLibrary library1 = context.getBean( SchoolLibrary.class);
    library.getBook();
    library1.getBook();
    library.returnBook();
    library.getMagazine();




//    library.getMagazin("Cosmopolitan");

    context.close();
    }
}
