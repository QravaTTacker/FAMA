#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    //Crie um algoritmo para ler um valor e imprimir a tabuada desse valor

    setlocale(LC_ALL, "portuguese");

    printf("______________While______________\n\n");
    int i = 0, num = 0;
    printf("Informe um número: ");
    scanf("%i", &num);
    printf("\n");
    while(i<=10){
        printf("%i x %i = %i\n", i, num, (i*num));
        i++;
    }
    printf("\n\n_____________Do While_____________\n\n");
    i = 0;
    printf("Informe um número: ");
    scanf("%i", &num);
    printf("\n");
    do{
        printf("%i x %i = %i\n", i, num, (i*num));
        i++;
    }while(i<=10);
    printf("\n\n_______________For_______________\n\n");
    printf("Informe um número: ");
    scanf("%i", &num);
    printf("\n");
    for(i=0;i<=10;i++){
        printf("%i x %i = %i\n", i, num, (i*num));
    }
    printf("\n_________________________________\n\n");
    return 0;
}
