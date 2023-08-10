#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "portuguese");
    system("color 2");
    int resp, i = 0;
    do{
        int meses = 0, j = 0;
        double capital = 0.0, lucro = 0.0;
        printf("_______________________________________\n\n");
        printf("  Digite \"1\" para: Poupança\n  Digite \"2\" para: Poupança Plus\n  Digite \"3\" para: Fundos de Renda\n  Digite \"4\" para: Sair/Parar");
        printf("\n_______________________________________\n");
        printf("\n\t    O que deseja? ");
        scanf("%d", &resp);
        printf("\n---------------------------------------\n");
        if(resp == 1){      //Poupança (+10% cada 12 meses)
            printf("\n\t       Poupança\n\n");
            printf("Capital: ");
            scanf("%lf", &capital);
            printf("Meses de aplicação: ");
            scanf("%d", &meses);
            printf("\n");
            for(j=1;j<=meses;j++){
                lucro += (capital*0.10/12);
                printf("%.2lf\n", lucro);
                for(int h=1;h<=j;h++){
                    printf("   ");
                }
                sleep(1);
            }
            printf("\nCapital investido: R$%.2lf\nLucro total: R$%.2lf\nMontante: R$%.2lf\nMeses de aplicação: %i meses\n", capital, lucro, (capital+lucro), meses);
        }else if(resp == 2){        //Poupança Plus (+3.8% cada 3 meses)
            printf("\n\t     Poupança Plus\n\n");
            printf("Capital: ");
            scanf("%lf", &capital);
            printf("Meses: ");
            scanf("%d", &meses);
            printf("\n");
            for(j=1;j<=meses;j++){
                lucro += (capital*0.038/3);
                printf("%.2lf\n",lucro);
                for(int h=1;h<=j;h++){
                    printf("   ");
                }
                sleep(1);
            }
            printf("\nCapital investido: R$%.2lf\nLucro total: R$%.2lf\nMontante: R$%.2lf\nMeses de aplicação: %i meses\n", capital, lucro, (capital+lucro), meses);
        }else if(resp == 3){        //Fundos de Renda (6.5% cada 6 meses)
            printf("\n\t\t Fundo\n\n");
            printf("Capital: ");
            scanf("%lf", &capital);
            printf("Meses: ");
            scanf("%d", &meses);
            printf("\n");
            for(j=1;j<=meses;j++){
                lucro += (capital*0.065/6);
                printf("%.2lf\n",lucro);
                for(int h=1;h<=j;h++){
                    printf("   ");
                }
                sleep(1);
            }
            printf("\nCapital investido: R$%.2lf\nLucro total: R$%.2lf\nMontante: R$%.2lf\nMeses de aplicação: %i meses\n", capital, lucro, (capital+lucro), meses);
        }else if(resp == 4){        //Sair
            if(i == 0){
                printf("\n\t\tSaindo...\n");
            }else{
                printf("\n\t       Parando...\n");
            }
        }else{
            printf("\n\t    Valor inválido\n");
        }
        i++;
    }while(resp != 4);
    printf("\n_______________________________________\n");
    return 0;
}
