public class Tester {
    public static void main(String[] args) {
        
        Circle c1 = new Circle();

        System.out.println(c1);
        
        Cylinder cy = new Cylinder( 3, 10);
        System.out.println(cy);
        System.out.println(" Area: "+cy.getArea());
        System.out.println(" Volume: "+cy.getVolume());


         Circle c = new Cylinder(0, 0, 0, 0);
         System.out.println(c.toString());
        

    }
}
