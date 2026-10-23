/* #include<stdio.h>
#include<stdlib.h>  //declaring header file for standard libaries

struct myarray{
    int total_size;  // total memory size to be reserved
     int used_size;  // memory to be used
     int *ptr;       // declaring int ptr
};

void createarr(struct myarray*x , int tsize, int usize){
   x->total_size=tsize;                             // arrow operator used to point the value store in
   x->used_size=usize;
   x->ptr=(int *)malloc(tsize * sizeof(int));     //(int *)malloc used to request dyanmic memory in heap

}

void show(struct myarray*x){
    for(int i=0; i< x->used_size; i++){
        printf("%d\n",(x->ptr)[i]);      //go to address of ptr, i is to move forward

    }
}

void inpval(struct myarray*x){                      // myarray*x point to m1 i.e marks
    for(int i=0; i< x->used_size; i++){
        int n;
        printf("enter elements(%d):",i);
        scanf("%d",&n);
        (x->ptr)[i]=n;

    }
}

int main(){
    struct myarray m1;   //creating a struct by creating a memory m1
createarr(&m1,10,2);

printf("running inpval\n");
inpval(&m1);

printf("running show\n");
show(&m1);

return 0;
} */


/*#include<stdio.h>

// code for traversal
void display(int arr[], int n){
     for (int i=0;i<n;i++)
     {
        printf("%d",arr[i]);
     }
     printf("\n");
}

// code for insertion

int indinsertion(int arr[],int size,int element,int index,int capacity){
    if(size>=capacity){
        return -1;
    }
    
    for(int i=size-1; i>=index; i--){
       arr[i+1]=arr[i];
    }
    arr[index]=element;
    
    return 1;
}

int main(){
  
    int arr[100]={2,6,10,20};
    int size=4, element=15, index=3;
    display(arr, size);

    int s=indinsertion(arr,size,element,index,100);
    size+=1;
    display(arr, size);
    return 0;
}*/


/*#include<stdio.h>

// code for traversal
void display(int arr[], int n){
     for (int i=0;i<n;i++)
     {
        printf("%d",arr[i]);
     }
     printf("\n");
}

// code for insertion

int indinsertion(int arr[],int size,int element,int index,int capacity){
    if(size>=capacity){
        return -1;
    }
    
    for(int i=size-1; i>=index; i--){
       arr[i+1]=arr[i];
    }
    arr[index]=element;
    printf("insertion successful");
    return 1;
}

int main(){
     int n,arr[100];
     printf("enter no. of elements");
     scanf("%d",&n); 

     for(int i=0;i<n;i++){
     printf("enter elements[%d]",i);
     scanf("%d",&arr[i]);
}

    int size=n;
    int element;           
    printf("enter element to insert");
    scanf("%d",&element); 
    int index;
    printf("enter index");
    scanf("%d",&index); 
    display(arr, size);

    int s=indinsertion(arr,size,element,index,100);
    if(s==-1){
        printf("insertion not successful");
    }else{
        size+=1;
        display(arr, size);
    }
    return 0;
}*/



/*#include<stdio.h>

// code for traversal
void display(int arr[], int n){
     for (int i=0;i<n;i++)
     {
        printf("%d",arr[i]);
     }
     printf("\n");
}

// code for deletion
int deletion(int arr[],int size,int index){
    
    for(int i=index; i<size-1; i--){
       arr[i]=arr[i+1];
    }

    return 1;
}

int main(){
  
    int arr[100]={2,6,10,20};
    int size=4, index=2;
    display(arr, size);

    deletion(arr,size,index);
    size-=1;
    display(arr, size);
    return 0;
}*/



 /*#include<stdio.h>

int linearsearch(int arr[],int size,int element){
   for(int i=0; i<size; i++){
    if(arr[i]==element){
    return i;
   }
}
return -1;
} 

int binarysearch(int arr[],int size,int element){
    int beg,mid,end;
    beg=0;
    end=size-1;
    mid=(beg+end)/2;
    while(beg<=end){
    if(arr[mid]=element){
        return mid;
    }
    else if(arr[mid]<element){
        return beg=mid+1;
    }else{
        return end=mid-1;
    }
}
return -1;
}



int main(){
    int arr[]={2,5,7,34,57,200,201,345,675,897,5321,38225};
    int size= sizeof(arr)/sizeof(int);
    int element=200;

    //int s=linearsearch(arr,size,200);
    //printf("element %d found at index%d\n",element,s);

    int b=binarysearch(arr,size,200);
    printf("element %d found at index%d",element,b);

 return 0;
}*/



/*#include<stdio.h>

int linearsearch(int arr[],int size,int element){
   for(int i=0; i<size; i++){
    if(arr[i]==element){
    return i;
   }
}
return -1;
} 

int binarysearch(int arr[],int size,int element){
    int beg,mid,end;
    beg=0;
    end=size-1;
    mid=(beg+end)/2;
    while(beg<=end){
    if(arr[mid]=element){
        return mid;
    }
    else if(arr[mid]<element){
        return beg=mid+1;
    }else{
        return end=mid-1;
    }
}
return -1;
}

int main(){
    int arr[]={2,5,7,34,57,200,201,345,675,897,5321,38225};
    int size= sizeof(arr)/sizeof(int);
    int element=200;

    //int s=linearsearch(arr,size,200);
    //printf("element %d found at index%d\n",element,s);

    int b=binarysearch(arr,size,200);
    printf("element %d found at index%d",element,b);

 return 0;
}*/



/*#include<stdio.h>
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

    return 0;
}*/




/*#include<stdio.h>
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
}*/



/*#include<stdio.h>
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
}   // ✅ function properly closed

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
}*/



/*#include<stdio.h>
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
}   // ✅ function properly closed

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
}*/



/*#include<stdio.h>
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
}   // ✅ function properly closed

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
}*/



/*include<stdio.h>
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

struct node* deleteatfirst(struct node* head){
    struct node* ptr=head;
    head=head->next;
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

    head = deleteatfirst(head);

    printf("\nAfter deletion:\n");
    linkedlist_traversing(head);

    return 0;
}*/



/*#include<stdio.h>
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
    struct node* ptr=head->next;
    int i=0;
    while(i<index-1){
        preptr=preptr->next;
        ptr=ptr->next;
        i++;
    }
    preptr->next=ptr->next;
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
}*/



/*#include<stdio.h>
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
}*/



/*#include<stdio.h>
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

struct node* deleteatvalue(struct node* head,int value){
    struct node* preptr=head;
    struct node* ptr=head->next;
    while(ptr->data!=value && ptr->next!=NULL){
        preptr=preptr->next;
        ptr=ptr->next;
    }
    preptr->next=ptr->next;
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

    head = deleteatvalue(head,17);

    printf("\nAfter deletion:\n");
    linkedlist_traversing(head);

    return 0;
}*/




/*#include <stdio.h>
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
}*/



/*#include<stdio.h>

void printarray(int *arr,int n){
    for(int i=0;i<n;i++){
        printf("%d\n",arr[i]);
    }
}

void bubblesort(int *arr,int n){
    for(int i=0;i<n-1;i++){                //for number of passes
        printf("working on pass no. %d\n",i+1);
        for(int j=0;j<n-1-i;j++){          //j is inner loop for comparing two cons adj elements for each passes
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];               //swaping
            arr[j+1]=temp;                            
        }
        }
    }
}
int main(){
       int arr[]={34,23,13,38,54,90,76,78,85};
       int n=9;
       printarray(arr,9);
       bubblesort(arr,9);
       printarray(arr,9);
}*/



//bubble sorttt
/*#include<stdio.h>

void printarray(int *arr,int n){
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}

void bubblesort(int *arr,int n){
    int issorted=0;
    for(int i=0;i<n-1;i++){                //for number of passes
        printf("working on pass no. %d\n",i+1);
        int issorted=1;
        for(int j=0;j<n-1-i;j++){          //j is inner loop for comparing two cons adj elements for each passes
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];               //swaping
            arr[j+1]=temp;   
            issorted=0;                         
        }
        }
        if(issorted){
            return;
        }
    }
}
int main(){
      // int arr[]={2,4,6,3,1,9,7,5,8};
       int arr[]={1,2,3,4,5,6,7,8,9};
       int n=9;
       printarray(arr,9);
       bubblesort(arr,9);
       printarray(arr,9);
}*/



//bubble sorttt
/*#include<stdio.h>

void printarray(int *arr,int n){
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}

void bubblesort(int *arr,int n){
    int issorted=0;                        //for adaptive
    for(int i=0;i<n-1;i++){                //for number of passes
        printf("working on pass no. %d\n",i+1);
        int issorted=1;
        for(int j=0;j<n-1-i;j++){          //j is inner loop for comparing two cons adj elements for each passes
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];               //swaping
            arr[j+1]=temp;   
            issorted=0;                         
        }
        }
        if(issorted){
            return;
        }
    }
}
int main(){
       int arr[]={2,4,6,3,1,9,7,5,8};
       //int arr[]={1,2,3,4,5,6,7,8,9};
       //int arr[]={34,23,13,38,54,90,76,78,85};
       int n=9;
       printarray(arr,9);
       bubblesort(arr,9);
       printarray(arr,9);
}*/



//insertion sort
/*#include<stdio.h>

void printarray(int *arr,int n){
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}

void insertionsort(int *arr,int n){
    int key,j; 
    //loop for passes
    for(int i=1;i<=n-1;i++){           //i=1 se kyuki 0 position ka s.a hai
       key=arr[i];       // key element from u.a move karwayega
       j=i-1;            //j =index of s.a
        //loop for each passes
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
}

int main(){
    //-1   0  1  2  3  4  5 
    //    12 54  65 7  23 9
     int arr[]={12,54,65,7,23,9};
     int n=6;
     printarray(arr,6);
     printf("the sorted array:\n");
     insertionsort(arr,6);
     printarray(arr,6);
    return 0;
}*/


//selection sort
#include<stdio.h>

void printarray(int *arr,int n){
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
    printf("\n");
}

void selectionsort(int *arr, int n){
    int indexmin;
    printf("the sorted array..\n");
       for(int i=0;i<n-1;i++){
              indexmin=i;
              for(int j=i+1;j<n;j++){
                if(arr[j]<arr[indexmin]){    //comparison btw index 0 and remaining j
                    indexmin=j;
                }
              }
              //swapa[i] and a[indexmin]
              int temp=arr[i];
              arr[i]=arr[indexmin];
              arr[indexmin]=temp;
       }
}

int main(){
    // 0 1 2 3 4 5 
    // 3 5 1 6 2 7
    int arr[]={3,5,1,6,2,7};
    int n=6;
    printarray(arr,6);
    selectionsort(arr,6);
    printarray(arr,6);

    return 0;
}