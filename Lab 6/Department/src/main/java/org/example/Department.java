package org.example;
import java.util.*;

public class Department {
    private String departmentName;
    private ArrayList<Faculty> departmentFaculty;
    private ArrayList<Course> offeredCourses;

    public Department(String dept) {
        this.departmentName = dept;
        this.departmentFaculty = new ArrayList<>();
        this.offeredCourses = new ArrayList<>();
    }

    public String toString() { // Fixed method name from to_String to toString
        return this.departmentName;
    }

    public void facultyList(Faculty faculty) {
        departmentFaculty.add(faculty);
    }

    public void courseList(Course course) {
        offeredCourses.add(course);
    }

    public void showFaculty() {
        System.out.println("Faculty in " + departmentName + ":");
        for (Faculty faculty : departmentFaculty) {
            System.out.println(faculty.getFacultyName());
        }
    }

    public void showCourses() {
        System.out.println("Courses offered in " + departmentName + ":");
        for (Course course : offeredCourses) {
            System.out.println(course.getCourseName() + " (" + course.getCourseCode() + ")");
        }
    }
}
