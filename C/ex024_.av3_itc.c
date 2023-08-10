#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
int main(){
    setlocale(LC_ALL, "portuguese");
    system("color 2");
    int resp = 0, i = 0;
    float meses = 0.0, salario = 0.0;
    do{
        printf("_______________________________________\n\n");
        printf("  Digite \"1\" para: Aumento de Salário\n  Digite \"2\" para: Férias\n  Digite \"3\" para: Décimo Terceiro\n  Digite \"4\" para: Sair/Parar");
        printf("\n_______________________________________\n");
        printf("\n\t    O que deseja? ");
        scanf("%d", &resp);
        printf("\n---------------------------------------\n");

        if(resp == 1){                                                //opção 1
            printf("\nInforme o seu salário: ");
            scanf("%f", &salario);

            if(salario >= 1 && salario < 1500){
                salario += salario*0.15;
                printf("\n\t+15%%\n\n");
                printf("Salário total: R$%.2f\n", salario);

            }else if(salario >= 1500 && salario <= 3000){
                salario += salario*0.10;
                printf("\n\t+10%%\n\n");
                printf("Salário total: R$%.2f\n", salario);

            }else if(salario > 3000){
                salario += salario*0.05;
                printf("\n\t+5%%\n\n");
                printf("Salário total: R$%.2f\n", salario);

            }else{
                printf("\n\t    Valor inválido\n");
            }
        }else if (resp == 2){                                           //opção 2
            printf("\nInforme o seu salário: ");
            scanf("%f", &salario);

            if (salario >= 1 && salario <= 1212){
                printf("\nAlíquota do INSS: -7,5%%\n");
                printf("\nCálculo 1/3 Férias: R$%.2f", salario/3);
                salario = (salario /= 3) + (salario*0.33332);
                printf("\nCálculo bruto (+33,33%%): R$%.2f", salario);
                salario -= (salario*0.075);
                printf("\nCálculo líquido: R$%.2f\n", salario);

            }else if (salario > 1212 && salario <= 2427.35){
                printf("\nAlíquota do INSS: -9%%\n");
                printf("\nCálculo 1/3 Férias: R$%.2f", salario/3);
                salario = (salario /= 3) + (salario*0.33332);
                printf("\nCálculo bruto (+33,33%%): R$%.2f", salario);
                salario -= (salario*0.09);
                printf("\nCálculo líquido: R$%.2f\n", salario);

            }else if (salario > 2427.35 && salario <= 3641.03){
                printf("\nAlíquota do INSS: -12%%\n");
                printf("\nCálculo 1/3 Férias: R$%.2f", salario/3);
                salario = (salario /= 3) + (salario*0.33332);
                printf("\nCálculo bruto (+33,33%%): R$%.2f", salario);
                salario -= (salario*0.12);
                printf("\nCálculo líquido: R$%.2f\n", salario);

            }else if (salario > 3641.03 && salario < 7087.23){
                printf("\nAlíquota do INSS: -14%%\n");
                printf("\nCálculo 1/3 Férias: R$%.2f", salario/3);
                salario = (salario /= 3) + (salario*0.33332);
                printf("\nCálculo bruto (+33,33%%): R$%.2f", salario);
                salario -= (salario*0.14);
                printf("\nCálculo de 1/3 de férias: R$%.2f\n", salario);

            }else if (salario >= 7087.23){
                salario = (salario /= 3) + (salario*0.33332);
                printf("\nAlíquota do INSS: 0%%");
                printf("\nCálculo 1/3 Férias: R$%.2f", salario/3);
                printf("\nCálculo 1/3 Férias (+33,33%%): R$%.2f\n", salario);

            }else{
                printf("\n\t    Valor inválido\n");
            }
        }else if (resp == 3){                                           //opção 3
            printf("\nInforme o seu salário: ");
            scanf("%f", &salario);
            if(salario >= 1){
                printf("Nº de meses que você trabalhou: ");
                scanf("%f", &meses);
                if(meses <= 12 && meses >= 0){
                    printf("\nValor do 13º: R$%.2f\n", (salario/12)*meses);
                }else if(meses == 0){
                    printf("\nValor do 13º: R$%0,00\n");
                }else{
                    printf("\n\t    Valor inválido\n");
                }
            }else{
                printf("\n\t    Valor inválido\n");
            }
        }else if (resp > 3 && resp != 4 || resp < 1){                   //Nenhuma opção
            printf("\n\t\tFalso\n");
        }else{                                                          //opção 4
            if(i == 0){
                printf("\n\t\tSaindo...\n");
            }else{
                printf("\n\t\tParando...\n");
            }
        }
        i++;
    }while(resp != 4);
     printf("\n_______________________________________\n");
    return 0;
}
