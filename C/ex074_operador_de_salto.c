#include <stdio.h>
#include <stdlib.h>

int main(){

    /*
        Os operadores de salto mudam o valor de 1 em 1

        a) var++; --> Pós incremento
        b) ++var; --> Pré incremento
        c) var--; --> Pós decremento
        d) --var; --> Pré decremento

        O pós incremento/decremento só altera o valor
        da variável depois da instrução que ela estiver
        contido, enquanto o pré incremento/decremento
        realizado a alteração do valor na instrução.

            (x = x + 1) <==> (x =+ 1) <==> (x++)
    */

    int i = 1;

    printf("i = %i\n", i);
    printf("i++ = %i\n", i++);
    printf("i = %i\n", i);

    int y = 1;

    printf("\ny = %i\n", y);
    printf("++y = %i\n", ++y);
    printf("y = %i\n", y);

    return 0;
}
