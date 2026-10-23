#include<stdio.h>

int main(){

   char n;
    printf("enter char:");
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