class Player
{
public Player()
{
System.out.println("In Player:");
}
}
public class Bowler extends Player
{
public Bowler(String name)
{
System.out.println("In Bowler:"+name);
}
public static void main(String args[])
{
Bowler b = new Bowler("Jasprit");
}
}