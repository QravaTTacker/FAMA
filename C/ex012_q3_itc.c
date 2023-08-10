#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include "conio.h"

int main(){

    setlocale(LC_ALL, "PORTUGUESE");
    system("color 2");

    int Ni = 1000, resto = 0;

    printf("________________________________________________\n\n");
    printf("Valores que quando divido por 11 tem resto 5:\n\n");

    while (Ni <= 1999){

        resto = Ni % 11;
        if (resto == 5){
            printf("%i ", Ni);
        }
        Ni++;
    }
     printf("\n________________________________________________\n");

    return 0;
}
