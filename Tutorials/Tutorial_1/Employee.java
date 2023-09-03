//package Tutorials.Tutorial_1;

public class Employee {
    private String firstName; 
    private String lastName; 
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName; 
        this.lastName = lastName; 
        if(monthlySalary >=0 )
            this.monthlySalary = monthlySalary; 
    }

    public void setFirstName(String firstName){
        this.firstName = firstName; 
    }
    public String getFirstName(){
        return firstName; 
    }

    public void setLastName(String lastName){
        this.lastName = lastName; 
    }
    public String getLastName(){
        return lastName; 
    }

    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary >= 0)
            this.monthlySalary = monthlySalary; 
        else
            System.out.println("Salary must be POSITIVE");
    }
    public double getMonthlySalary(){
        return monthlySalary; 
    }

    public double getYearlySalary(){
        return monthlySalary * 12; 
    }


    @Override
    public String toString(){
       return  String.format("Name: %s %s  Salary:%.2f", firstName, lastName, monthlySalary);
    }



    

}
