abstract class Animal
{
public abstract void voice();
public void eat()
{
System.out.println("Eating");
}
}
class Tiger extends Animal
{
public void voice()
{
System.out.println("In Tiger voice");
}
public static void main(String args[])
{
Animal a = new Tiger();
a.voice();
a.eat();
}
}