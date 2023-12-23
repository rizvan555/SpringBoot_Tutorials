package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration() // создаем фабрику сессий
                .configure("hibernate.cfg.xml") // указываем конфигурационный файл
                .addAnnotatedClass(Employee.class) // указываем класс, который хотим сохранить в БД
                .buildSessionFactory(); // создаем фабрику сессий

        try {
            Session session = factory.getCurrentSession(); // создаем сессию
            session.beginTransaction(); // открываем транзакцию


//            session.createQuery("delete Employee").executeUpdate(); // удаляем все объекты из БД (таблицу)

//            Employee emp = session.get(Employee.class, 15); // получаем объект из БД
//            session.delete(emp); // удаляем объект

            session.createQuery("delete Employee where name = 'Rizvan'").executeUpdate(); // удаляем объекты из БД s imenem Rizvan


            session.getTransaction().commit(); // закрываем транзакцию

            System.out.println("Done!"); // выводим сообщение в консоль
        }
        finally {
            factory.close(); // закрываем фабрику сессий
        }
    }
}
