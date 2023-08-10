#include <stdio.h>
#include <stdlib.h>

int main(){

    /*
            Tipos Primitivos

        1. Char
        2. Int
        3. Float
        4. Double
        5. Void

        Temos quatro instruções para declarar em nossas variáveis:

        1. signed -> Queremos valores + e -
        2. unsigned -> Queremos apenas valores +
        3. long -> Aumentar a capacidade de armazenamento de nossa variável
        4. short -> Diminui a capacidade de armazenamento de nossa variável

        Usamos esses modificadores no tipo int, mas nada impede de usar em float/double,
        no entanto, pode haver erros.

    */

    printf("------------------------------\n");

    int x = 0;
    short int y = 0;

    printf("I (normal): %i bytes\n", sizeof(x));
    printf("I (short): %i bytes\n", sizeof(y));

    // sizeof: É uma função que indica o tamanho de nossa variável (byts).

    printf("------------------------------\n");

    char c;
    int i;
    float f;
    double d;

    printf("char: %i bytes\n", sizeof(c));
    printf("int: %i bytes\n", sizeof(i));
    printf("float: %i bytes\n", sizeof(f));
    printf("double: %i bytes\n", sizeof(d));

    printf("------------------------------\n");

    return 0;
}
