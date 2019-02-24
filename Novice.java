import java.util.*;
public class Novice{ 
    public String career;
    public int hp;
    public int exp;
    public int money;
    public Novice(){
        hp = 100;
        exp = 0;
        money = 0;
        career = new String("Novice");

    }
    public void DrogonFight()
    {
        exp = exp + 25;
        hp = hp - 15;
        money = money + 20;
    }
    public void Monster()
    {
        exp = exp + 2;
        hp = hp - 1;
        money = money + 30;
    }
    public int get_money(){
        return money;
    }
    public int get_hp(){
        return hp;
    }
    public int get_exp(){
        return exp;
    }


}