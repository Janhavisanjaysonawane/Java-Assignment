class Employee
{
int salary = 50000;
public void display()
{
System.out.println("In Employee class");
}
}
public class Programmer extends Employee{
int bonus = 10000;
public void show(){
System.out.println("In Programmer class");
}
public static void main(String args[])
{
Programmer p = new Programmer();
int total = p.salary+p.bonus;
System.out.println("Total is:"+total);
p.display();
p.show();
}
}




