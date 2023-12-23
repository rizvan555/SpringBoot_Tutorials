package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration() // создаем фабрику сессий
                .configure("hibernate.cfg.xml") // указываем конфигурационный файл
                .addAnnotatedClass(Employee.class) // указываем класс, который хотим сохранить в БД
                .buildSessionFactory(); // создаем фабрику сессий

        try {
            Session session = factory.getCurrentSession(); // создаем сессию
            session.beginTransaction(); // открываем транзакцию

//            Employee emp = session.get(Employee.class, 6); // получаем объект из БД
//            emp.setSalary(1500); // изменяем объект

          session.createQuery("update Employee set salary = 10000 " + "where name = 'Raziya'").executeUpdate(); // обновляем объекты в БД





            session.getTransaction().commit(); // закрываем транзакцию

            System.out.println("Done!"); // выводим сообщение в консоль
        }
        finally {
            factory.close(); // закрываем фабрику сессий
        }
    }
}
