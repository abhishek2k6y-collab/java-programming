
#include<stdio.h>

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
}