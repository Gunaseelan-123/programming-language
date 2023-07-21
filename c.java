import java.util.*;
class c{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
int a=sc.nextInt();
for(int i=0;i<a;i++){
for(int j=0;j<a;j++){

if((i==0&&j==4)||(i==0 && j==5) || (i==0 && j==6) || (i==0 && j==7) ||
            (i==10 && j==4) || (i==10 && j==5) || (i==10 && j==6) || (i==10 && j==7)){
                System.out.print("#");}
if((i==2&&j==2)||(i==3&&j==2)||(i==4&&j==2))
{
System.out.println("*");}
else{
System.out.print(" ");
}}
}
}}