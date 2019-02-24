import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class Store
{
    static Bag ClassBag = new Bag(); 
    static Scanner in = new Scanner(System.in);
    static String Armor = new String("Armor");
    static String Damage = new String("Damage");
    static String Life = new String("Life stealed");
    public static int store(int Your_money)
    {  
        String Ans;
        int money;
        System.out.println("1.Armor\n2.Damage\n3.Life Stealed");
        System.out.println("> Enter the number you want to use:");
        Ans = in.next();
        money = Choose_Item(Ans, Your_money);
        return money; 
    }
    public static int Choose_Item(String Your_Ans, int money)
    {
        switch(Your_Ans.charAt(0)){
            case '1' : 
            {
                if(money >= 90){
                    money = money - 90;
                    ClassBag.Keep_Item(Armor);
                }
                else
                    System.out.println("You have enough money");
                
                break;
            }
            case '2' : 
            {
                 if(money >= 150){
                    money = money - 150;
                    ClassBag.Keep_Item(Damage);
                 }
                 else
                     System.out.println("You have enough money");
                
                break;
            }
            case '3' : 
            {
                if(money >= 250){
                    money = money - 250;
                    ClassBag.Keep_Item(Life);
                }    
                else 
                    System.out.println("You have enough money");
                break;
            }    
        }
        return money;
    }
    public static void randomItem(){
        String[] Item = {"Armor please press 1","Damage please press 2","Life Stealed please press 3"};
        String random = (Item[new Random().nextInt(Item.length)]);
        System.out.println("> If you want to buy " + random);
    }
}