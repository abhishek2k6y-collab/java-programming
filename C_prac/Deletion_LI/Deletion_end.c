// deletion at end

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

struct node* deleteatend(struct node* head){
    struct node* preptr=head;
    struct node* ptr=head->next;
    while(ptr->next!=NULL){
        preptr=preptr->next;
        ptr=ptr->next;
    }
    preptr->next=NULL;
    free(ptr); 
    return head;
}


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

    printf("Before deletion:\n");
    linkedlist_traversing(head);

    head = deleteatend(head);

    printf("\nAfter deletion:\n");
    linkedlist_traversing(head);

    return 0;
}