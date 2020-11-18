package View1;

import Controller1.ControllerStudent;
import Model1.Student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentView {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentModels = new ArrayList<>();
        ControllerStudent studentController = new ControllerStudent();
        int choice;
        do {
            System.out.println("1. Add new student records");
            System.out.println("2. Display student records");
            System.out.println("3. Save new records.");
            System.out.println("4. Exit the program");
            System.out.print("your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    studentController.add(studentModels);
                    break;
                case 2:
                    studentController.display(studentModels);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid input... Please try again :(");
            }
        } while (choice != 4);
    }
}