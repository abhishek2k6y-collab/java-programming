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