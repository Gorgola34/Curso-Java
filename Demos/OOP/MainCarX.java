package Demos.OOP;
public class MainCarX {

    public static void main(String[] args) {
        
        CarX c1= new CarX("Toyota", 'd', 100);
        CarX c2= new CarX("Renault", 'f', 10);
        CarX.acelerate();
        CarX.stop();
    }
    
}
