//package RelationshipsAmongClasses.Temp;

public class Tester {

    public static void main(String[] args) {


        CommissionEmployee emp1 = new CommissionEmployee("Jasser", "Muhammad", "12345634", 50000, 0.10);

        System.out.println(emp1);
        System.out.println(emp1.earnings());

        BasePlusCommissionEmployee emp2 = new BasePlusCommissionEmployee("Mutheas", "Nabeal", "90876543", 50000, 0.10, 2000);
        System.out.println(emp2);
        System.out.println(emp2.earnings());

        BasePlusCommissionEmployee emp3 = new BasePlusCommissionEmployee("Nutheas", "Nabeal", "90876543", 50000, 0.10, 2000);
        
        System.out.println( emp2.equals(emp3));


        // System.out.println(Person.getCount());
        // Person p1 = new Person("Ali", new _Date(1,1,2004),10001);
        // System.out.println(p1);
        // System.out.println(p1.getCount());


        // Student st = new Student("Khaled", new _Date(31,12,2004), 10002, "IT");
        // System.out.println(st);
        // System.out.println(st.getCount());
    }

    
}
