package Homeworkl.lesson15.Students;

import java.util.Scanner;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add student");
            System.out.println("please input 2 for print all student");
            System.out.println("please input 3 for print student  count");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                case 1:
                    addstudent();
                case 2:
                    studentStorage.print();
                case 3:

                    System.out.println(studentStorage.getsize());
                default:
                    System.out.println("Invalid command try again");
            }

        }


    }

    private static void addstudent() {
        System.out.println("please input student name");
        String name = scanner.nextLine();
        System.out.println("please input student Surname");
        String surname = scanner.nextLine();
        System.out.println("please input student age");
        String ageStr = scanner.nextLine();
        System.out.println("please input student phonenumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("please input student city");
        String city = scanner.nextLine();
        int age = Integer.parseInt(ageStr);
        Student student = new Student(name, surname, age, phoneNumber, city);
        System.out.println("STUDENT OBJECT");
        System.out.println(student);
        studentStorage.add(student);
        System.out.println("thank you");
    }
}