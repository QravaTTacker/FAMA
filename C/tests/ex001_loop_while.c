#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main(){

    int produto = 3;

    printf("--------------------\n");

    while (produto <= 100){
        printf("\t%i\n", produto);
        produto = produto * 3;
    }

    printf("\t%i\n", produto);

    printf("--------------------\n");

    return 0;
}
