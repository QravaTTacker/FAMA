#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    int op = 10;

    printf("-------------- Valor lógico de && (and) --------------\n\n");

    printf("\t(V) e (V) - Valor lógico: %i\n", (op == 10)&&(op > 0));
    printf("\t(F) e (V) - Valor lógico: %i\n", (op != 10)&&(op > 0));
    printf("\t(F) e (F) - Valor lógico: %i\n", (op != 10)&&(op > 11));
    printf("\t(V) e (F) - Valor lógico: %i\n", (op == 10)&&(op > 11));

    printf("\n--------------- Valor lógico de || (or) ---------------\n\n");

    printf("\t(V) ou (V) - Valor lógico: %i\n", (op == 10)||(op > 0));
    printf("\t(F) ou (V) - Valor lógico: %i\n", (op != 10)||(op > 0));
    printf("\t(F) ou (F) - Valor lógico: %i\n", (op != 10)||(op > 11));
    printf("\t(V) ou (F) - Valor lógico: %i\n", (op == 10)||(op > 11));


    printf("\n----------- Valor lógico de !(&&) (not and) -----------\n\n");

    printf("\t!(V e V) - Valor lógico: %i\n", !((op == 10)&&(op > 0)));
    printf("\t!(F e V) - Valor lógico: %i\n", !((op != 10)&&(op > 0)));
    printf("\t!(F e F) - Valor lógico: %i\n", !((op != 10)&&(op > 11)));
    printf("\t!(V e F) - Valor lógico: %i\n", !((op == 10)&&(op > 11)));

    printf("\n----------- Valor lógico de !(||) (not or) -----------\n\n");

    printf("\t!(V ou V) - Valor lógico: %i\n", !((op == 10)||(op > 0)));
    printf("\t!(F ou V) - Valor lógico: %i\n", !((op != 10)||(op > 0)));
    printf("\t!(F ou F) - Valor lógico: %i\n", !((op != 10)||(op > 11)));
    printf("\t!(V ou F) - Valor lógico: %i\n", !((op == 10)||(op > 11)));

    printf("\n--------------------------------------------------------\n");
    return 0;
}
