package source;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String cnic, double weeklySalary) {
        super(firstName, lastName, cnic);
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(){} // default constructor

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            System.out.println("Weekly salary cannot be negative");
            return;
        }
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "\nSalaried Employee: " + super.toString();
    }
}
