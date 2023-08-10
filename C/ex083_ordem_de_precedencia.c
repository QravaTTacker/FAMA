#include <stdio.h>
#include <stdlib.h>

int main(){

    /*
    Como na associatividade dos operadores, a precedência deles também é definida
    como uma propriedade que determina a ordem preferêncial de execução de cada operador.

        1º -> Funções: sqrt, pow etc
        2º -> Parênteses: ()
        3º -> Operadores Unários:
            a) Operadores de salto: x--, x++
            b) Operador lógico de negação: !
        4º -> Operadores de Multiplicação, Divisão e Módulo: *, /, %
        3º -> Operadores de Adição e Subtração: +, -
        4º -> Operadores Relacionais: >=, <=, >, <
        5º -> Operadores Comparativos: ==, !=
        6º -> Operador Ternário: ?:
    */

    int a = 2, b = 3, c = 10, x = 0;

    x = a + b * c;
    printf("\n  %d + %d * %d = %d\n", a, b, c, x);
    x = (a + b) * c;
    printf(" (%d + %d) * %d = %d\n", a, b, c, x);

    return 0;
}
