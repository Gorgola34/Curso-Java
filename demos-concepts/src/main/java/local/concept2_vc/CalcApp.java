package local.concept2_vc;

public class CalcApp {

    public static void main(String[] args) {
        System.out.println("Calculadora");

        CalcView view = new CalcView();
        CalcController controller= new CalcController();
        System.out.println(controller);
        System.out.println(view);

}

}
