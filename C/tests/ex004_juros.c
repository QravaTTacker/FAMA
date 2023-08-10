#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "portuguese");
    char resp;

    do{

        double capital = 0, lucro = 0;
        int meses = 0;

        printf("\n\t       Poupança\n\n");
        printf("Capital: ");
        scanf("%lf", &capital);
        printf("Meses de aplicação: ");
        scanf("%d", &meses);
        printf("\n");
        for(int j=1;j<=meses;j++){
            lucro += (capital*0.10/12);
            printf("%.2lf\n", lucro);
            for(int h=1;h<=j;h++)
                printf("   ");
            sleep(1);
        }
        printf("\nCapital investido: R$%.2lf\nLucro total: R$%.2lf\nMontante: R$%.2lf\nMeses de aplicação: %i meses\n", capital, lucro, (capital+lucro), meses);

        printf("\n\n-------------------------------\n");
        printf("\nPara? [s/n] ");
        scanf("%s", &resp);
        system("cls");

    }while(resp != 's');

    return 0;
}
