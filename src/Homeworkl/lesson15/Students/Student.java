package Homeworkl.lesson15.Students;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String phonenumber;
    private String city;


    public Student(String name, String surname, int age, String phonenumber, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phonenumber = phonenumber;
        this.city = city;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phonenumber='" + phonenumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public void setCity(String city) {
        this.city = city;


    }
}
