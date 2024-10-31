package org.example;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();
        Department department = new Department(deptName);

        System.out.print("Enter number of faculty members to add: ");
        int numFaculty = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numFaculty; i++) {
            System.out.print("Enter faculty name: ");
            String facultyName = scanner.nextLine();
            System.out.print("Enter faculty designation: ");
            String facultyDesignation = scanner.nextLine();
            System.out.print("Enter faculty email: ");
            String facultyEmail = scanner.nextLine();
            System.out.print("Enter faculty contact: ");
            String facultyContact = scanner.nextLine();
            System.out.print("Enter faculty salary: ");
            int facultySalary = scanner.nextInt();
            System.out.print("Enter faculty ID: ");
            int facultyId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Faculty faculty = new Faculty(facultyName, facultyDesignation, facultyEmail, facultyContact, facultySalary, facultyId);
            department.facultyList(faculty);
        }

        System.out.print("Enter number of courses to add: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course code: ");
            String courseCode = scanner.nextLine();
            System.out.print("Enter course name: ");
            String courseName = scanner.nextLine();
            System.out.print("Enter course credit hours: ");
            String courseCreditHours = scanner.nextLine();

            Course course = new Course(courseCode, courseName, courseCreditHours);
            department.courseList(course);
        }

        // Display the faculty and courses
        department.showFaculty();
        department.showCourses();

        scanner.close();
    }
}