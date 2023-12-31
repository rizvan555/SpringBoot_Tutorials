package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {


    // Pointcut - "get" ile baslayanalari birlesdirmek ucundur.
@Pointcut ("execution(* aop.UniversityLibrary.get*(..))")
private void allGetMethodsFromUniversityLibrary(){}
    @Before("allGetMethodsFromUniversityLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    // Pointcut - "return" ile baslayanalari birlesdirmek ucundur.
    @Pointcut("execution(* aop.UniversityLibrary.return*(..))")
    private void allReturnMethodsFromUniversityLibrary(){}
    @Before("allReturnMethodsFromUniversityLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    // Pointcut - "add" ile baslayanalari birlesdirmek ucundur.
    @Pointcut ("execution(* aop.UniversityLibrary.add*(..))")
    private void allAddMethodsFromUniversityLibrary(){}
    @Before("allAddMethodsFromUniversityLibrary()")
    public void beforeAddLoggingAdvice(){






        System.out.println("beforeAddLoggingAdvice: writing Log #3");
    }


// Her üc pointcut-i birlesdirmek ucundur:
    @Pointcut("allGetMethodsFromUniversityLibrary() || allReturnMethodsFromUniversityLibrary() || allAddMethodsFromUniversityLibrary()")
    private void allGetAndReturnAndAddMethodsFromUniversityLibrary(){}
    @Before("allGetAndReturnAndAddMethodsFromUniversityLibrary()")
    public void beforeGetAndReturnAndAddLoggingAdvice(){
        System.out.println("beforeGetAndReturnAndAddLoggingAdvice: writing Log #4");

    }





//    // @Before("execution(public void get*())") // butun classlarin get() methodu ucun isleyir.
//    // @Before("execution(public void getBook())") // butun classlarin getBook() methodu ucun isleyir.
//    // @Before("execution(public void aop.UniversityLibrary.getBook())") // yalniz UniversityLibrary class-inin getBook() methodu ucun isleyir
//    @Before("execution(public void get*(..))") // butun classlarin get() methodu ucun isleyir. (..) - 0 ve ya daha cox argument qebul edecek
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: trying to get a book");
//    }
//
//    @Before("execution(public * returnBook())") // butun classlarin returnBook() methodu ucun isleyir.
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: trying to return a book");
//    }
}
