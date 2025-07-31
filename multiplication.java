import java.util.*;
public class Multiplication
{
public static void main(String args[])
{
int a,b,c,d,e;
System.out.println("Enter the first number:");
Scanner p = new Scanner(System.in);
a = p.nextInt();
System.out.println("Enter the second number:");
b = p.nextInt();
System.out.println("Enter the third number:");
c = p.nextInt();
System.out.println("Enter the fourth number:");
d = p.nextInt();
e = a*b*c*d;
System.out.println("Multiplication is"+e);
}
}
