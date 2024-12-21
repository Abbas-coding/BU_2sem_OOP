package source;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Admin admin = new Admin();

        System.out.println("Welcome to the Student Enrollment System!");
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();

        if (admin.login(username, password)) {
            System.out.println("Login successful!\n");
            menu();
        } else {
            System.out.println("Invalid credentials. Exiting...");
        }


    }

    private static void menu() {
        while (true) {
            System.out.println("\nStudent Enrollment System Menu");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Department: ");
        String department = scanner.nextLine();

        DBFun db = new DBFun();
        try {
            db.add(id, name, department);
        } catch (Exception e) {
            System.out.println("Error adding student to database.");
            return;
        }
        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {
        DBFun db = new DBFun();
        try {
            db.displayAll();
        } catch (Exception e) {
            System.out.println("Error fetching students from database.");
            return;
        }
    }

    private static void updateStudent() {
        DBFun db = new DBFun();
        System.out.print("Enter Student ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Department: ");
        String department = scanner.nextLine();

        try {
            db.update(id, name, department);
        } catch (Exception e) {
            System.out.println("Error updating student in database.");
            return;
        }
    }

    private static void deleteStudent() {
        DBFun db = new DBFun();
        System.out.print("Enter Student ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        try {
            db.delete(id);
        } catch (Exception e) {
            System.out.println("Error deleting student from database.");
            return;
        }
    }
}