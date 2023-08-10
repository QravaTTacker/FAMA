#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    char resp;
    do{
        double numero = 0.0;
        printf("===============================\n");
        printf(" Informe um valor: ");
        scanf("%lf", &numero);
        printf("\n-------------------------------\n");
        if(numero>0)
            printf(" >>> %.2lf é positivo", numero);
        else if(numero<0)
            printf(" >>> %.2lf é negativo", numero);
        else
            printf(" >>> %.lf é nulo", numero);
        printf("\n-------------------------------\n\n");
        printf("===============================\n");
        printf("\nPara? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp!='s');
    return 0;
}
