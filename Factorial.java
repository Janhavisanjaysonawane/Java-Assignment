import java.util.*;
public class Factorial
{
public static void main(String args[])
{
int a,i,fact=1;
System.out.println("Enter the number:");
Scanner s = new Scanner(System.in);
a = s.nextInt();
for(i = 1;i <= a;i++)
{
fact = fact*i;
}
System.out.println("The Factorial of number is:"+fact);
}
}



