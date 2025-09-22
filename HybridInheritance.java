interface Father
{
public void property();
}
interface Mother
{
public void property();
}
public class child implements Father,Mother
{
public void property()
{
System.out.println("In child property");
}
}
 class Grandchild1 extends child
{
 void property()
{

System.out.println("In Grandchild1 property");
}
}
 class Grandchild2 extends child
{
 void property()
{
System.out.println("In Grandchild2` property");
}
}
public class HybridInheritance
{
public static void main(String args[])
{
child c = new child();
c.property();
Grandchild g1 = new Grandchild1();
g1.property();
Grandchild g2 = new Grandchild2();
g2.property();
}
}

