#include <stdio.h>
#include <stdlib.h>

int main(){

    /*

    printf("%Tipo", valor a ser impresso);
    printf("%Tipo1 %Tipo2", var1, var2);

    */

    int num1 = 2;
    printf("valor 1 = %i\n", num1);

    float num2 = 7.5;
    printf("valor 2 = %.2f\n", num2);

    /*

    Identificadores de saída:
    Quando queremos imprimir um número inteiro, utilizamos de "%i" ou "%d".
    Quando queremos imprimir um número flutuante ou double, usamos "%f".
    Quando queremos imprimir um caractere, vamos utilizar de "%c".
    Obs: Para uma cadeia de texto usa-se "%s".

    Outros exemplos:
    %u - imprime apenas o módulo do número.
    %p - imprime o endereço de memória.
    %e ou %E - imprime números com notação científica.
    %% - imprime o próprio símbolo de porcentagem.

    */

    printf("Segundo caso: %d e %.1f\n", num1, num2);


    return 0;
}
