package source;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(Point p, int width, int height){
        super(p);
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public String toString(){
        return "Rectangle at " + getCenter() + " with width " + width + " and height " + height;
    }
}
