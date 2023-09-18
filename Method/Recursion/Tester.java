//package Recursion;

import java.math.BigInteger;
import java.util.Arrays;

public class Tester {

    public static int factorial(int num ){
        int result = num; 
        for( int i = num - 1 ; i > 0 ; i-- ){
            result *= i; 
        }
        return result; 
    }


    public static int rFactorial(int n){  
        // stop condition 
        if(n == 1 || n == 0)
        return 1; 
        else // call  n! = n * (n-1)!
          return n * rFactorial(n-1);
    }


    public static int fibonacci(int n){
        //  1- stop condition 
        if(n == 0 || n == 1)
        return n;
            //2- call f(n) = n-1 + n-2
        else 
            return fibonacci(n-1) + fibonacci(n-2);
        


    }

    public static void updateName(String name){
        name = "Ali";
    }

    public static void updateArray(int[] array){
        array[0] = 10;
    }
    public static void main(String[] args) {
    
        //System.out.println(factorial(4));
        // int result = rFactorial(3);
        // System.out.println( result);

        System.out.println(fibonacci(5));

        String name = "Ahmad";
        System.out.println(name);
        updateName(name);
        System.out.println(name);

        int[] numbers = {1,2,3};
        System.out.println(Arrays.toString(numbers) );
        updateArray(numbers); 
        System.out.println(Arrays.toString(numbers) );

        int n = 7; 
        
        for( int r=1; r<=n/2; r++){
            //System.out.println(i+"! = "+rFactorial(i));
            // P(n,r) = n! / (n-r)!
            System.out.println((rFactorial(n)/rFactorial(n-r)));
            
        }

    }

    /*
    // int num = 4; 
        // System.out.print("Foctorial of "+  num +" = "+ factorial(num));

        System.out.println(rFactorial(5));
        
        System.out.println(fibonacci(5));
     * 
    public static int factorial(int num){

        int result =  num;
        for(int i = num-1 ; i>0 ; i--)
            result *= i; 

        return result; 
    }


    public static int rFactorial(int i){
        System.out.println("Calling my self "+ i);
        // stop condition 
        if(i == 1 )
            return 1;
             
        else // call 
           return i * rFactorial(i-1);
           // 5 * 4 * 3 * 2 * 1
    }


    public static int fibonacci(int num){
        // stop condition 
        if ( num == 1 || num == 2)
            return 1; 
        // call 
            return fibonacci(num -1) + fibonacci(num -2);

    }

     */
}
