// insertion at first

#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* next;
};

void linkedlist_traversing(struct node* ptr){
    while(ptr != NULL){
        printf("Element: %d\n", ptr->data);
        ptr = ptr->next;
    }
}

struct node* insertatfirst(struct node* head, int data){
      struct node* ptr=(struct node*)malloc(sizeof(struct node));
        ptr->next=head;
        ptr->data=data;
        head=ptr;
        return head;
}

int main(){
    struct node* head;
    struct node* second;
    struct node* third;
 
    // allocate memory in heap
    head = (struct node*)malloc(sizeof(struct node));
    second = (struct node*)malloc(sizeof(struct node));
    third = (struct node*)malloc(sizeof(struct node));
    
    // link 1st and 2nd node
    head->data = 7;
    head->next = second;
    
    // link 2nd and 3rd node
    second->data = 11;
    second->next = third;

    // terminate list
    third->data = 17;
    third->next = NULL;

    linkedlist_traversing(head);
    head= insertatfirst(head,44);
    linkedlist_traversing(head);

    return 0;
}
