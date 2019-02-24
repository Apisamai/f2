public class Explorers extends Novice
{
    public Explorers()
    {
        this.hp = 2000;
        int speed = 5;
        this.career = new String("Explorers");
    }
    public void Property_Explorers()
    {
        System.out.println("> Career : Explorers");
        System.out.println("HP : " + hp);
        System.out.println("Speed : 20");
        System.out.println("Map : 50%");
    }
}