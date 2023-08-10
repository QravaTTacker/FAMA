#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    char r;
    do{
        int ano;
        printf("================================\n");
        printf(" Informe um ano: ");
        scanf("%d", &ano);
        printf("\n ------------------------------\n");
        if((ano%4==0) && (ano%100!=0))
            printf("\t  É bissexto \1\n");
        else if((ano%4==0) && (ano%100==0) && (ano%400==0))
            printf("\t  É bissexto \1\n");
        else
            printf("\tNão é bissexto :/\n");
        printf(" ------------------------------\n");
        printf("\n================================\n");
        printf("\nPara? [s/n] ");
        scanf("%s", &r);
        system("cls");
    }while(r!='s');
    return 0;
}
