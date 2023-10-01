public class CommissionEmployee {
    private final String firstName; 
    private final String lastName; 
    private final String socailSecurityNumber; 
    private double grossSale; 
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socailSecurityNumber, double grossSale,
            double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socailSecurityNumber = socailSecurityNumber;
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocailSecurityNumber() {
        return socailSecurityNumber;
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
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee [firstName=" + firstName + ", lastName=" + lastName + ", socailSecurityNumber="
                + socailSecurityNumber + ", grossSale=" + grossSale + ", commissionRate=" + commissionRate + "]";
    } 

    public double earnings(){
        return grossSale * commissionRate; 
    }
    
}
