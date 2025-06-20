package Invoid;

public class MainInvoice {

    public static void main(String[] args) {
        Company c1= new Company("Motorola","Avenida los palos","6785799","023456L");
        Invoid i1= new Invoid(Pay.BIZUM,"Motorola",21.0,34.6);
        Products p1=new Products("Stabilished emotion",34.5);
        c1.showCompany();
        System.out.println();
        i1.showInvoid();
        System.out.println("TOTAL " +i1.total(21.0,34.6) +" " + "EU");
        System.out.println();
        p1.showProducts();
       
        
    }

}
