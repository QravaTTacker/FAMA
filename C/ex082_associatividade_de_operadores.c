#include <stdio.h>
#include <stdlib.h>
int main(){

    /*

    1. Associatividade de operadores � definida como a propriedade que determina
    a ordem de execu��o de dois ou mais operadores que possuem a mesma ordem
    de preced�ncia.

    1.1. Associa��o da esquerda para a direita:

    Preced�ncia Dos Operadores:

        1� -> ()            (Par�nteses)
        2� -> *, /, %       (Multiplica��o, divis�o e m�dulo)
        3� -> +, -          (Adi��o e subtra��o)
        4� -> >=, <=, >, <  (Operadores relacionais)
        5� -> ==, !=        (Operadores de compara��o, positiva ou negativa)

    Exp:

        x = 4 + 6 - 7 + 1

    Os operadores de adi��o e subtra��o t�m a mesma ordem de precend�ncia. Logo, o que
    determina a realiza da conta, � a associatividade de operadores que inicia-se no
    lado esquesdo para o direito:

        1� -> 4 + 6 = 10
        2� -> 10 - 7 = 3
        3� -> 3 + 1 = 4

        x = 4

    De outro modo, podemos fazer a associa��o dessas contas para saber qual ser� realizada
    por primeiro:

        x = (((4 + 6) - 7) + 1)
        x = ((10 - 7) + 1)
        x = (3 + 1)
        x = 4

    1.2. Associa��o da direita para a esquerda:

    Preced�ncia Dos Operadores:

        1� -> ++, --                  (operadores de salto: incremento e decremento)
        2� -> =, +=, -=, *=, /=, %=   (operadores de atribui��o e atribui��o aritm�tica)

    Exp:

        x = y = k = 5

    Primeiramente, o a constante k recebe o valor 5, em seguido a constante y recebe o valor
    de k, e por �ltimo, a constante x recebe o valor de y.

        1� -> k = 5
        2� -> y = k
        3� -> x = y

    De modo geral, teremos que:

        x = (y = (k = 5))

    */

    int x, y, k;
    x = (y = (k = 2));
    printf("%d\n%d\n%d\n\n", k, y, x);

    x = (y = (k = 0) + 1) - 1;
    printf("%d\n%d\n%d\n", k, y, x);

    return 0;
}
