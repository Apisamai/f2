public class Villagers extends Novice
{
    public Villagers()
    {
        this.hp = 6000;
        int disappear = 2;
        int seed = 10;
        this.career = new String("Villagers");
    }
    public void Property_Villagers()
    {
        System.out.println("> Career : Villagers");
        System.out.println("HP : " + hp);
        System.out.println("The seed : 10");
        System.out.println("Disappear : Night");
    }
}