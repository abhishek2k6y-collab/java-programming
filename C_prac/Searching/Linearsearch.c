#include<stdio.h>

int linearsearch(int arr[],int size,int element){
   for(int i=0; i<size; i++){
    if(arr[i]==element){
    return i;
   }
}
return -1;
} 


int main(){
    int arr[]={2,5,7,34,57,200,201,345,675,897,5321,38225};
    int size= sizeof(arr)/sizeof(int);
    int element=200;

    int s=linearsearch(arr,size,200);
    printf("element %d found at index%d\n",element,s);
    
 return 0;
}

