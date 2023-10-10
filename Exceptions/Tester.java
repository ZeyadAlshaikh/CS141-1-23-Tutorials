import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
    
    public static void main(String[] args) {
        String name=""; 
        int age=0; 
        Scanner in = new Scanner(System.in);

        try{
            //int x = 10 /0;
            //String str = null; 
            //str.equals("hello");

            System.out.println("Please enter your name");
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
        // }catch(ArithmeticException ex){
        //     System.out.println("Divide by Zero");
        // }
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