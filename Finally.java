import java.util.*;
public class Finally
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter two numbers:");
int a = s.nextInt();
int b = s.nextInt();
try
{
int c=a/b;
System.out.println("Division is :"+c);
}
catch(Exception e)
{
System.out.println("can not divide by zero");
}
finally
{
System.out.println("The inputs are:"+a+" & "+b);
}
}
}