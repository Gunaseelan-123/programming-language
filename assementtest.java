import java.util.*;
class rectangle{
Scanner sc=new Scanner(System.in);
void display()
{
int l,b,area;
l=sc.nextInt();
b=sc.nextInt();
area=l*b;
System.out.println("rectangle:"+area);
}
}
class triangle extends rectangle{
Scanner s=new Scanner(System.in);
void display2()
{
int ll,area1;
ll=s.nextInt();
area1=ll*ll;
System.out.println("triangle:"+area1);
}
}
class circle extends triangle{
Scanner s1=new Scanner(System.in);
void display3()
{
int r;
r=s1.nextInt();
float area2;
float p=3.14f;
area2=p*r*r;
System.out.println("circle:"+area2);
}
}
class main
{
public static void main(String[]agrs){
circle my =new circle();
my.display();
my.display2();
my.display3();
}
}