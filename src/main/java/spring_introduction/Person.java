package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;


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

    //Setters
    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }
    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hey, my lovely Pet!");
        pet.say();
    }


}
