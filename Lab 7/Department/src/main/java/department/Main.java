package department;

public class Main {
    public static void main(String[] args) {
        // Create Staff objects
        Staff staff1 = new Staff("Alice Johnson", "Librarian", "Library", "alice@example.com", "1234567890", 50000, 1, "9 AM - 5 PM");
        Staff staff2 = new Staff("Bob Smith", "Administrator", "Administration", "bob@example.com", "0987654321", 60000, 2, "8 AM - 4 PM");

        // Create Faculty objects
        Faculty faculty1 = new Faculty("Dr. Emily Davis", "Professor", "Computer Science", "emily@example.com", "2345678901", 80000, 101, "10 AM - 4 PM");
        Faculty faculty2 = new Faculty("Dr. Mark Wilson", "Associate Professor", "Mathematics", "mark@example.com", "3456789012", 75000, 102, "11 AM - 5 PM");

        // Create Course objects
        Course course1 = new Course("CS101", "Introduction to Programming", "3");
        Course course2 = new Course("CS102", "Data Structures", "4");
        Course course3 = new Course("MATH201", "Calculus I", "3");

        // Assign courses to Faculty
        faculty1.assignCourse(course1);
        faculty1.assignCourse(course2);
        faculty2.assignCourse(course3);

        // Display Staff Information
        System.out.println("Staff Members:");
        System.out.println(staff1);
        System.out.println(staff2);
        System.out.println();

        // Display Faculty Information and assigned courses
        System.out.println("Faculty Members and Assigned Courses:");
        System.out.println(faculty1);
        faculty1.printCourseList();
        System.out.println();

        System.out.println(faculty2);
        faculty2.printCourseList();

    }
}