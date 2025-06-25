import java.util.*;
public class Arrays {

    public static void foo(int[] data){

        int[] newData= data.clone();

        data[0]=400;

    }

    public static void main(String[] args) {

        int[] data={1,2,4,6,89};
        System.out.print("[");
        for(int i:data){
           System.out.print(" " + i);
           
        }
        System.out.print("]");
        System.out.println(data.clone());
        int[] data2=data;
        int[] data3={1,2,4,6,89};
        System.out.println(data==data2);
        System.out.println(data==data3);
        foo(data3);
        System.out.println(data3);
        System.out.println(data3[0]);


        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(34);
        list.add(5);
        list.add(89);

        System.out.println("[");
        for(int i:list){
            System.out.println(i + " ");
        }
        System.out.println("]");
        

    }

}
