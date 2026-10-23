#include<stdio.h>
#include<stdlib.h>

struct stack{
    int size;
    int top;
    int *arr;
};

int isempty(struct stack *ptr){
    if(ptr->top==-1){
        return 0;
    }
}
     
int isfull(struct stack *ptr){
    if(ptr->top==ptr->size-1){
        return 0;
    }
}

int main(){
  
        /*struct stack s;
         s.size =100;
         s.top=-1;
         s.arr=(int *)malloc(s.size * sizeof(int));*/

         struct stack *s;
         s->size =100;
         s->top=-1;
         s->arr=(int *)malloc(s->size * sizeof(int));
         
         //pushing an element
         s->arr[5];
         s->top++;

        //check if stack is empty
         if(isempty(s)){
            printf("the stack is empty");
         }else{
            printf("stack is not empty"); 
         }

    return 0;
}





#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node *head = NULL;

// Insert at Beginning
void insertBeginning(int value) {
    struct node *newnode;
    newnode = (struct node*)malloc(sizeof(struct node));

    newnode->data = value;
    newnode->next = head;
    head = newnode;
}

// Insert at End
void insertEnd(int value) {
    struct node *newnode, *temp;
    newnode = (struct node*)malloc(sizeof(struct node));

    newnode->data = value;
    newnode->next = NULL;

    if (head == NULL) {
        head = newnode;
    } else {
        temp = head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = newnode;
    }
}

// Insert at Given Position
void insertPosition(int value, int pos) {
    struct node *newnode, *temp;
    int i;

    newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = value;

    temp = head;

    for (i = 1; i < pos - 1; i++) {
        temp = temp->next;
        if (temp == NULL) {
            printf("Position not found!\n");
            return;
        }
    }

    newnode->next = temp->next;
    temp->next = newnode;
}

// Display List
void display() {
    struct node *temp = head;

    printf("\nLinked List:\n");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

int main() {
    insertBeginning(10);
    insertBeginning(5);

    insertEnd(20);
    insertEnd(30);

    insertPosition(15, 3);  // Insert 15 at position 3

    display();

    return 0;
}



#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node *head = NULL;

// Insert at end (to create list)
void insertEnd(int value) {
    struct node *newnode, *temp;
    newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = value;
    newnode->next = NULL;

    if (head == NULL) {
        head = newnode;
    } else {
        temp = head;
        while (temp->next != NULL)
            temp = temp->next;
        temp->next = newnode;
    }
}

// Delete at Beginning
void deleteBeginning() {
    struct node *temp;

    if (head == NULL) {
        printf("List is empty\n");
        return;
    }

    temp = head;
    head = head->next;
    free(temp);

    printf("Node deleted from beginning\n");
}

// Delete at End
void deleteEnd() {
    struct node *temp, *prev;

    if (head == NULL) {
        printf("List is empty\n");
        return;
    }

    if (head->next == NULL) {
        free(head);
        head = NULL;
        return;
    }

    temp = head;
    while (temp->next != NULL) {
        prev = temp;
        temp = temp->next;
    }

    prev->next = NULL;
    free(temp);

    printf("Node deleted from end\n");
}

// Delete at Given Position
void deletePosition(int pos) {
    struct node *temp, *prev;
    int i;

    if (head == NULL) {
        printf("List is empty\n");
        return;
    }

    temp = head;

    if (pos == 1) {
        head = temp->next;
        free(temp);
        printf("Node deleted at position %d\n", pos);
        return;
    }

    for (i = 1; i < pos; i++) {
        prev = temp;
        temp = temp->next;

        if (temp == NULL) {
            printf("Position not found\n");
            return;
        }
    }

    prev->next = temp->next;
    free(temp);

    printf("Node deleted at position %d\n", pos);
}

// Display List
void display() {
    struct node *temp = head;

    printf("Linked List: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

int main() {

    // Creating sample list
    insertEnd(10);
    insertEnd(20);
    insertEnd(30);
    insertEnd(40);

    display();

    deleteBeginning();
    display();

    deleteEnd();
    display();

    deletePosition(2);
    display();

    return 0;
}