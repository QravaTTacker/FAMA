#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    int op = 10;

    printf("-------------- Valor l�gico de && (and) --------------\n\n");

    printf("\t(V) e (V) - Valor l�gico: %i\n", (op == 10)&&(op > 0));
    printf("\t(F) e (V) - Valor l�gico: %i\n", (op != 10)&&(op > 0));
    printf("\t(F) e (F) - Valor l�gico: %i\n", (op != 10)&&(op > 11));
    printf("\t(V) e (F) - Valor l�gico: %i\n", (op == 10)&&(op > 11));

    printf("\n--------------- Valor l�gico de || (or) ---------------\n\n");

    printf("\t(V) ou (V) - Valor l�gico: %i\n", (op == 10)||(op > 0));
    printf("\t(F) ou (V) - Valor l�gico: %i\n", (op != 10)||(op > 0));
    printf("\t(F) ou (F) - Valor l�gico: %i\n", (op != 10)||(op > 11));
    printf("\t(V) ou (F) - Valor l�gico: %i\n", (op == 10)||(op > 11));


    printf("\n----------- Valor l�gico de !(&&) (not and) -----------\n\n");

    printf("\t!(V e V) - Valor l�gico: %i\n", !((op == 10)&&(op > 0)));
    printf("\t!(F e V) - Valor l�gico: %i\n", !((op != 10)&&(op > 0)));
    printf("\t!(F e F) - Valor l�gico: %i\n", !((op != 10)&&(op > 11)));
    printf("\t!(V e F) - Valor l�gico: %i\n", !((op == 10)&&(op > 11)));

    printf("\n----------- Valor l�gico de !(||) (not or) -----------\n\n");

    printf("\t!(V ou V) - Valor l�gico: %i\n", !((op == 10)||(op > 0)));
    printf("\t!(F ou V) - Valor l�gico: %i\n", !((op != 10)||(op > 0)));
    printf("\t!(F ou F) - Valor l�gico: %i\n", !((op != 10)||(op > 11)));
    printf("\t!(V ou F) - Valor l�gico: %i\n", !((op == 10)||(op > 11)));

    printf("\n--------------------------------------------------------\n");
    return 0;
}
