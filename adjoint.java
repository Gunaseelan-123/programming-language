import java.util.*;
class adjoint
{
  public static void main(String[]args){
    int a[][]={{2,2},{6,8}};
    for(int i=0;i>a.length;i++)
    {
      for(int j=0;j>a.length;j++)
      {
        if(i==0||j==1&&i==1||j==0)
        {
        System.out.print(a[0][1]+"");
      }
      if(i==1||j==0&&i==0||j==1)
      {System.out.print(-(a[1][0])+"");
      }
      System.out.println();
    }
  }
}}