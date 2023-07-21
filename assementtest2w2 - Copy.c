#include<stdio.h>
#include<stdlib.h>

void create();
void display();
void count();
void deletefirst();
struct node
{
    int data;
    struct node *next;
}*head,*temp,*newnode;
int main()
{
    int option;
    while(1)
    {
        printf("\n\nSingly Linked List:\n\n");
        printf("1.Create\n");
        printf("2.Display\n");
        printf("3.Count\n");
        printf("4.delete first element\n");
        printf("5.Exit\n");
        printf("Enter your Choice:(1,2,3,4,5)\n");
        scanf("%d",&option);
        switch(option)
        {
        case 1:
            create();
            break;
        case 2:
            display();
            break;
        case 3:
            count();
            break;
        case 4:
            deletefirstele();
            break;
        case 5:
            exit(0);
            break;
        }
    }
}

void create()
{
    int n,i,val;
    printf("enter size: ");
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        newnode=(struct node*)malloc(sizeof(struct node));
        printf("enter data:");
        scanf("%d",&val);
        newnode->data=val;
        newnode->next=NULL;
        if(head==NULL)
        {
            head=newnode;
            temp=newnode;
        }
        else
        {
            temp->next=newnode;
            temp=newnode;
        }
    }
}

void display()
{
    temp=head;
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
}

void count()
{
    int count=0;
    temp=head;
    while(temp!=NULL)
    {
        temp=temp->next;
        count++;
    }
    printf("\n%d",count);
}
void deletefirst()
{

    struct node*cur;
    if(head!==NULL)
        printf("list is empty\n");
    cur=head;
    head=head->next;
    free(cur);

}
