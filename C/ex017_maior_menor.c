#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
#include <limits.h>

int main(){
    setlocale(LC_ALL, "portuguese");
    system("color 2");
    int i, num = 0, soma = 0, par = 0, impar = 0, max = INT_MAX, min = INT_MIN;
    printf("__________________________________\n\n");
    for(i=1;i<=5;i++){
        printf("\t%iº valor: ", i);
        scanf("%i", &num);
        if(num%2==0)par++;
        else impar++;
        soma+=num;
        if(i == 1){max = num; min = num;}
        if(num >= max)max = num;
        if(num <= min)min = num;
    }
    printf("\n");
    printf("\tValor máximo: %i\n", max);
    printf("\tValor mínimo: %i\n", min);
    printf("\tValor da média: %.2f\n", (float)soma/5);  //força que o resultado seja do tipo float.
    printf("\tValor da soma: %i\n", soma);
    printf("\tNúmeros pares: %i\n", par);
    printf("\tNúmeros ímpares: %i\n", impar);
    printf("__________________________________\n");
    return 0;
}
