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

    Identificadores de sa�da:
    Quando queremos imprimir um n�mero inteiro, utilizamos de "%i" ou "%d".
    Quando queremos imprimir um n�mero flutuante ou double, usamos "%f".
    Quando queremos imprimir um caractere, vamos utilizar de "%c".
    Obs: Para uma cadeia de texto usa-se "%s".

    Outros exemplos:
    %u - imprime apenas o m�dulo do n�mero.
    %p - imprime o endere�o de mem�ria.
    %e ou %E - imprime n�meros com nota��o cient�fica.
    %% - imprime o pr�prio s�mbolo de porcentagem.

    */

    printf("Segundo caso: %d e %.1f\n", num1, num2);


    return 0;
}
