#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "portuguese");

    //Controle de fluxo

    /*

    while
    enquanto (condição) faça{
        bloco de instrução
    }fimenquanto

    */

    int x = 0;
    int valor_max = 0;

    printf("Informe um valor máximo: ");
    scanf("%i", &valor_max);

    while (x <= valor_max){

        printf("%i ", x);
        x = x + 1;

    //x = x + 1 ou x += 1

    }

    printf("\n-------------\n");
    printf("%i\n", x);

    return 0;
}
