public class Tester {
    public static void main(String[] args) {
        // Point begin = new Point(0,0);
        // Point end = new Point(3,3);
        // Line l1 = new Line(begin, end);
        
        Line l1 = new Line(new Point(0,0), new Point(3,3));
       
        Line l2 = new Line(l1);

        Line l3 = new Line(0,3,0,3);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);


    }
}
