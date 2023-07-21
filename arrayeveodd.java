import java.util.*;
class oddeven
{
public static void main(String[]agrs)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
System.out.println( arr[i]);
}
int evencount=0,oddcount=0,sum;
for(int i=0;i<n;i++)
{
if(arr[i]<0)
{
System.out.println("negative number"+arr[i]);}
if(arr[i]%2==0)
{
evencount++;
System.out.println("The even number are"+arr[i]);
arr[i]++;
}
else
{
oddcount++;
System.out.println("The odd number are"+arr[i]);
arr[i]++;
}

}
System.out.println("even"+evencount);
System.out.println("odd"+oddcount);

}

}