package org.example;

public class Course {
    private String courseCode;
    private String courseName;
    private String courseCreditHours;

    public Course(String code, String name, String creditHr){
        this.courseCode = code;
        this.courseName = name;
        this.courseCreditHours = creditHr;
    }

    public String getCourseCode(){
        return this.courseCode;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public String getCourseCreditHours(){
        return this.courseCreditHours;
    }

}
