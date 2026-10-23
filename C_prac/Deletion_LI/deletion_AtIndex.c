// deletion at btw at particular index

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

struct node* deleteatbtw(struct node* head,int index){
    struct node* preptr=head;
    struct node* ptr;
    int i=0;
    while(i!=index){
        preptr=preptr->next;
        i++;
    }
    ptr->next=preptr->next;
    preptr->next=ptr;
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

    head = deleteatbtw(head,2);
    

    printf("\nAfter deletion:\n");
    linkedlist_traversing(head);

    return 0;
}
