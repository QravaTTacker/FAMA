#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    char resp;
    do{
        int op, x, i, j, soma=1;
        printf("==============================\n");
        printf("|      FOR..........[1]      |\n");
        printf("|      WHILE........[2]      |\n");
        printf("|      DO WHILE.....[3]      |\n");
        printf("==============================\n");
        printf("\n Opção >>> ");
        scanf("%d", &op);
        switch(op){
            case 1:
                printf("\n=============== FOR ===============\n");
                printf("\n Número de linhas: ");
                scanf("%d", &x);
                printf("\n");
                for(i=1;i<=x;i++){
                    for(j=1;j<=i;j++)
                        printf(" %3d ", soma++);
                    printf("\n");
                }
                printf("\n===================================\n");
                break;
            case 2:
                printf("\n=============== WHILE ===============\n");
                printf("\n Número de linhas: ");
                scanf("%d", &x);
                printf("\n");
                i=1;
                while(i<=x){
                    j=1;
                    while(j<=i){
                        printf(" %3d ", soma++);
                        j++;
                    }
                    printf("\n");
                    i++;
                }
                printf("\n=====================================\n");
                break;
            case 3:
                printf("\n=============== DO WHILE ===============\n");
                printf("\n Número de linhas: ");
                scanf("%d", &x);
                printf("\n");
                i=1;
                do{
                    j=1;
                    do{
                        printf(" %3d ", soma++);
                        j++;
                    }while(j<=i);
                    printf("\n");
                    i++;
                }while(i<=x);
                printf("\n========================================\n");
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
