import java.util.*;
class  employees1
{
void display()
{
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();
int year=sc.nextInt();
String address=sc.nextLine();
System.out.println(name );
System.out.println(year);
System.out.print(address);
}
}
class employees2 extends employees1
{
void display2()
{
Scanner s=new Scanner(System.in);
String name=s.nextLine();
int year=s.nextInt();
String add=s.nextLine();
System.out.println(name );
System.out.println(year);
System.out.print(add);
}
}
class employees3 extends employees2
{
void display3()
{
Scanner s1=new Scanner(System.in);
String name=s1.nextLine();
int year=s1.nextInt();
String add=s1.nextLine();
System.out.println(name );
System.out.println(year);
System.out.print(add);
}
}
class emp
{
public static void main(String[]agrs)
{
employees3 my=new employees3();
my.display();
my.display2();
my.display3();
}
}
