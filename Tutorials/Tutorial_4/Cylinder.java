public class Cylinder extends Circle{
    private double height;

   
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(int xCenter, int yCenter, double radius, double height) {
        super(xCenter, yCenter, radius);
        this.height = height;
    }

    public Cylinder(Point center, double radius, double height) {
        super(center, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCylinder [height=" + height + "]";
    } 

    @Override
    public double getArea(){
        //(𝒄∗𝒉+𝟐∗𝒃)
        return super.getCircumference() * height + 2 * super.getArea();
    }

    
    public double getVolume(){
        //(𝒃 ∗ 𝒉)
        return super.getArea() * height;
    }
    

    
    
}
