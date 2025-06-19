package Demos.OOP;

public class MainCharacter {

    public static void main(String[] args) {

        Character character1=new Character("Zelda",3000,true,'M');
        Character character2=new Character("Link",2000,false,'G');
        System.out.println(character1.name);
        System.out.println(character1.hp);
        System.out.println("¿Es un zombie?"+character1.isZombie);
        System.out.println(character1.type);
        System.out.println(character2.name);
        System.out.println(character2.hp);
        System.out.println("Es un zombie?"+character2.isZombie);
        System.out.println(character2.type);
       
        


        
    }
    
}
