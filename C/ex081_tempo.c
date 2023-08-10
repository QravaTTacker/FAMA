#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "portuguese");
    system("color 2");
    char resp;
    do{
        int tempo = 0, dia = 0, hora = 0, min = 0, seg = 0;
        printf("================ Convertendo Segundos ================\n");
        printf("\n Tempo (s): ");
        scanf("%d",&tempo);
        dia = tempo/(3600*24);
        hora = (tempo-(dia*3600*24))/3600;
        min = (tempo-(dia*3600*24)-(hora*3600))/60;
        seg = tempo-(dia*3600*24)-(hora*3600)-(min*60);
        printf("\n %d dia(s), %d hora(s), %d minuto(s) e %d segundo(s)\n", dia, hora, min, seg);
        printf("\n======================================================\n");
        printf("Para? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp!='s');
    return 0;
}
