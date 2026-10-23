//insertion sort
#include<stdio.h>

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
    //-1   0 |  1  2  3  4  5 
    //    12 | 54  65 7  23 9
     int arr[]={12,54,65,7,23,9};
     int n=6;
     printarray(arr,6);
     printf("the sorted array:\n");
     insertionsort(arr,6);
     printarray(arr,6);
    return 0;
}