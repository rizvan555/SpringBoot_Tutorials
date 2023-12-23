package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration() // создаем фабрику сессий
                .configure("hibernate.cfg.xml") // указываем конфигурационный файл
                .addAnnotatedClass(Employee.class) // указываем класс, который хотим сохранить в БД
                .buildSessionFactory(); // создаем фабрику сессий

        try {
            Session session = factory.getCurrentSession(); // создаем сессию
            session.beginTransaction(); // открываем транзакцию

            // List<Employee> myEmps = session.createQuery("from Employee").getResultList(); // From Employee - bu tablodaki butun melumatlari getirir ve bu Employee classin adi olmalidir.

            List<Employee> myEmps = session.createQuery("from Employee " + "where name='Kamala'").getResultList(); // Kamala adindaki butun elemanlari getirir.


            for (Employee e: myEmps) // выводим список объектов в консоль
                System.out.println(e);



            session.getTransaction().commit(); // закрываем транзакцию

            System.out.println("Done!"); // выводим сообщение в консоль
        }
        finally {
            factory.close(); // закрываем фабрику сессий
        }
    }
}
