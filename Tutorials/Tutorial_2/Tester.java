package Tutorials.Tutorial_2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        
        // Rectangle rt1 = new Rectangle();
        // Rectangle rt2 = new Rectangle(10, 6);
        // Rectangle rt3 = new Rectangle(50, 40);

        // System.out.println(rt1);
        // System.out.println(rt2);
        // System.out.println(rt3);

        // rt1.setLength(50);
        // System.out.println(rt1);

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Length Width Min Max");
        // double length = in.nextDouble(); 
        // double width =  in.nextDouble(); 
        // double min =  in.nextDouble();
        // double max =  in.nextDouble(); 

        // Rectangle2 rt1 = new Rectangle2(length, width, min , max );

        Rectangle2 rt1 = new Rectangle2(in.nextDouble(), in.nextDouble(), in.nextDouble() , in.nextDouble() );
        Rectangle2 rt2 = new Rectangle2(10,7);
        Rectangle2 rt3 = new Rectangle2(7,4,1,19);
        Rectangle2 rt4 = new Rectangle2(rt1);

        System.out.println(rt1);
        System.out.println(rt2);
        System.out.println(rt3);
        System.out.println(rt4);







    }
}
