#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "portuguese");

    //Controle de fluxo

    /*

    while
    enquanto (condi��o) fa�a{
        bloco de instru��o
    }fimenquanto

    */

    int x = 0;
    int valor_max = 0;

    printf("Informe um valor m�ximo: ");
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
