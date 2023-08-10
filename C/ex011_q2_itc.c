#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

int main(){

    setlocale(LC_ALL, "PORTUGUESE");
    system("color 2");

    int valor = 0, contador = 0;

    printf("_______________________________\n\n");
    printf("Informe um valor inteiro: ");
    scanf("%d", &valor);
    printf("_______________________________\n\n");
    contador = valor;
    if (valor > 0){
        while (contador > 0){
            if (valor % contador == 0){
                printf("\t%d é divisor de %d\n", contador, valor);
            }
            contador--;
        }
    }else{
        printf("\nFalso\n");
    }
    return 0;
}
