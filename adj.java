public class adj{
public static void main(String[]agrs){
int a[][]={{1,2},{3,4}};
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
if(i==0&&j==0)
{System.out.print(a[1][1]+"");
}
else if(i==1&&j==1)
{
System.out.print(a[0][0]+"");
}
else
{
System.out.print(-a[1][0]+"");
}

}
System.out.println();

}
}
}