package source;

public class ShapeArray {
    private Shape[] shapeList;
    private int nbShapes;

    public ShapeArray(int size){
        shapeList = new Shape[size];
        nbShapes = 0;
    }

    public void addShape(Shape s){
        shapeList[nbShapes] = s;
        nbShapes++;
    }

    public int getCircleCounter(){
        int counter = 0;
        for(int i = 0; i < nbShapes; i++){
            if(shapeList[i] instanceof Circle){
                counter++;
            }
        }
        return counter;
    }

    public double getAvgRectArea(){
        double sum = 0;
        int counter = 0;
        for(int i = 0; i < nbShapes; i++){
            if(shapeList[i] instanceof Rectangle){
                Rectangle r = (Rectangle) shapeList[i];
                sum += r.getWidth() * r.getHeight();
                counter++;
            }
        }
        return sum / counter;
    }

    public void removeAllRect(){
        for(int i = 0; i < nbShapes; i++){
            if(shapeList[i] instanceof Rectangle){
                for(int j = i; j < nbShapes - 1; j++){
                    shapeList[j] = shapeList[j + 1];
                }
                nbShapes--;
            }
        }
    }

    public void displayrectsinfo(){
        for(int i = 0; i < nbShapes; i++){
            if(shapeList[i] instanceof Rectangle){
                Rectangle r = (Rectangle) shapeList[i];
                System.out.println(r);
            }
        }
    }

    public String toString(){
        String result = "";
        for(int i = 0; i < nbShapes; i++){
            result += shapeList[i] + "\n";
        }
        return result;
    }
}
