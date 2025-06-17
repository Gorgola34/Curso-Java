package MasIteraciones;

public class Matrix {

    public static void matrix(){
        int [][] matrixNumbers= new int [3][3];
        matrixNumbers[0][0]=22;
        matrixNumbers[0][1]=44;
        matrixNumbers[0][2]=50;

        matrixNumbers[1][0]=22;
        matrixNumbers[1][1]=44;
        matrixNumbers[1][2]=50;

        matrixNumbers[2][0]=22;
        matrixNumbers[2][1]=44;
        matrixNumbers[2][2]=50;

         for(int i=0;i< matrixNumbers.length;i++){
        for(int j=0;j<matrixNumbers[i].length;j++){
            System.out.print(matrixNumbers[i][j] + " ");

        }
       }
       System.out.println("");

       for(int[] row:matrixNumbers){
        for(int j:row){
            System.out.println(j + " ");
        }
        System.out.println("");
       }
            }

            public static void matrixString(){
                String[][] pets={
                    {"Perro", "gato", "conejo"},
                    {"Pato","Cisne","Paloma"}

                };
            }
        
    public static void main(String[] args) {
        matrix();

        int [][] x={
            {23,56,78},
            {12,67,89},
            {34,22,18}
        };



        
       
        
        
        
    }
    
}
