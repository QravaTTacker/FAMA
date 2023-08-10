#include <stdio.h>
#include <stdlib.h>

int main(){

    /*
        Os operadores de salto mudam o valor de 1 em 1

        a) var++; --> P�s incremento
        b) ++var; --> Pr� incremento
        c) var--; --> P�s decremento
        d) --var; --> Pr� decremento

        O p�s incremento/decremento s� altera o valor
        da vari�vel depois da instru��o que ela estiver
        contido, enquanto o pr� incremento/decremento
        realizado a altera��o do valor na instru��o.

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
