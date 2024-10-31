package department;

public class Employee {
    private String employeeName;
    private String employeeDesignation;
    private String employeeDepartment;
    private String employeeEmail;
    private String employeeContact;
    private int employeeSalary;
    private int employeeNumber;

    public Employee(String eName, String eDesig, String eDept, String eEmail, String eContact, int eSalary, int eNo){
        this.employeeName = eName;
        this.employeeDesignation = eDesig;
        this.employeeDepartment = eDept;
        this.employeeEmail = eEmail;
        this.employeeContact = eContact;
        this.employeeSalary = eSalary;
        this.employeeNumber = eNo;
    }

    public String toString (){
        String s = "Employee " + employeeNumber +": "+ employeeName + " " + employeeDesignation + " "+ employeeDepartment +" "+ employeeEmail + " "+ employeeContact + " " + employeeSalary;
        return s;
    }
}
