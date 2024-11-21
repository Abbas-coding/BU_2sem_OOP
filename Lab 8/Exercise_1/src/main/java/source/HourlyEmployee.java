package source;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String cnic, double wage, double hours) {
        super(firstName, lastName, cnic);
        this.wage = wage;
        this.hours = hours;
    }

    public HourlyEmployee(){} // default constructor

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            System.out.println("Wage cannot be negative");
            return;
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0.0) {
            System.out.println("Hours cannot be negative");
            return;
        }
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }

    @Override
    public String toString() {
        return "\nHourly Employee: " + super.toString();
    }
}
