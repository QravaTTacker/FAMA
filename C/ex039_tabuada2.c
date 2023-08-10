#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    char resp;
    do{
        int inicio = 0, chegada = 0;
        double numero = 0.0;
        printf("============= TABUADA =============\n");
        printf("\n Informe um valor: ");
        scanf("%lf", &numero);
        printf("\n-------------------------------\n");
        printf(" Valor de partida: ");
        scanf("%d", &inicio);
        printf(" Valor de chegada: ");
        scanf("%d", &chegada);
        printf("\n");
        if(inicio<chegada)
            for(int i=inicio;i<=chegada;i++)
                printf(" %d * %.2lf = %.2lf\n", i, numero, numero*i);
        else if(inicio>chegada)
            for(int i=inicio;i>=chegada;i--)
                printf(" %d * %.2lf = %.2lf\n", i, numero, numero*i);
        else
            printf(" %d * %.2lf = %.2lf\n", inicio, numero, numero*inicio);
        printf("\n-------------------------------\n\n");
        printf("===============================\n");
        printf("\nPara? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp!='s');
    return 0;
}
