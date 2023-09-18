//package Tutorials.Tutorial_2;

public class Rectangle {
    private double length = 1 , width = 1; 
    private final double MAX=20, MIN=0;

    
    

    public Rectangle(double length, double width) {
        if(length > MIN && length < MAX)
            this.length = length;

        if(width > MIN && width < MAX)
            this.width = width;
    }
    public Rectangle() {
        this(1,1);
  

    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if(length > MIN && length < MAX)
            this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if(width > MIN && width < MAX)
            this.width = width;
    }
    public double getMAX() {
        return MAX;
    }
    public double getMIN() {
        return MIN;
    }

    public double area(){
        return length * width; 
    }

    public double perimeter(){
        return (length + width)* 2;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + ", MAX=" + MAX + ", MIN=" + MIN + " perimeter = "+perimeter()+" area = "+area()+"]";
    } 

    

    

}
