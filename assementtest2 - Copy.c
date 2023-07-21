#include<stdio.h>
int main()
{
    char string[10];
    scanf("%s",string);
    char str[10];
    scanf("%s",str);
    int n=strlen(string);
    int temp=0;
    for(int i=0;i<n;i++)
    {
            if(string[i]!=string[i+1])
            {
                temp=string[i+1];
                string[i+1]=string[i];
                string[i]=temp;

            }
        }
    for(int i=0;i<n;i++)
    {
        if(string[i]==str[i])
    {
        printf("true");
        break;
    }
    else
    {
        printf("false");
        break;
    }
}
}

