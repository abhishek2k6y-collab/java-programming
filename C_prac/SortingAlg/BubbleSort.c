//bubble sorttt
#include<stdio.h>

void printarray(int *arr,int n){
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}

void bubblesort(int *arr,int n){
    int issorted=0;                        //array sorted nahi hai
    for(int i=0;i<n-1;i++){                //for number of passes
        printf("working on pass no. %d\n",i+1);
        int issorted=1;                    //agar array sorted hai 1st pass mai hinto yeh loop mai jayega other wise return issorted=1 hojayega
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
       int n=9;
       printarray(arr,9);
       bubblesort(arr,9);
       printarray(arr,9);
       return 0;
}