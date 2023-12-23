package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration() // создаем фабрику сессий
                .configure("hibernate.cfg.xml") // указываем конфигурационный файл
                .addAnnotatedClass(Employee.class) // указываем класс, который хотим сохранить в БД
                .buildSessionFactory(); // создаем фабрику сессий

        try {
            Session session = factory.getCurrentSession(); // создаем сессию
            Employee emp = new Employee ("Raziya", "Karimova", "Engineering", 4000); // создаем объект
            session.beginTransaction(); // открываем транзакцию
            session.save(emp); // сохраняем объект в БД
            session.getTransaction().commit(); // закрываем транзакцию

            // Eger son elave etdiyimiz obyekti(Karimov Bahram) yeniden goturmek isteyirikse
            int myId = emp.getId(); // получаем id объекта
            session = factory.getCurrentSession(); // создаем сессию
            session.beginTransaction(); // открываем транзакцию
            Employee emp1 = session.get(Employee.class, myId); // получаем объект из БД
            session.getTransaction().commit(); // закрываем транзакцию


            System.out.println("Done!"); // выводим сообщение в консоль
            System.out.println(emp1);
        }
        finally {
            factory.close(); // закрываем фабрику сессий
        }
    }
}
