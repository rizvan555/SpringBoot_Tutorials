package aop;

public class Student {
    private String nameSurname;
    private int course;
    private double avgGrade;

    public Student(String nameSurname, int course, double avgGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    //Getters
    public String getNameSurname() {
        return nameSurname;
    }
    public int getCourse() {
        return course;
    }
    public double getAvgGrade() {
        return avgGrade;
    }

    //Setters
    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
