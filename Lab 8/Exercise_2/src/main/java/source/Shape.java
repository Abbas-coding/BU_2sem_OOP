package source;

public class Shape {
    private Point p;

    public Shape(Point p){
        this.p = p;
    }

    public Point getCenter(){
        return p;
    }

    public boolean contains(Point p){
        double distance = getCenter().distanceTo(p);
        if(distance > getCenter().distanceTo(this.p)){
            return false;
        } else {
            return true;
        }

    }

}
