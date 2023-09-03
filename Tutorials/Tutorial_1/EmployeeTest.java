public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ali", "Ahamad", 150000);
        Employee emp2 = new Employee("Khaled", "Ibraheam", 100000);
        
        System.out.println(emp1);
        System.out.println(emp1.getYearlySalary());

        System.out.println(emp2);
        System.out.println(emp2.getYearlySalary());
        
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        
        System.out.println(emp1);
        System.out.println(emp2);

    }
}
