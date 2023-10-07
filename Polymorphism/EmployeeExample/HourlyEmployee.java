

public class HourlyEmployee  extends Employee{
    private double wage; 
    private int hour;
    
    public HourlyEmployee(String firstName, String lastName, String sSN, double wage, int hour) {
        super(firstName, lastName, sSN);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee [wage=" + wage + ", hour=" + hour + "]";
    }

    @Override
    public double earnings() {
        if( hour <= 40)
            return wage * hour; 
        else{
            return 40 * wage + (hour - 40 ) * wage *1.5; 
        }

    } 

    @Override
    public double pay(){
       return 0.0; 
    }

    
}
