import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {

    public static void methodA(int age)throws AgeLimitException
    {
        try {

            if ( age < 16 )
                throw new AgeLimitException("You must be 15 or older to purchese this");
            else 
                System.out.println("Confirmation number: "+ 1343234);

        } catch (Exception e) {
           System.err.println("Something wrong happend");
           throw e; 
        }
       
        
    }

    public static void assertTest(int x ){
        // x must be positive  and less than 10
        assert ( x > 0 && x < 10) : "X must be positive and less than 10";

        x = x * -1; 

        assert x < 0 : "X must be negative";
        // x must be negative
    }
    
    public static void main(String[] args) 
    {
        

        assertTest(-5);

        String name=""; 
        

        int age=0; 
        Scanner in = new Scanner(System.in);

       
        //int x = 10;

        try{
            //System.exit(0);
            //method();
            methodA(5);
            int x = 10;
            //String str = null; 
            //str.equals("hello");

            System.err.println("Please enter your name");
            name = in.next();

            System.out.println("Please enter your age");
            age = in.nextInt();
            
            if(age < 16){
                throw new AgeLimitException("Age must be > 15");
            }


        }catch(InputMismatchException| ArithmeticException ex){
            in.next();
            System.out.println("Age must be number");
            age = in.nextInt();
             
            
        }
        catch(AgeLimitException ex){
            System.out.println("Age must be > 15");
        }
        catch(Exception ex){
            System.out.println("Exception");
            System.out.println(ex);
        }finally{
            System.out.println("I'm finally");
        }




        System.out.println("Name: "+ name + " Age: "+ age);
    }
}


class AgeLimitException extends Exception{

    public AgeLimitException(String message) {
        super(message);
    }

}