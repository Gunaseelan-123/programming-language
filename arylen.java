import java.util.*;
class arylen{
public static void main(String[]agrs){
Scanner sc=new Scanner(System.in);
int a[][]=new int [4][4];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){

a[i][j]=sc.nextInt();

System.out.print(a[i][j]+"");
}
System.out.println();

}
}
}