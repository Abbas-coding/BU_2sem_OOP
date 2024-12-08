package source;

public class Employee {
    private String name;
    private String department;
    private int salary;
    private String contact;
    private String designation;
    private String status;

    public Employee(String name, String department, int salary, String contact, String designation, String status) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.contact = contact;
        this.designation = designation;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }


    public String getContact() {
        return contact;
    }


    public String getDesignation() {
        return designation;
    }


    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return name + "," + department + "," + salary + "," + contact + "," + designation + "," + status;
    }
}
