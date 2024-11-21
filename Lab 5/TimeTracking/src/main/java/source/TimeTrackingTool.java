package source;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TimeTrackingTool {
    private List<Main> taskIntervals;

    public TimeTrackingTool() {
        taskIntervals = new ArrayList<>();
    }

    public void addTaskInterval(int startHour, int startMinute, int endHour, int endMinute) {
        taskIntervals.add(new Main(startHour, startMinute, endHour, endMinute));
    }

    public int calculateTotalTimeForTask() {
        int totalMinutes = 0;
        for (Main interval : taskIntervals) {
            totalMinutes += interval.calculateIntervalInMinutes();
        }
        return totalMinutes;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeTrackingTool timeTrackingTool = new TimeTrackingTool();

        System.out.print("Enter the number of tasks you tracked this week: ");
        int numberOfTasks = scanner.nextInt();

        // Ensure the loop runs exactly 'numberOfTasks' times
        for (int i = 0; i < numberOfTasks; i++) {
            System.out.print("Enter start time (hour minute) for task " + (i + 1) + ": ");
            int startHour = scanner.nextInt();
            int startMinute = scanner.nextInt();

            System.out.print("Enter end time (hour minute) for task " + (i + 1) + ": ");
            int endHour = scanner.nextInt();
            int endMinute = scanner.nextInt();

            timeTrackingTool.addTaskInterval(startHour, startMinute, endHour, endMinute);
        }

        int totalTimeForTaskInMinutes = timeTrackingTool.calculateTotalTimeForTask();
        int totalHours = totalTimeForTaskInMinutes / 60;
        int remainingMinutes = totalTimeForTaskInMinutes % 60;

        System.out.println("Total time spent on tasks this week: " + totalHours + " hours and " + remainingMinutes + " minutes");

        // Check if the total time is less than 40 hours (2400 minutes)
        if (totalTimeForTaskInMinutes < 2400) {
            System.out.println("Warning: Total time spent is less than 40 hours for the week.");
        }

        scanner.close();
    }
}

