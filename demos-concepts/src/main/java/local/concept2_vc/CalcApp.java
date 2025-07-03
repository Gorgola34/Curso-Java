package local.concept2_vc;

import local.exceptions.BusinessException;

public class CalcApp {

    public static void main(String[] args) throws BusinessException {
        System.out.println("Calculadora");

        CalcView view = new CalcView(null);
        CalcController controller= new CalcController();
        System.out.println(controller);
        System.out.println(view);
        view.show();

}

}
