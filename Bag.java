import java.util.*;
public class Bag{
    static Item ClassItem = new Item();
    Novice ClassNovice = new Novice();
    static Scanner in = new Scanner(System.in);
    static Main Classmain = new Main();
    public static ArrayList<String> keep;    
    public Bag(){
        keep = new ArrayList<String>();

    }
    public static void Keep_Item(String item)
    {   
        keep.add(item); 
    }
    public static int Use_Item(int HP)
    {
        String Your_Ans;
        int j = 0;
        for(String i : keep)
        {
            System.out.printf("%d. %s\n", j + 1, i);
            j++;
        }
        System.out.print("> Enter the number you want to use:");
        Your_Ans = in.next();
        switch(Your_Ans.charAt(0)){
            case '1' : {ClassItem = new Armors(); HP = ClassItem.item(keep.get(0), HP); keep.remove(0);ClassItem.print(); break;}
            case '2' : {ClassItem = new Damage();HP = ClassItem.item(keep.get(1), HP); keep.remove(1);ClassItem.print(); break;}
            case '3' : {ClassItem = new Life_Stealed();HP = ClassItem.item(keep.get(2), HP); keep.remove(2);ClassItem.print(); break;}
        }
        return HP;
    }
}