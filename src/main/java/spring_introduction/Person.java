package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;
    private String car;


    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    //Getters
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getCar() {
        return car;
    }

    //Setters
    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }
    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
    public void setCar(String car) {
        System.out.println("Class Person: set car");
        this.car = car;
    }

    public void callYourPet(){
        System.out.println("Hey, my lovely Pet!");
        pet.say();
    }


}
