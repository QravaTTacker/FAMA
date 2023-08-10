#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "portuguese");
    system("color 6");
    char resp;
    do{
        double capital=0.0, taxa=0.0;
        int meses=0, op=0;
        printf("===================================\n");
        printf("|    Juros Simples.........[1]    |\n");
        printf("|    Juros Composto........[2]    |\n");
        printf("===================================\n");
        printf("\n Op��o:       >>> ");
        scanf("%d", &op);
        if(op==1){
            printf("\n========== Juros Simples ==========\n");
            printf("\n Capital de entrada (R$): ");
            scanf("%lf", &capital);
            printf(" Tempo de opera��o (meses): ");
            scanf("%d", &meses);
            printf(" Taxa (%% a.m.): ");
            scanf("%lf", &taxa);
            printf("\n-----------------------------------");
            printf("\n Capital de entrada: R$ %.2lf", capital);
            printf("\n Intervalo: Opera��o em %d mese(s)", meses);
            printf("\n Taxa: %.2lf%% ao m�s", taxa);
            printf("\n Rendimento: R$ %.2lf", capital*meses*taxa/100);
            printf("\n Montante: R$ %.2lf", (capital*meses*taxa/100)+capital);
            printf("\n-----------------------------------\n");
        }else if(op==2){
            printf("\n========== Juros Composto ==========\n");
            printf("\n Capital de entrada (R$): ");
            scanf("%lf", &capital);
            printf(" Tempo de opera��o (meses): ");
            scanf("%d", &meses);
            printf(" Taxa (%% a.m.): ");
            scanf("%lf", &taxa);
            printf("\n-----------------------------------");
            printf("\n Capital de entrada: R$ %.2lf", capital);
            printf("\n Intervalo: Opera��o em %d mese(s)", meses);
            printf("\n Taxa: %.2lf%% ao m�s", taxa);
            printf("\n Rendimento: R$ %.2lf", (capital*pow(1+taxa/100, meses))-capital);
            printf("\n Montante: R$ %.2lf", capital*pow(1+taxa/100, meses));
            printf("\n-----------------------------------\n");
        }else{
            printf("\n-----------------------------------\n");
            printf("\n          Valor inv�lido!          \n");
            printf("\n-----------------------------------\n");
        }
        printf("\n===================================\n");
        printf("Para? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp!='s');
    return 0;
    }
