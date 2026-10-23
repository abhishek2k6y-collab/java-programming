#include<stdio.h> 

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
}