#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*next;

}*head,*temp,*newnode;
int main()
{
void create()
{
    int n,val;
    printf("Enter the size :");
    scanf("%d",&n);
for(int i=0;i<n;i++)
    {
   newnode=(struct node*)malloc(sizeof(struct node));
  printf("Enter the data:");
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
    while(temp->next!=NULL)
    {
    printf("%d ",temp->data);
        temp=temp->next;
    }
}
void main()
{
    create();
    printf("%d",temp->data);
    display();

}
}
