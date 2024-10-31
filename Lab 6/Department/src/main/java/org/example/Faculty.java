package org.example;
import java.util.ArrayList;

public class Faculty {
    private String facultyName;
    private String facultyDesignation;
    private String facultyEmail;
    private String facultyContact;
    private int facultySalary;
    private int facultyId;
    private ArrayList<Course> courseList; // Initialize the ArrayList

    public Faculty(String fname, String fdesignation, String fEmail, String fContact, int fsalary, int fId) {
        this.facultyName = fname;
        this.facultyDesignation = fdesignation;
        this.facultyEmail = fEmail;
        this.facultyContact = fContact;
        this.facultySalary = fsalary;
        this.facultyId = fId;
        this.courseList = new ArrayList<>(); // Initialize the ArrayList
    }

    public void assignCourse(Course course) {
        courseList.add(course);
    }

    public String getFacultyName() { // Add getter for faculty name
        return this.facultyName;
    }
}
