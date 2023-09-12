//package Tutorials.Tutorial_2;

public class Rectangle {
   
    private double length, width; 
    private final double  MAX = 20.0, MIN = 0.0;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this(1,1);
        
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if(length > 0.0 && length < 20.0)
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
          if(width > 0.0 && width < 20.0)
        this.width = width;
    }
    public double getMAX() {
        return MAX;
    }
    public double getMIN() {
        return MIN;
    } 

    public double perimeter(){
        return (length + width) * 2 ; 
    }

    public double area(){
        return (length * width)  ; 
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + " Area="+ area() +" perimeter= "+perimeter()+" MIN= "+MIN+" MAX= "+MAX+" ]";
    }
    
    
    
    
}
