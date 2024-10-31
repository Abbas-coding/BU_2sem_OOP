package department;
import java.util.ArrayList;

public class Faculty extends Employee{
    private String workingHours;
    private ArrayList<Course> courseList;

    public Faculty(String eName, String eDesig, String eDept, String eEmail, String eContact, int eSalary, int eNo, String workingHours){
        super(eName, eDesig, eDept,eEmail,eContact,eSalary,eNo);
        this.workingHours = workingHours;
        courseList = new ArrayList<>();
    }
    public void assignCourse(Course course){
        courseList.add(course);
    }

    @Override
    public String toString(){
        String s =super.toString();
        s+= " "+ workingHours ;
        return s;
    }

    public void printCourseList(){
        for(int i = 0; i< courseList.size(); i++){
            System.out.println("Course : " + courseList.get(i).getCourseName() + " No of Credit Hours: "+ courseList.get(i).getCourseCreditHours());
        }
    }
}
