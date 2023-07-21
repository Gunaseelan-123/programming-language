#include<stdio.h>
#include<stdlib.h>
void create();
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
    newnode=(struct node*)malloc(size of(struct node));
    printf("Eter the data:");
    scanf("%d",&val);
    newnode->data=val;
    newnode->next=NULL;
    if(head==NULL)
    {
        head=newnode;
        temp=newnode;
}
else{
    temp=next->newmode;
    temp=newnode;
}
}
}
void display()
{
    temp=head;
    if(temp!=NULL)
    {
    printf("%d ",temp->data);
        temp=temp->next;
    }
}
}
