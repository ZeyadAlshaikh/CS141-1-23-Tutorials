package Tutorials.Tutorial_2;

public class Rectangle2 {
    private double length = 1 , width = 1; 
    private final double MAX, MIN;
    

    
     public Rectangle2(double length, double width, double min, double max) {
        this.MAX = max; 
        this.MIN = min; 

        if(length > MIN && length < MAX)
            this.length = length;

        if(width > MIN && width < MAX)
            this.width = width;

        
    }

    public Rectangle2(double length, double width) {
        this(length, width, 0, 20);
        
    }
    public Rectangle2() {
        this(1,1, 0,20);

    }
    public Rectangle2( Rectangle2 rt){
        this(rt.length, rt.width, rt.MIN, rt.MAX);
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
