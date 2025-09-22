public class Employee1
{
int emp_id;
String name;
public Employee1(int id, String n)
{
emp_id = id;
name=n;
System.out.println("Employee ID:"+emp_id+" Employee Name:"+name);
}
public Employee1(Employee1 obj)
{
emp_id=obj.emp_id;
name=obj.name;
System.out.println("Employee ID:"+emp_id+" Employee Name:"+name);
}
public static void main(String args[])
{
Employee1 e =new Employee1(102,"Janhavi");
Employee1 e1=new Employee1(e);
}
}
