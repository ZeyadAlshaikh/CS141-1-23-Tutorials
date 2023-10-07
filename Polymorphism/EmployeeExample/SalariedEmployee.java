

public class SalariedEmployee extends Employee {
    
    private double salary;

    public SalariedEmployee(String firstName, String lastName, String sSN, double salary) {
        super(firstName, lastName, sSN);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee [salary=" + salary + "]";
    }

    @Override
    public double earnings() {
        
        return salary;
    } 
     @Override
     public double pay(){
        return 0.0; 
     }

 
    
}
