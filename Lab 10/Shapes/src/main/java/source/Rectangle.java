package source;

public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length * width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
}
