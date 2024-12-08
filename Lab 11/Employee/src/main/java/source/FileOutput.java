package source;
import java.io.*;
import java.util.*;

public class FileOutput {
    public static void writeEmployeesToFile(String fileName, List<Employee> employees) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Employee emp : employees) {
                writer.write(emp.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
