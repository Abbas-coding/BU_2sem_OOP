package source;

//public class Circle extends Shape {
//    private double radius;
//    public Circle(double r){
//        radius = r;
//    }
//    public double area(){
//        return Math.PI * (radius * radius);
//    }
//    public double perimeter(){
//        return 2.0 * Math.PI * radius;
//    }
//    public double getRadius(){
//        return radius;
//    }
//}

public class Circle extends Ellipse {
    public Circle(double radius){
        super(radius, radius);
    }
}