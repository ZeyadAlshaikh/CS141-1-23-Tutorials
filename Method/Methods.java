import java.util.Scanner;


public class Methods{

   
    public static void main(String[] args) {

        methodA(3);
    //     Scanner in = new Scanner(System.in);

    //     System.out.println("Please Enter 3 integers");
    //     int num1 = in.nextInt();
    //     int num2 = in.nextInt();
    //     int num3 = in.nextInt();
        
    //    //System.out.println( max(num1, num2, num3));

    //    System.out.println( max(15.2, 2.3, 7));

    //methodA((int)4.2);

       
 
        
    }

   

     static int x = 10; // gloable variable

    static void methodA(){
        System.out.println("X value is "+ x);
    }

     static void methodA(int x){
        System.out.println("X value is "+ x);
    }






     public static int max( int num1 , int num2, int num3){
        if( num1 > num2 && num1 > num3)
            return num1; 
        else if(num2 > num1 && num2> num3)
            return num2;
        else 
            return num3; 
    }

    public static double max( double num1 , double num2, double num3){
        if( num1 > num2 && num1 > num3)
            return num1; 
        else if(num2 > num1 && num2> num3)
            return num2;
        else 
            return num3; 
    }

     public static  void method1(){
        System.out.println("Mehtod 1 started");
        method2();
        System.out.println("Mehtod 1 ended");
    }

    public static  void method2(){
        System.out.println("Mehtod 2 started");
        method3();
        System.out.println("Mehtod 2 ended");
    }

    public static  void method3(){
        System.out.println("Mehtod 3 started");
        System.out.println("Mehtod 3 ended");
 
    }
     


   

   
    
}