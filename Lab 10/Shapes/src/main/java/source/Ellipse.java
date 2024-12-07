package source;

public class Ellipse extends Shape implements Eccentric
{
    double a, b;
    public Ellipse(double s1, double s2){
        if(s1 < s2) {
            a = s2;
            b = s1;
        }
        else {
            a = s1;
            b = s2;
        }
    }
    public double perimeter(){
//method body missing
        double perimeter = 2 * Math.PI * Math.sqrt((a*a + b*b)/2);
        return perimeter;
    }
    public double area(){
//method body missing
        double area = Math.PI * a * b;
        return area;
    }
    public double eccentricity(){
//method body missing
        double eccentricity = Math.sqrt(1 - (b*b)/(a*a));
        return eccentricity;
    }
    public String toString(){
//method body missing
        return super.toString() + "\nEccentricity=" + eccentricity();
    }
}
