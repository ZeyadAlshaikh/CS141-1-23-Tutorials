import java.util.Scanner;
import java.util.Arrays;

public class MethodTutorail {
    /* 
    TODO:
    Ex.1
    Write a program that read name and time from the user
    and then call a method name greeting. 
    The method should print good morning (name) or good evening (name)
    base on user time. 
    Note: 
    Time is in 24 hour format.  
    TODO:
    Ex.2 
    Write a method that receive an array of integer and return the sum of items' value
    inside that array. 
    TODO:
    Ex.3
    Write a method that receive an array and update it by multiply each element by 2.
    Then print the array in the main method 

    TODO:
    Ex.4
    Write a method that receive a string (name) and update it to Ahmad 
    Then print the name  in the main method 

    */

    public static void  mutlArray(int[] array){
        for( int i = 0 ; i < array.length; i++)
         array[i] *=2;
    }

     public static void  update(String name){
        name = "Ali";
    }

    

    public static int sumArray(int[] array){
        int sum = 0;
        
        for( int i = 0 ; i < array.length; i++)
        sum += array[i];

        return sum; 
    }


    public static void greeting(String name, int time){

        if( time >= 0 && time <12){
            System.out.println("Good morning "+ name);
        }else if (time >11 && time < 24){
            System.out.println("Good evening " + name );
        }else 
        System.out.println("Time must be 0-23");
    }
   
    public static void main(String[] args) {
    // Scanner in = new Scanner(System.in);

    // System.out.print("Please enter you name ");
    // String name = in.nextLine(); 
    // System.out.println("Please enter the time ");
    // int time = in.nextInt();

    // greeting(name, time);

    int[] array = {2,2,3,4};

    // System.out.println( sumArray(array));

    System.out.println(Arrays.toString(array));
    mutlArray(array);
    System.out.println(Arrays.toString(array));

    String name ="Muhammad";
    System.out.println(name);
    update(name);
    System.out.println(name);

    int age =20;
    System.out.println(age);
    update(age);
    System.out.println(age);


    }


     public static void  update(int age){
        age = 0;
    }
}
