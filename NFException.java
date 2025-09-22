public class NFException
{
public static void main(String args[])
{
String n = "Janhavi";
try
{
int a =Integer. parseInt(n);
System.out.println(a);
}
catch(Exception e)
{
System.out.println("We can not convert the String or Character into integer");
}
}
}