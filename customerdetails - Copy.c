#include <stdio.h>
struct customer{
    char name[30];
    int  cusId;
    char add[20];
};

 int main()
{
 struct customer cus;
 for(int i=0;i<3;i++)
    {
scanf("%s,&",&cus.name,&cus.cusId,&cus.add);
    printf("Name: %s\n"   ,cus.name);
    printf("Id: %d\n"     ,cus.cusId);
    printf("adderes: %s\n",cus.add);
    }
    return 0;
}
