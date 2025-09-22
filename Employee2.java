 public class Employee2
{
int emp_id;
String name;
int salary;
String dept;
public Employee2()
{
emp_id=102;
name="Ram";
System.out.println("emp_id:"+emp_id"name:"+name);
}
public Employee2(int id,String n){
emp_id=id;
String n =name;
System.out.println("Employee Id: "+emp_id+" Employee Name: "+name);
}
public Employee2(int s,String d){
int s=salary;
String d=dept;
 System.out.println("Employee Salary: "+salary+" Employee dept: "+dept);
}
public Employee2(int em,String na){
int em=emp_id;
String na=name;
 System.out.println("Employee Id: "+emp_id+" Employee Name: "+name);
}
public static void main(String args[])
{
Employee2 e=new Employee2();
Employee2 e1=new Employee2(100,"Harshda");
Employee2 e2=new Employee2(1000,"information Technology");
Employee2 e3=new Employee2(132,"janavhi");
}
}
