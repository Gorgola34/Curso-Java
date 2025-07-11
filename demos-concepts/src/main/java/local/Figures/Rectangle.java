package local.Figures;


public class Rectangle implements Area {

    double b;
    double h;

    public Rectangle(double b, double h){
        this.b=b;
        this.h=h;

    }

    @Override
    public double calculateArea() {
        double result=b*h;
        return result;
      
    }

   
}
