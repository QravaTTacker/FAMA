#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "portuguese");
    system("color 2");
    char resp;
    do{
        double capital=0.0, taxa=0.0, Csup=0.0, lucro=0.0;
        int meses=0, op=0;
        printf("===================================\n");
        printf("|    Juros Simples.........[1]    |\n");
        printf("|    Juros Composto........[2]    |\n");
        printf("===================================\n");
        printf("\n Opção:       >>> ");
        scanf("%d", &op);
        if(op==1){
            printf("\n========== Juros Simples ==========\n");
            printf("\n Capital de entrada (R$): ");
            scanf("%lf", &capital);
            printf(" Tempo de operação (meses): ");
            scanf("%d", &meses);
            printf(" Taxa (%% a.m.): ");
            scanf("%lf", &taxa);
            for(int k=1;k<=meses;k++)
                lucro += capital*taxa/100;
            printf("\n-----------------------------------");
            printf("\n Capital de entrada: R$ %.2lf", capital);
            printf("\n Intervalo: Operação em %d mese(s)", meses);
            printf("\n Taxa: %.2lf%% ao mês", taxa);
            printf("\n Rendimento: R$ %.2lf", lucro);
            printf("\n Montante: R$ %.2lf", capital+lucro);
            printf("\n-----------------------------------\n");
        }else if(op==2){
            printf("\n========== Juros Composto ==========\n");
            printf("\n Capital de entrada (R$): ");
            scanf("%lf", &capital);
            printf(" Tempo de operação (meses): ");
            scanf("%d", &meses);
            printf(" Taxa (%% a.m.): ");
            scanf("%lf", &taxa);
            Csup = capital;
            for(int k=1;k<=meses;k++)
                capital += capital*taxa/100;
            printf("\n-----------------------------------");
            printf("\n Capital de entrada: R$ %.2lf", Csup);
            printf("\n Intervalo: Operação em %d mese(s)", meses);
            printf("\n Taxa: %.2lf%% ao mês", taxa);
            printf("\n Rendimento: R$ %.2lf", capital-Csup);
            printf("\n Montante: R$ %.2lf", capital);
            printf("\n-----------------------------------\n");
        }else{
            printf("\n-----------------------------------\n");
            printf("\n          Valor inválido!          \n");
            printf("\n-----------------------------------\n");
        }
        printf("\n===================================\n");
        printf("Para? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp!='s');
    return 0;
}
