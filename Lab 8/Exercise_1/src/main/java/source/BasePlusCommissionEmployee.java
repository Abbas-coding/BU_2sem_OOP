package source;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String cnic, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, cnic, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(){} // default constructor

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            System.out.println("Base salary cannot be negative");
            return;
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return "\nBase Plus Commission Employee: " + super.toString();
    }
}
