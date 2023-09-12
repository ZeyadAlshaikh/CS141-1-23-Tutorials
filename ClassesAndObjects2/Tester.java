//package ClassesAndObjects2;

import java.util.Scanner;
import static java.lang.Math.*; 


public class Tester {

    public static void main(String[] args) {

         Scanner in ; 
         System.out.println(Math.sqrt(E));
        // System.out.printf("PI: .2f", PI);
        String str1 = new String("Hello world");
        String str2 = new String("Hello world");
        String str3 = "Hello world ";
        str3 += "!";
        // System.out.println(str3);

        if(str1.equals(str2) )
        System.out.println("Equals");
        else
        System.out.println("Not Equals");

      

        //Person p1 = new Person();
        // p1.setName( "Ahmad");
        // p1.setAge( 20); 
        // p1.setId( "1234345");
        //System.out.println("Name: "+ p1.name + " Age: "+ p1.age + " ID: "+ p1.id);
        //System.out.println("Name: "+ p1.getName() + " Age: "+ p1.getAge() + " ID: "+ p1.getId());

    
        

        
        System.out.println(Person.getCount());

     

        Person p1 = new Person("Ahmad", 20 , "123455676"); 
        System.out.println(p1.getCount());
        Person p2 = new Person("Ali", 30, "120003"); 
        System.out.println(Person.getCount());
        Person p3 = new Person(p2);
        System.out.println(Person.getCount());
        Person p4 = new Person();
        System.out.println(p1.getCount());

        

        



        

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        
        

        
        

        
    }
}
