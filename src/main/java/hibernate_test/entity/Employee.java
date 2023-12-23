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
    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    // Getter'lar
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    // Setter'lar
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
