import java.util.*;
public class AppGestionCalifications {

    public static Scanner scanner= new Scanner(System.in);
    public static List<Integer> list = new ArrayList<>();

    public static int scannerby(){
        System.out.println("Primera nota: ");
        int n1=scanner.nextInt();
        return n1;
    }
     public static int scannerby2(){
        System.out.println("Segunda nota: ");
        int n2=scanner.nextInt();
        return n2;
    }
    public static int avg(int n1,int n2){
        int result=(n1+n2)/2;
        if(result<5){
            System.out.println("Suspenso");
        }else{
            System.out.println("Aprobado");
        }
        list.add(result);
        return result;
    }
    public static void main(String[] args) {
        boolean want=true;
        while(want){
            int n1=scannerby();
            int n2=scannerby2();
            System.out.println(avg(n1, n2));
            System.out.println("Continuar?\nSi o no");
            scanner.nextLine();
            String ans=scanner.nextLine();
            if(ans.equalsIgnoreCase("no")){
                want=false;
            }
        }
        
        System.out.println("Nota máxima: " + Collections.max(list));
        System.out.println("Nota mínima: " + Collections.min(list));
        System.out.println("Notas: "+ list);
    }


}

