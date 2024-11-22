package source;

public class Main {
    public static void main(String[] args) {
    // create ShapesArray object with size =20
    ShapeArray shapeArray = new ShapeArray(20);
    // add new shape rectangle (ask user for details)
        Shape s = new Rectangle(new Point(1, 1), 2, 3);
        shapeArray.addShape(s);
    // add new shape circle (ask user for details)
        s = new Circle(new Point(2, 2), 4);
        shapeArray.addShape(s);
    // display all rectangles
        shapeArray.displayrectsinfo();
        // display the average shapes area
        System.out.println("Average area of rectangles: " + shapeArray.getAvgRectArea());
        // display the number of circles
        System.out.println("Number of circles: " + shapeArray.getCircleCounter());
        // remove all rectangles
        shapeArray.removeAllRect();




    }
}