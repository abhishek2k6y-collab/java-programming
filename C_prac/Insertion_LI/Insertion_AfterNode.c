//insertion after a node

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

struct node* insertatafter(struct node* head,struct node* prev,int data){
    struct node* ptr = (struct node*)malloc(sizeof(struct node));
    struct node* preptr = head;
     ptr->data = data;          // Assign data
    ptr->next =prev->next;  // Link new node
    prev->next =ptr;

    return head;
}   // function properly closed

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

    head = insertatafter(head,third, 44);

    printf("\nAfter insertion:\n");
    linkedlist_traversing(head);

    return 0;
}