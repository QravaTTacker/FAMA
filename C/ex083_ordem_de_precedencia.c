#include <stdio.h>
#include <stdlib.h>

int main(){

    /*
    Como na associatividade dos operadores, a preced�ncia deles tamb�m � definida
    como uma propriedade que determina a ordem prefer�ncial de execu��o de cada operador.

        1� -> Fun��es: sqrt, pow etc
        2� -> Par�nteses: ()
        3� -> Operadores Un�rios:
            a) Operadores de salto: x--, x++
            b) Operador l�gico de nega��o: !
        4� -> Operadores de Multiplica��o, Divis�o e M�dulo: *, /, %
        3� -> Operadores de Adi��o e Subtra��o: +, -
        4� -> Operadores Relacionais: >=, <=, >, <
        5� -> Operadores Comparativos: ==, !=
        6� -> Operador Tern�rio: ?:
    */

    int a = 2, b = 3, c = 10, x = 0;

    x = a + b * c;
    printf("\n  %d + %d * %d = %d\n", a, b, c, x);
    x = (a + b) * c;
    printf(" (%d + %d) * %d = %d\n", a, b, c, x);

    return 0;
}
