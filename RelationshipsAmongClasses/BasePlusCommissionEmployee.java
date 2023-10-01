public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double base;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socailSecurityNumber, double grossSale,
            double commissionRate, double base) {
        super(firstName, lastName, socailSecurityNumber, grossSale, commissionRate);
        this.base = base;
    }

    public double getBase() {
        Object obj ; 
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return super.toString()+ "base=" + base ;
    } 

    @Override
    public double earnings(){
        return base + super.earnings();
    }
    
    @Override 
    public boolean equals(Object o){
        if( this.base == ((BasePlusCommissionEmployee)o).base && 
        this.getFirstName().equals(((BasePlusCommissionEmployee)o).getFirstName()))
            return  true; 
       
        return false;
    }
    
}
