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

    public  void getMagazine(){
        System.out.println("We are getting a magazin from UniversityLibrary");
    }
    public void returnMagazine(){
        System.out.println("We are returning a magazin to UniversityLibrary");
    }

    public void addBook(){
        System.out.println("We are adding a book to UniversityLibrary");
    }
    public void addMagazine(){
        System.out.println("We are adding a magazin to UniversityLibrary");
    }





//    public void getMagazin(String magazineName){
//        System.out.println("We are getting a magazin from UniversityLibrary " + magazineName);
//    }
}
