package department;

public class Course {
    private String courseCode;
    private String courseName;
    private String courseCreditHours;

    public Course(String cCode, String cName, String cCHours){
        this.courseCode = cCode;
        this.courseName = cName;
        this.courseCreditHours = cCHours;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCreditHours() {
        return courseCreditHours;
    }
}
