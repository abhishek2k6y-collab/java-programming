#include <stdio.h>
#include <stdlib.h>

// Structure of Doubly Linked List Node
struct node {
    int data;
    struct node* prev;
    struct node* next;
};

// Function to traverse list forward
void traverseForward(struct node* head) {
    struct node* ptr = head;
    printf("Forward Traversal: ");
    while (ptr != NULL) {
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
    printf("\n");
}

// Function to traverse list backward
void traverseBackward(struct node* tail) {
    struct node* ptr = tail;
    printf("Backward Traversal: ");
    while (ptr != NULL) {
        printf("%d ", ptr->data);
        ptr = ptr->prev;
    }
    printf("\n");
}

int main() {

    // Creating pointers of nodes
    struct node* head;
    struct node* second;
    struct node* third;

    // Allocating memory
    head = (struct node*) malloc(sizeof(struct node));
    second = (struct node*) malloc(sizeof(struct node));
    third = (struct node*) malloc(sizeof(struct node));

    head->data = 10;         // Assigning data
    head->prev = NULL;       // Linking nodes
    head->next = second;     // Linking nodes
    
    second->data = 20;
    second->prev = head;
    second->next = third;

    third->data = 30;
    third->prev = second;
    third->next = NULL;

    // Traversing
    traverseForward(head);
    traverseBackward(third);

    return 0;
}
