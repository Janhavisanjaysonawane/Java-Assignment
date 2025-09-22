class Player
{
public Player(String name)
{
System.out.println("In Player Constructor:"+name);
}
}
public class Batsman extends Player
{
public Batsman()
{
super("Cricket");
System.out.println("In Batsman Constructor");
}
public static void main (String args[])
{
Batsman b = new Batsman();
}
}




