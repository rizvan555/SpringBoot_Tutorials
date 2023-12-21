package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("We are getting a book from UniversityLibrary");
    }

    public String returnBook(){
        System.out.println("We are returning a book to UniversityLibrary");
        return "OK";
    }
    public void getMagazin(){
        System.out.println("We are getting a magazin from UniversityLibrary");
    }
}
