package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("*++++++++++++++++++++++++++++++++++++++++*");

    Person person = context.getBean("myPerson", Person.class);
    person.callYourPet();

        System.out.println("*++++++++++++++++++++++++++++++++++++++++*");

        System.out.println("Surname: " + person.getSurname());
        System.out.println("Age: " + person.getAge());


    context.close();
    }
}
