#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    char resp;
    do{
        int num_min;
        double salario;
        printf("======================================\n\n");
        printf(" Informe o seu sal�rio: ");
        scanf("%lf", &salario);
        num_min = salario/1212;
        salario -= num_min*1212;
        printf("-------------------------------\n");
        printf("\n Quantidade de sal�rio(s) m�nimo(s): %i\n", num_min);
        if(salario>1 && num_min>0)
            printf("\n\t +%.2lf reais\n", salario);
        else if(salario>=1 && num_min>0)
            printf("\n\t    +%.2lf real\n", salario);
        else if(salario>= 1 && num_min==0)
            printf("\n\tNenhum sal�rio m�nimo :/\n");
        else if(salario <= 0 && num_min==0)
            printf("\n\t Voc� trabalha?\n");
        printf("\n======================================\n");
        printf("\nPara? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp!='s');
    return 0;
}
