package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration() // создаем фабрику сессий
                .configure("hibernate.cfg.xml") // указываем конфигурационный файл
                .addAnnotatedClass(Employee.class) // указываем класс, который хотим сохранить в БД
                .buildSessionFactory(); // создаем фабрику сессий

        try {
            Session session = factory.getCurrentSession(); // создаем сессию
            Employee emp = new Employee ("Kamala", "Karimova", "Hr", 3500); // создаем объект
            session.beginTransaction(); // открываем транзакцию
            session.save(emp); // сохраняем объект в БД
            session.getTransaction().commit(); // закрываем транзакцию

            System.out.println("Done!"); // выводим сообщение в консоль
            System.out.println(emp);
        }
        finally {
            factory.close(); // закрываем фабрику сессий
        }
    }
}
