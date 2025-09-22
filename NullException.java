public class NullException
{
public static void main(String args[])
{
try
{
String n = null;
System.out.println("The length of the String is:"+n.length());
}
catch(Exception e)
{
System.out.println("We can not find the length of Null String");
}
}
}