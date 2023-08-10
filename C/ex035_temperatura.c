#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    char resp;
    do{
        int op;
        double T=0;
        printf("================================\n");
        printf(" Celsius -> Fahrenheit .....[1]\n");
        printf(" Celsius -> Kelvin .........[2]\n");
        printf(" Fahrenheit -> Celsius .....[3]\n");
        printf(" Fahrenheit -> Kelvin ......[4]\n");
        printf(" Kelvin -> Celsius .........[5]\n");
        printf(" Kelvin -> Fahrenheit ......[6]\n");
        printf("================================\n");
        printf("\n Opção\t     >>> ");
        scanf("%d", &op);
        printf("\n--------------------------------");
        switch(op){
            case 1:
                printf("\n|  De Celsius Para Fahrenheit  |\n");
                printf("--------------------------------\n");
                printf("\n Temperatura em C°: ");
                scanf("%lf", &T);
                printf("\n\t F = %g F°\n", (9*T/5)+32);
                break;
            case 2:
                printf("\n|    De Celsius Para Kelvin    |\n");
                printf("--------------------------------\n");
                printf("\n Temperatura em C°: ");
                scanf("%lf", &T);
                printf("\n\t K = %g K\n", T+273.15);
                break;
            case 3:
                printf("\n|  De Fahrenheit Para Celsius  |\n");
                printf("--------------------------------\n");
                printf("\n Temperatura em F°: ");
                scanf("%lf", &T);
                printf("\n\t C = %g C°\n", 5*(T-32)/9);
                break;
            case 4:
                printf("-\n|   De Fahrenheit Para Kelvin   |\n");
                printf("---------------------------------\n");
                printf("\n Temperatura em F°: ");
                scanf("%lf", &T);
                printf("\n\t K = %g K\n", (5*(T-32)/9)+273.15);
                break;
            case 5:
                printf("\n|    De Kelvin Para Celsius    |\n");
                printf("--------------------------------\n");
                printf("\n Temperatura em K: ");
                scanf("%lf", &T);
                printf("\n\t C = %g C°\n", T-273.15);
                break;
            case 6:
                printf("-\n|   De Kelvin Para Fahrenheit   |\n");
                printf("---------------------------------\n");
                printf("\n Temperatura em K: ");
                scanf("%lf", &T);
                printf("\n\t F = %g F°\n", (9*(T-273.15)/5)+32);
                break;
            default:
                printf("\n\n\t Valor inválido\n");
                break;
        }
        printf("\n--------------------------------\n\n");
        printf("Para? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp!='s');
    return 0;
}
