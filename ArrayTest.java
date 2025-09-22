public class ArrayTest
{
public static void main(String args[])
{
int arr[] = {1,2,3,4,5};
try
{
System.out.println(arr [6]);
}
catch(Exception e)
{
System.out.println("Length of Array is 4 and you can not find the element of 6 position");
}
}
}
