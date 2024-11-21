package source;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String cnic, double grossSales, double commissionRate) {
        super(firstName, lastName, cnic);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public CommissionEmployee(){} // default constructor

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            System.out.println("Gross sales cannot be negative");
            return;
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            System.out.println("Commission rate must be > 0.0 and < 1.0");
            return;
        }
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return "\nCommission Employee: " + super.toString();
    }
}
