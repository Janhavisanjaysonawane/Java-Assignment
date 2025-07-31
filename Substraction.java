import java.util.*;
public class Substraction
{
public static void main(String args[])
{
int a,b,c,d,e;
System.out.println("Enter the first number:");
Scanner s = new Scanner(System.in);
a = s.nextInt();
System.out.println("Enter the second number:");
b = s.nextInt();
System.out.println("Enter the third number:");
c = s.nextInt();
System.out.println("Enter the forth number:");
d = s.nextInt();
e = a-b-c-d;
System.out.println("Substraction is"+e);
}
}