#include<stdio.h>

int calfib(int n);

int main(){
   int n;
   printf("enter a no.");
   scanf("%d",&n);
   
   printf("%d",calfib(n));

   return 0;
}

int calfib(int n){
if(n==0){
    return 0;
} 
else if(n==1) {
    return 1;
} else{
    int calfibnm1=calfib(n-1);
    int calfibnm2=calfib(n-2);
    int calfibn= calfibnm1+calfibnm2;
return calfibn;
}

}