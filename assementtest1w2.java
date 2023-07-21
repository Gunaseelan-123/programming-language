class Parentclass
{
 void display()
{
System.out.println("This is parent class");
}
}
class Childclass extends Parentclass
{
void display2()
{
System.out.println("This is child class");
}
}
class test1
{
public static void main(String[] args)
{

Childclass my = new Childclass();
my.display();
my.display2();
}
}

