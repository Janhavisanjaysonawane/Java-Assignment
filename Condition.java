import java.util.*;
public class Condition
{
public static void main(String args[])
{
int a,b;
System.out.println("Enter two numbers:");
Scanner s = new Scanner(System.in);
a = s.nextInt();
b = s.nextInt();
if(a == b)
{
System.out.println("Both are equal number");
}
else if(a > b)
{
System.out.println(a+"greater than"+b);
}
else
{
System.out.println(b+"greater than"+a);
}
}
}


