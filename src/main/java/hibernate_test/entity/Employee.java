package hibernate_test.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id // указываем, что это поле является id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // автоматически генерируемый id
    @Column(name="id") // указываем имя колонки
    private int id;
    @Column(name="name") // указываем имя колонки
    private String name;
    @Column(name="surname") // указываем имя колонки
    private String surname;
    @Column(name="department") // указываем имя колонки
    private String department;
    @Column(name="salary")  // указываем имя колонки
    private int salary;

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }





}
