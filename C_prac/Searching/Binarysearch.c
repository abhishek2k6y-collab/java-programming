#include<stdio.h>

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

    int b=binarysearch(arr,size,200);
    printf("element %d found at index%d",element,b);

 return 0;
}

