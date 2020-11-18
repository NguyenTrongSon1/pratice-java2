package Controller1;

import Model1.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerStudent {
    Scanner sc = new Scanner(System.in);

    public void add(ArrayList<Student> arr) {
        System.out.println("---------------------------");
        String addNext;
        do {
            System.out.print("enter StudentID: ");
            String newID = sc.nextLine();
            System.out.print("enter Student Name: ");
            String newName = sc.nextLine();
            System.out.print("Enter Address of Student: ");
            String newAddress = sc.nextLine();
            System.out.print("enter Phone number of student: ");
            String newPhone = sc.nextLine();
            
            arr.add(new Student(newID, newName, newAddress, newPhone));
            System.out.println("The student you just add is: " + arr.get(arr.size() - 1));

            System.out.print("Do you want to add more students? (Y/N): ");
            addNext = sc.nextLine();
        } while (addNext.equalsIgnoreCase("y"));

    }

    public void display(ArrayList<Student> arr) {
        System.out.println("---------------------------");
        System.out.println("All the student records in the collection is: ");
        String id = "StudentID";
        String name = "StudentName";
        String address = "Address";
        String phone = "Phone";
        System.out.printf("%-30s%-30s%-30s%-30s\n", id, name, address, phone);
        for (Student studentModel : arr) {
            System.out.printf("%-30s%-30s%-30s%-30s\n", studentModel.getStudentID(), studentModel.getName(),
                    studentModel.getAddress(), studentModel.getPhone());
        }
    }
}