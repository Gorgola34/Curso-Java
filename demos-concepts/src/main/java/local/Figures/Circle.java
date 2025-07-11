package local.Figures;
public class Circle implements Area {

    double radio;

    public Circle(double radio){
        this.radio=radio;

    }

    @Override
    public double calculateArea(){
        double result= (radio*radio)*Math.PI;
        return result;
    }

}
    
    

    
