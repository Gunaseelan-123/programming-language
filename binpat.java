import java.util.*;
class binpat{
public static void main(String[]agrs)
{
int n=5;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==1&&j==2||i==2&&j==1||i==2&&j==3||i==2&&j==3||i==3&&j==2)
{
System.out.print("0");
}
System.out.print("1");
}
System.out.println();}
}
}