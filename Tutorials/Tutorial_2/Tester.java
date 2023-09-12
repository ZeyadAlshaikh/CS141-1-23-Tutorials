//package Tutorials.Tutorial_2;

public class Tester {
    public static void main(String[] args) {
        Rectangle rt1 = new Rectangle(10,17);
        System.out.println(rt1);

        Rectangle2 rt2 = new Rectangle2(10, 5, 2,30);
        Rectangle2 rt3 = new Rectangle2(rt2);
        Rectangle2 rt4 = new Rectangle2(7,3, 0, 10);
        System.out.println(rt2);
        System.out.println(rt3);
        System.out.println(rt4);

    }
}
