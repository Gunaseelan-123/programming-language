import java.util.*;
class main
{
public static void main(String[]agrs)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rs=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(n%2==0)
{
System.out.println("true");
break;
}
else
{
System.out.println("false");
break;
}
}
}
}


