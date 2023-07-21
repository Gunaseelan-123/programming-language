import java.util.*;
class box
{
void display()
{
Scanner sc=new Scanner(System.in);
double width=sc.nextDouble();
double heigth=sc.nextDouble();
double depth=sc.nextDouble();
double vol=width*heigth*depth;
}
}
class boxdemo
{
public static void main(String[]args)
{
double vol;
box mybox = new box();
System.out.println("volume"+mybox.vol);
}
}
