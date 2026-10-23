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

struct node* insertatbtw(struct node* head, int data, int index){
    struct node* ptr = (struct node*)malloc(sizeof(struct node));
    struct node* preptr = head;
    int i = 0;

    // Move to (index-1) position
    while(i != index - 1){
        preptr = preptr->next;
        i++;
    }

    ptr->data = data;          // Assign data
    ptr->next = preptr->next;  // Link new node
    preptr->next = ptr;

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

    head = insertatbtw(head, 44, 2);

    printf("\nAfter insertion:\n");
    linkedlist_traversing(head);

    return 0;
}
