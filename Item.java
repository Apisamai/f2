import java.util.Random;
import java.util.Scanner;

public class Item
{
    public static int heal;
    public static Store ClassStore = new Store();
    public static Bag ClassBag = new Bag();
    public static Novice ClassNovice = new Novice(); 
    public static int item(String YourItem, int hp)
    {
        if(YourItem.equals("Armor"))
        {   
            hp = hp + heal;
            System.out.println("You get 10% protection.");
        } 
        else if(YourItem.equals("Damage"))
        {   
            hp = hp + heal;
            System.out.println("You will fight better.");
        }     
        else if(YourItem.equals("Life stealed"))
        {   
            hp = hp + heal;
            System.out.println("You will he helped.");
        }  
        
        return hp;             
    }
    public void print(){
        System.out.println("Name :" + heal);
    }  
}