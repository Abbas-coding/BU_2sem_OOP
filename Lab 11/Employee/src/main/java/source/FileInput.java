package source;

import java.io.*;
import java.util.*;

public class FileInput {
    public static List<Employee> readEmployeesFromFile(String fileName) {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Trim leading and trailing whitespace and split by commas
                String[] data = line.trim().split(",");

                // Check if the line has the correct number of fields (6 fields for an employee)
                if (data.length == 6) {
                    String name = data[0].trim();
                    String department = data[1].trim();
                    // Use Integer.parseInt() on trimmed values and handle possible NumberFormatException
                    int salary = 0;
                    try {
                        salary = Integer.parseInt(data[2].trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Error parsing salary: " + data[2]);
                        continue;  // Skip this line if salary is invalid
                    }
                    String contact = data[3].trim();
                    String designation = data[4].trim();
                    String status = data[5].trim();

                    // Create and add the Employee object
                    employees.add(new Employee(name, department, salary, contact, designation, status));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }
}

