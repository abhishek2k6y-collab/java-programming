#include<stdio.h>

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
}