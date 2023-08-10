#include <stdio.h>

void Recursiva();
int fatorial();

int main(void){
    int num = 0;
    printf(" Valor limite: ");
    scanf("%d", &num);
    printf("\n");
    if(num >= 0){
        Recursiva(num);
        printf("%d \n", fatorial(num));
    }else
        printf(" N! para N < 0 = { }\n");
    return 0;
}

void Recursiva(int x){
    if(x == 0){
        printf(" %d! = ", x);
    }else{
        printf(" %d x", x);
        Recursiva(x - 1);
    }
}

int fatorial(int n){
    if(n==0 || n==1){ //caso base
        return 1;		//resultado do caso base
    }else{
        return n*fatorial(n-1); //caso geral
    }
}
