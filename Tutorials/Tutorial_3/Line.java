public class Line {
    private Point begin, end;

    

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line [begin=" + begin + ", end=" + end + " Length = "+getLength()+"]";
    } 

    public double getLength(){
       return  begin.distance(end);
    }
    
}
