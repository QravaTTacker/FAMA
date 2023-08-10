#include <stdio.h>
#include <stdlib.h>

int main(){

    /*

        for(parte 1; parte 2; parte 3){
            bloco de instruções
        }

    Parte 1 --> Declaração e inicialização da variável
    Parte 2 --> Condição de parada
    Parte 3 --> Operador de salto

    */

    for(int i=1;i<=10;i++)printf("%i ", i);

    printf("\n\n");

    int y;
    for(y=10;y>=1;y--){
        printf("%i ", y);
    }
    printf("\n");

    return 0;
}
