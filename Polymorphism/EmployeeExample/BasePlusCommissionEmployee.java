

public class BasePlusCommissionEmployee  extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String sSN, double grossSale,
            double commissionRate, double baseSalary) {
        super(firstName, lastName, sSN, grossSale, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee [baseSalary=" + baseSalary + "]";
    }

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        return super.earnings() + baseSalary;
    } 
    @Override
    public double pay(){
       return 0.0; 
    }
    
}
