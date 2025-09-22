public class Employee
{
int emp_id,salary;
String name;
public Employee()
{
emp_id=101;
salary=25000;
name="Janhavi";
}
public void display()
{
System.out.println("Employee Information");
System.out.println("Employee ID:"+emp_id);
System.out.println("Employee salary:"+salary);
System.out.println("Employee name:"+name);
}
public static void main(String args[])
{
Employee e=new Employee();
e.display();
}
}
