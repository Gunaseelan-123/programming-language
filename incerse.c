#include<stdio.h>
int main(){
int n,arr[n],i,j;
printf("enter the size:");
scanf("%d",&n);
printf("enter the values in the array:");
for(i=0;i<n;i++)
{
scanf("%d",&arr[i]);
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i>j)
{
printf(arr[i]);
}
}
}
}
