package source;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();


        System.out.println("Enter 3 employee records:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter department:");
            String department = sc.nextLine();
            System.out.println("Enter salary:");
            int salary = Integer.parseInt(sc.nextLine());
            System.out.println("Enter contact number:");
            String contact = sc.nextLine();
            System.out.println("Enter designation:");
            String designation = sc.nextLine();
            System.out.println("Enter status (active/inactive):");
            String status = sc.nextLine();

            employees.add(new Employee(name, department, salary, contact, designation, status));
        }


        FileOutput.writeEmployeesToFile("EmployeeData.txt", employees);


        System.out.println("\n--- Employee Data ---");
        List<Employee> readEmployees = FileInput.readEmployeesFromFile("EmployeeData.txt");
        for (Employee emp : readEmployees) {
            System.out.println(emp);
        }


        if (readEmployees.size() > 2) {
            Employee secondEmp = readEmployees.get(1);
            Employee thirdEmp = readEmployees.get(2);


            secondEmp = new Employee("Updated_" + secondEmp.getName(), secondEmp.getDepartment(),
                    secondEmp.getSalary() + 1000, secondEmp.getContact(), secondEmp.getDesignation(),
                    "inactive");


            thirdEmp = new Employee("Updated_" + thirdEmp.getName(), thirdEmp.getDepartment(),
                    thirdEmp.getSalary() + 1500, thirdEmp.getContact(), thirdEmp.getDesignation(),
                    "active");

            readEmployees.set(1, secondEmp);
            readEmployees.set(2, thirdEmp);
        }


        FileOutput.writeEmployeesToFile("UpdatedEmployeeInfo.txt", readEmployees);


        System.out.println("\n--- Updated Employee Data ---");
        List<Employee> updatedEmployees = FileInput.readEmployeesFromFile("UpdatedEmployeeInfo.txt");
        for (Employee emp : updatedEmployees) {
            System.out.println(emp);
        }

        sc.close();
    }
}
