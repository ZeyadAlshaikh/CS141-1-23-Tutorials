

public class CommissionEmployee  extends Employee{
    private double grossSale, commissionRate;

    public CommissionEmployee(String firstName, String lastName, String sSN, double grossSale, double commissionRate) {
        super(firstName, lastName, sSN);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee [grossSale=" + grossSale + ", CommissionRate=" + commissionRate + "]";
    }

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        return grossSale * commissionRate;
    } 
    @Override
    public double pay(){
       return 0.0; 
    }
    
    
}
