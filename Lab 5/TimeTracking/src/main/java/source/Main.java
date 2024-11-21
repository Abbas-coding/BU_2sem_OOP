package source;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    private int startHour, startMinute, endHour, endMinute;

    public Main(int startHour, int startMinute, int endHour, int endMinute) {
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
    }

    public int calculateIntervalInMinutes() {
        int startTotalMinutes = (startHour * 60) + startMinute;
        int endTotalMinutes = (endHour * 60) + endMinute;
        return endTotalMinutes - startTotalMinutes;
    }
}
