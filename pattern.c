#include<stdio.h>
int main()
{
    char a,len;
    scanf("%s",&a);
    len=strlen(a);
    for(int i=1;i<len;i++){
        printf("*");
}
}

