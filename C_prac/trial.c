// #include<stdio.h>

// int main(){
//     for( int i=1; i<=; i++){
//         for( int j=1; j<=6; j++){
//             printf("%d",j);
//         }
//         printf("\n");
//     }
//     return 0;
// }

 
// #include<stdio.h>

// int main(){
//     int a,b,c;
//     float avg;
//     printf("enter a");
//     scanf("%d",&a);
//     printf("enter b");
//     scanf("%d",&b);
//     printf("enter c");
//     scanf("%d",&c);
     
//     printf("avg is %f",(a+b+c)/3.0);
// return 0;
// }

/*
#include<stdio.h>

int main(){

   char n;
    printf("enter char");
    scanf("%c",&n);
    if (n>='A' && n<='Z'){
    printf("its a char");
    }
    else if (n>='a' && n<='z'){
       printf("its a char");
    }
    else{
        printf("its not char");
    }
    return 0;
}
    */



/*#include<stdio.h>

int main(){
    int i;
    for(i=1;i<=5;i++){
        for(int j=0;j<=5;j++){
            if(i>j)
            printf("%c",'*');
        }
        printf("\n");
    }
   
    return 0;
}*/



/*#include<stdio.h> 

int main(){
int a=10;
if(a=11){
    printf("im 11");
}else{
    printf("im not 11");
}

    return 0;
}*/



/*#include<stdio.h> 

int main(){
int n,tax;
printf("enter an amount");
scanf("%d",&n);
if(n<250000){
    tax=0;
    printf("%d",tax);
    printf("there is no tax");
}
else if(n>250000 && n<500000){
    tax=n*0.05;
    printf("%d",tax);

}
else if(n>500000 && n<1000000){
    tax=n*0.20;
    printf("%d",tax);
} else {
    tax=n*0.30;
    printf("%d",tax);
}
    
    return 0;
}*/


/*#include<stdio.h> 

int main(){
int n;
printf("enter a no.");
    scanf("%d",&n);
for(int i=1;i<=10;i++){
    printf("%d\n",n*i);
}

    return 0;
}*/


/*#include<stdio.h> 

int main(){
int n;
int sum=0;
printf("enter a no.");
    scanf("%d",&n);
for(int i=1;i<=10;i++){
    printf("%d\n",n*i);
    sum+=n*i;
}
printf("%d",sum);

    return 0;
}*/



/*#include<stdio.h> 

int main(){
int i=1;
int sum=0;
while(i<=10){
  sum+=i;
  i++;
}
printf("%d",sum);

    return 0;
}*/


/*#include<stdio.h> 

int main(){
int n;
int fact=1;
printf("enter a no.");
 scanf("%d",&n);
for(int i=1;i<=n;i++){
    fact*=i;
}
printf("%d",fact);

    return 0;
}*/
 



/* #include <stdio.h>

int main() {
    int n, count = 0;

    printf("Enter a number: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            count++; 
        }
    }

    if (count == 2)
        printf("Prime number");
    else
        printf("Not a prime number");

    return 0;
}*/



/*#include<stdio.h>

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

}*/



/*#include<stdio.h>

int main(){
    int i;
    for(i=1;i<=5;i++){
        for(int j=0;j<5;j++){
            if(i>j){
                if(i%2!=0){
            printf("%c",'*');
            }
            }
        }
        printf("\n");
    }
   
    return 0;
}*/



#include<stdio.h>

int calavg(int arr[], int n);

int main(){
  int n;
  float avg;
  printf("enter no. of elements in an array");
  scanf("%d",&n);

  int arr[15];
  for(int i=0;i<n;i++){
    printf("enter elements");
    scanf("%d",&arr[i]);
  }
avg= calavg(arr,n);
printf("%f",avg);

return 0;
}

int calavg(int arr[], int n){
 float sum=0;
 for(int i=0;i<n;i++){
    sum+=arr[i];
 }
 printf("%f",sum);

 float avg=(sum/n);
 return avg;
}


