package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    // @Before("execution(public void get*())") // butun classlarin get() methodu ucun isleyir.
    // @Before("execution(public void getBook())") // butun classlarin getBook() methodu ucun isleyir.
    // @Before("execution(public void aop.UniversityLibrary.getBook())") // yalniz UniversityLibrary class-inin getBook() methodu ucun isleyir
    @Before("execution(public void get*(..))") // butun classlarin get() methodu ucun isleyir. (..) - 0 ve ya daha cox argument qebul edecek
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: trying to get a book");
    }

    @Before("execution(public * returnBook())") // butun classlarin returnBook() methodu ucun isleyir.
   public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: trying to return a book");
    }
}
