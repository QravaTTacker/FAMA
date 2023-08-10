#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
#include <string.h>
int main(){
    setlocale(LC_ALL,"portuguese");
    system("color 2");
    float x = 0.0, y = 0.0;
    char op = 's';
    while(op!='n'){
        system("cls");
        printf("====================================\n\n");
        printf("           Calculadora V1           \n\n");
        printf("====================================\n");
        printf("Obs: Separe os valores do operador!\n\n");
        printf(">> ");
        scanf("%f", &x);
        scanf("%s", &op);
        scanf("%f", &y);
        if(op=='+'){
            printf("\n\t----------------\n\t   R = %.2f\n\t----------------\n", x+y);
        }else if(op=='-'){
            printf("\n\t----------------\n\t   R = %.2f\n\t----------------\n", x-y);
        }else if(op=='*'){
            printf("\n\t----------------\n\t   R = %.2f\n\t----------------\n", x*y);
        }else if(op=='/'){
            printf("\n\t----------------\n\t   R = %.2f\n\t----------------\n", x/y);
        }else{
            printf("\n\tOperador inválido :/\n\n");
        }
        printf("====================================\n");
        printf("\nDeseja continuar? [s/n] ");
        scanf("%s", &op);
    }
    return 0;
}
