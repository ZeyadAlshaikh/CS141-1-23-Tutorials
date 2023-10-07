
public class Tester {

    public static void main(String[] args) {
        // SalariedEmployee sa = new SalariedEmployee("Jhone", "Smith", "123234", 800);
        // HourlyEmployee he = new HourlyEmployee("Ali", "Ahmad", "65432", 16.75, 45);
        // CommissionEmployee ce = new CommissionEmployee("Khaled", "Ahmad", "765456", 10000, 0.06);
        // BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee("Ibraheam", "Abdullah", "897687868", 5000, 0.04, 300);


        Payble[] emps = {
            new SalariedEmployee("Jhone", "Smith", "123234", 800),
            new HourlyEmployee("Ali", "Ahmad", "65432", 16.75, 45),
            new CommissionEmployee("Khaled", "Ahmad", "765456", 10000, 0.06),
            new BasePlusCommissionEmployee("Ibraheam", "Abdullah", "897687868", 5000, 0.04, 300)
            };//new Employee[4];
        // emps[0] = sa; 
        // emps[1] = he; 
        // emps[2] = ce; 
        // emps[3] = bpce;
        
        
        for (Payble employee : emps ) {
            // if object is BasePlusCommissionEmployee increases the base salary  by 10 %
            if(employee instanceof BasePlusCommissionEmployee){
                // increase by 10%
                double oldBase = ((BasePlusCommissionEmployee)employee).getBaseSalary();

               ((BasePlusCommissionEmployee)employee).setBaseSalary( oldBase * 1.1);

            }

            System.out.println(employee + " Earnings: " + employee.earnings());
            
        }

        
    }
    
}
