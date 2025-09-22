class Animal
{
void voice()
{
System.out.println("In voice of Animal class");
}
}
public class Dog extends Animal
{
void bark()
{
System.out.println("In Bark of Dog class");
}
public static void main(String args[])
{
Animal a = new Animal();
a.voice();
}
}