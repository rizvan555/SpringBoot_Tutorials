package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    UniversityLibrary library = context.getBean( UniversityLibrary.class);

    library.getBook();
        System.out.println("---------------------------------------------");
    library.returnBook();
        System.out.println("---------------------------------------------");
    library.getMagazine();
        System.out.println("---------------------------------------------");
    library.returnMagazine();
        System.out.println("---------------------------------------------");
    library.addBook();
        System.out.println("---------------------------------------------");
    library.addMagazine();




//    library.getMagazin("Cosmopolitan");

    context.close();
    }
}
