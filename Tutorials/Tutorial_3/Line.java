public class Line {
    private Point begin, end;

    
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(Line l){
        this(l.begin, l.end);
    }

    public Line(int x1 , int x2 , int y1, int y2 ){
        this(new Point(x1,y1), new Point(x2,y2));
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
        return "Line [begin=" + begin + ", end=" + end + " lenght: "+ getLength()+"]";
    } 

    
    public double getLength(){
        return begin.distance(end);

    }
    
}
