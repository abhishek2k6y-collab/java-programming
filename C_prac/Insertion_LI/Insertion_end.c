
// insertion at end
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

struct node* insertatend(struct node* head, int data){
    struct node* ptr = (struct node*)malloc(sizeof(struct node));
    struct node* preptr = head;

    // Move to (index-1) position
    while(preptr->next!=NULL){
    preptr=preptr->next;
    }

    ptr->data = data;          // Assign data
    preptr->next =ptr;  // Link new node
    ptr->next =NULL;

    return head;
}   //function properly closed

int main(){
    struct node* head;
    struct node* second;
    struct node* third;
    struct node* fourth;
 
    head = (struct node*)malloc(sizeof(struct node));
    second = (struct node*)malloc(sizeof(struct node));
    third = (struct node*)malloc(sizeof(struct node));
    fourth = (struct node*)malloc(sizeof(struct node));

    head->data = 7;
    head->next = second;
    
    second->data = 11;
    second->next = third;

    third->data = 17;
    third->next = fourth;

    fourth->data = 87;
    fourth->next = NULL;

    printf("Before insertion:\n");
    linkedlist_traversing(head);

    head = insertatend(head, 44);

    printf("\nAfter insertion:\n");
    linkedlist_traversing(head);

    return 0;
}