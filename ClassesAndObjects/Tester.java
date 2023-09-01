//package ClassesAndObjects;
public class Tester {

    public static void main(String[] args) {

        //Person p1 = new Person();
        // p1.setName( "Ahmad");
        // p1.setAge( 20); 
        // p1.setId( "1234345");
        //System.out.println("Name: "+ p1.name + " Age: "+ p1.age + " ID: "+ p1.id);
        //System.out.println("Name: "+ p1.getName() + " Age: "+ p1.getAge() + " ID: "+ p1.getId());

    
        Person p1 = new Person("Ahmad", 20 , "123455676"); 
        Person p2 = new Person("Ali", 30, "120003"); 
        Person p3 = new Person(p2);

        

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        
        

        
    }
}
