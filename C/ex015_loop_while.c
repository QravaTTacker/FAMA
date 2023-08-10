#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "portuguese");

    int n = 0, p = 0;

    printf("Digite uma condição de parada: ");
    scanf("%i", &p);
    printf("\n");

    while(n <= p){
        printf(" %i ", n);
        n++;
    }
    printf("\n");

    return 0;
}
