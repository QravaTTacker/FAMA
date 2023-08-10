#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>

int main(){

    /*
    Chico tem 1,50 metro e cresce 2 centímetros por ano,
    enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano.
    Construa um algoritmo que calcule e imprima quantos anos
    serão necessários para que Zé seja maior que Chico.
    */

    setlocale(LC_ALL, "portuguese");
    system("color 5");
    printf("_____________While_____________\n\n");
    float chico = 150.0, ze = 110.0;
    int ano = 0;
    while (chico>=ze){
        chico += 2;
        ze += 3;
        ano++;
    }
    printf("\tChico: %.2f //Zé: %.2f\n", chico/100, ze/100);
    printf("\tTotal de anos: %i\n", ano);
    printf("\n____________Do While____________\n\n");
    ano = 0;
    chico = 150.0;
    ze = 110.0;
    do{
        chico += 2;
        ze += 4;
        ano++;
    }while(chico>=ze);
    printf("\tChico: %.2f //Zé: %.2f\n", chico/100, ze/100);
    printf("\tTotal de anos: %i\n", ano);
    printf("\n_______________For_______________\n\n");
    ano = 0;
    ze = 110.0;
    for(chico=150.0;chico>=ze;chico+=1){
        ze += 5;
        ano++;
    }
    printf("\tChico: %.2f //Zé: %.2f\n", chico/100, ze/100);
    printf("\tTotal de anos: %i\n", ano);
    printf("\n_________________________________\n\n");
    return 0;
}
