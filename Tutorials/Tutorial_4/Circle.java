// https://www.ntu.edu.sg/home/ehchua/programming/java/J3b_OOPInheritancePolymorphism.html#zz-1.3

/* 
 * The Circle class composes a Point (as its center) and a radius.
 */
public class Circle {
   // The private instance variables
   private Point center;  // Declare an instance of the Point class
   private double radius;
 
   // Constructors
   public Circle() {
      this(new Point(), 1.0); // Construct a Point at (0,0)
   }
   public Circle(double radius) {
      this(new Point(), radius);
   }
   public Circle(int xCenter, int yCenter, double radius) {
      this (new Point(xCenter, yCenter), radius); // Construct a Point at (xCenter,yCenter)
   }
   public Circle(Point center, double radius) {
      this.center = center;  // The caller constructed an Point instance
      this.radius = radius;
   }
 
   // Getters and Setters
   public double getRadius() {
      return this.radius;
   }
   public void setRadius(double radius) {
      this.radius = radius;
   }
   public Point getCenter() {
      return this.center;  // return a Point instance
   }
   public void setCenter(Point center) {
      this.center = center;
   }
 
   public int getCenterX() {
      return center.getX();  // Point's getX()
   }
   public void setCenterX(int x) {
      center.setX(x);  // Point's setX()
   }
   public int getCenterY() {
      return center.getY();  // Point's getY()
   }
   public void setCenterY(int y) {
      center.setY(y);  // Point's setY()
   }
   public int[] getCenterXY() {
      return center.getXY();  // Point's getXY()
   }
   public void setCenterXY(int x, int y) {
      center.setXY(x, y);  // Point's setXY()
   }
 
   public String toString() {
      return "Circle[center=" + center + ",radius=" + radius + "]";  // invoke center.toString()
   }
 
   public double getArea() {
      return Math.PI * radius * radius;
   }
 
   public double getCircumference() {
      return 2.0 * Math.PI * radius;
   }
 
   // Return the distance from the center of this instance to the center of
   // the given Circle instance called another.
   public double distance(Circle another) {
      return center.distance(another.center);  // Invoke distance() of the Point class
   }
 }
