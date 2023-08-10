#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include "conio.h"

int main(){

    system("color 2");
    setlocale(LC_ALL, "PORTUGUESE");

    int n = 0, soma = 0, cont = 0;

    printf("_______________________________________________\n\n");
    printf("\n Digite um valor inteiro e positivo: ");
    scanf("%i", &n);
    printf("\n_______________________________________________\n\n");

    if (n >= 0){

        while (n >= 1){

            printf(" %i +", n);
            soma = soma + n;
            n--;
            cont++;

        }

        n = cont;

        printf(" 0");
        printf("\n\n\n Soma de %i até 0: %i\n", n, soma);
        printf("\_______________________________________________\n\n");

    }else{

        printf("\nInforme um valor positivo\n");

    }

    return 0;
}
