#include<stdio.h>

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
        printf("array not bounded");
        return -1;
    }
    
    for(int i=size-1; i>=index; i--){
       arr[i+1]=arr[i];
    }
    arr[index]=element;
    display(arr,size+1);
    return 1;
}

int main(){
     int n,arr[100];
     printf("enter no. of elements : ");
     scanf("%d",&n); 

     for(int i=0;i<n;i++){
     printf("enter elements [%d] : ",i);
     scanf("%d",&arr[i]);
}

    int size=n;
    int element;  
    display(arr, size);         
    printf("enter element to insert : ");
    scanf("%d",&element); 
    int index;
    printf("enter index : ");
    scanf("%d",&index); 

    indinsertion(arr,size,element,index,100);

    return 0;
}