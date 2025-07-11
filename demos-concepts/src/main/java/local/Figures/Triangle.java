package local.Figures;
public class Triangle implements Area {

    double b;
    double h;

    public Triangle(double b, double h){
        this.b=b;
        this.h=h;

    }

    @Override
    public double calculateArea() {
        double result=(b*h)/2;
        return result;
    }
    

}
