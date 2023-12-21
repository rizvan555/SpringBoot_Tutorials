package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("We are getting a book from SchoolLibrary");
    };
}
