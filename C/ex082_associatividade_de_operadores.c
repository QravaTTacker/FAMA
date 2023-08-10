#include <stdio.h>
#include <stdlib.h>
int main(){

    /*

    1. Associatividade de operadores é definida como a propriedade que determina
    a ordem de execução de dois ou mais operadores que possuem a mesma ordem
    de precedência.

    1.1. Associação da esquerda para a direita:

    Precedência Dos Operadores:

        1º -> ()            (Parênteses)
        2º -> *, /, %       (Multiplicação, divisão e módulo)
        3º -> +, -          (Adição e subtração)
        4º -> >=, <=, >, <  (Operadores relacionais)
        5º -> ==, !=        (Operadores de comparação, positiva ou negativa)

    Exp:

        x = 4 + 6 - 7 + 1

    Os operadores de adição e subtração têm a mesma ordem de precendência. Logo, o que
    determina a realiza da conta, é a associatividade de operadores que inicia-se no
    lado esquesdo para o direito:

        1º -> 4 + 6 = 10
        2º -> 10 - 7 = 3
        3º -> 3 + 1 = 4

        x = 4

    De outro modo, podemos fazer a associação dessas contas para saber qual será realizada
    por primeiro:

        x = (((4 + 6) - 7) + 1)
        x = ((10 - 7) + 1)
        x = (3 + 1)
        x = 4

    1.2. Associação da direita para a esquerda:

    Precedência Dos Operadores:

        1º -> ++, --                  (operadores de salto: incremento e decremento)
        2º -> =, +=, -=, *=, /=, %=   (operadores de atribuição e atribuição aritmética)

    Exp:

        x = y = k = 5

    Primeiramente, o a constante k recebe o valor 5, em seguido a constante y recebe o valor
    de k, e por último, a constante x recebe o valor de y.

        1º -> k = 5
        2º -> y = k
        3º -> x = y

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
