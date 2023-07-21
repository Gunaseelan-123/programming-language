import java.util.io;
public class main
{
public static void main(String[]agrs)
{
Scanner sc=new.Scanner(System.in);
int []binary=sc.nextInt();
int id=sc.nextInt();
for(int i=num-1;i>0;i--)
System.out.println(binary[i]+"");
}
int num=0;
while(num>0)
{
binary[id++]=num%2;
num=num/2;
System.out.println(binary,id);
}
}