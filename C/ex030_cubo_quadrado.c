#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>
#include <conio.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    char resp;
    do{
        int op, x;
        printf("==============================\n");
        printf("|      FOR..........[1]      |\n");
        printf("|      WHILE........[2]      |\n");
        printf("|      DO WHILE.....[3]      |\n");
        printf("==============================\n");
        printf("\n Opção >>> ");
        scanf("%d", &op);
        switch(op){
            case 1:
                printf("\n=============== FOR ===============\n\n");
                printf("%7s %14s %11s\n\n", "Número", "Quadrado", "Cubo");
                for(x=0;x<=10;x++){
                    printf("%4d %14d %14d", x, (int)pow(x,2), (int)pow(x,3));
                    printf("\n");
                }
                printf("\n===================================\n");
                break;
            case 2:
                printf("\n============== WHILE ==============\n\n");
                printf("%7s %14s %11s\n\n", "Número", "Quadrado", "Cubo");
                x=0;
                while(x<=10){
                    printf("%4d %14d %14d", x, (int)pow(x,2), (int)pow(x,3));
                    printf("\n");
                    x++;
                }
                printf("\n===================================\n");
                break;
            case 3:
                printf("\n============= DO WHILE =============\n\n");
                printf("%7s %14s %11s\n\n", "Número", "Quadrado", "Cubo");
                x=0;
                do{
                    printf("%4d %14d %14d", x, (int)pow(x,2), (int)pow(x,3));
                    printf("\n");
                    x++;
                }while(x<=10);
                printf("\n====================================\n");
                break;
            default:
                printf("\n     ---------------------\n");
                printf("       Valor inválido :/");
                printf("\n     ---------------------\n");
                break;
        }
        printf("\n\n Para? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp!='s');
    return 0;
}
