#include<stdio.h> 

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
}