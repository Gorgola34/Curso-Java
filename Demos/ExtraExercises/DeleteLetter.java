package Demos.ExtraExercises;
public class DeleteLetter {

    public static void main(String[] args) {
        String name="Oso baboso";
        String result="";
        for(int i=1;i<name.length()-1;i++){
            result+=name.charAt(i);

        }
        System.out.println(result);

    }
    
}
