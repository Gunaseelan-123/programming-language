#include<stdio.h>
void plusetwo(int *a){
*a=*a+2;
printf("In the value of a is %d\n",*a);
}
int main()
{
int n;
int *ptr=&n;
scanf("%d",&n);
    printf("before ,n in main %d\n",n);
    plusetwo(ptr);
    printf("after , n in main %d",n);

}
