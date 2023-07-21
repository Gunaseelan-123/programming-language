import java.util.*;
class employee
{
void display1()
{
Scanner sc=new Scanner(System.in);
String name=sc.next();
int Age=sc.nextInt();
Long Phonenumber=sc.nextLong();
String address=sc.next();
int salary=sc.nextInt();
System.out.print("Employee name:\n"+name );
System.out.print("EmployeeAge:\n"+Age );
System.out.print("Employeeph:\n"+Phonenumber);
System.out.print("Employee:\n"+address);
System.out.print("Employeesalary:\n"+salary);
}
}
class manager extends employee
{
void display2()
{
Scanner s=new Scanner(System.in);
String name=s.next();
int Age=s.nextInt();
Long Phonenumber=s.nextLong();
String address=s.next();
int salary=s.nextInt();
System.out.print("Manager name:\n"+name );
System.out.print("Manager  Age:\n"+Age );
System.out.print("Managerph:\n"+Phonenumber);
System.out.print("Manager:\n"+address);
System.out.print("Manager salary:\n"+salary);
}
}
class member
{
public static void main(String[]agrs)
{
employee obj=new employee();
manager obj2=new manager();
obj.display1();
obj2.display2();
}
}
