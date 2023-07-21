#include<stdio.h>
int main()
{
int i=0,j=0;
    int arr[5][5]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
 for(i=0;i<5;i++){
 for(j=0;j<5;j++){
   printf("arr[%d] [%d] = %d \n",i,j,arr[i][j]);
 }
    }

int a1,b;
    scanf("%d%d",&a1,&b);
    for(i=0;i<5;i++)
    {
        for(j=0;j<5;j++)
        {
            printf("%d",arr[b-1][a1-1]);
        }
    }
}
