#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    //Crie um algoritmo que imprima a tabuada do 0 ao 9.

    setlocale(LC_ALL, "portuguese");
    system("color 2");
    printf("_____________While_____________\n\n");
    int i = 0, j;
    while(i<=9){
        j = 0;
        while(j<=10){
            printf("%i x %i = %i\n", i, j, (i*j));
            j++;
        }
    printf("\n");
    i++;
    }
    printf("\n____________Do While____________\n\n");
    i = 0;
    do{
        j = 0;
        do{
            printf("%i x %i = %i\n", i, j, (i*j));
            j++;
        }while(j<=10);
        printf("\n");
        i++;
    }while(i<=9);
    printf("\n_______________For_______________\n\n");
    for(i=0;i<=9;i++){
        for(j=0;j<=10;j++){
            printf("%i x %i = %i\n", i, j, (i*j));
        }
        printf("\n");
    }
    printf("_________________________________\n\n");
    return 0;
}
