//package Tutorials.Tutorial_2;

public class Rectangle2 {

    private double length, width; 
    private final double  MAX , MIN ;
    

    public Rectangle2(double length, double width, double min, double max) {
        this.length = length;
        this.width = width;
        this.MIN = min; 
        this.MAX = max; 
    }

    public Rectangle2() {
        this(1,1,0,20);
        
    }
    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
        this.MIN = 0; 
        this.MAX = 20; 
    }

    public Rectangle2(Rectangle2 rt){
        this(rt.length, rt.width, rt.MIN, rt.MAX);
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
        return "Rectangle2 [length=" + length + ", width=" + width + " Area="+ area() +" perimeter= "+perimeter()+" MIN= "+MIN+" MAX= "+MAX+" ]";
    }
    
    
    
    
}
