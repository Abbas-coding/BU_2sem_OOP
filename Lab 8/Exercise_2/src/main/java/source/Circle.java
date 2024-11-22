package source;

public class Circle extends Shape{
    private int radius;

    public Circle(Point p, int radius){
        super(p);
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public String toString(){
        return "Circle at " + getCenter() + " with radius " + radius;
    }
}
