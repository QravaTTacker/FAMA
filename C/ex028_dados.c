#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    char resp;
    do{
        int op, a, b, cont=0;
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
                for(a=1;a<=6;a++){
                    for(b=1;b<=6;b++)
                        if(a+b==7){
                            printf("\n------------");
                            printf("\n Dado 1: %d\n Dado 2: %d", a, b);
                            printf("\n------------");
                            cont++;
                        }
                    printf("\n");
                }
                printf("\n Nº de possibilidades: %d\n", cont);
                printf("=====================================\n");
                break;
            case 2:
                printf("\n=============== WHILE ===============\n");
                a=1;
                while(a<=6){
                    b=1;
                    while(b<=6){
                        if(a+b==7){
                            printf("\n------------");
                            printf("\n Dado 1: %d\n Dado 2: %d", a, b);
                            printf("\n------------");
                            cont++;
                        }
                        b++;
                    }
                    printf("\n");
                    a++;
                }
                printf("\n Nº de possibilidades: %d\n", cont);
                printf("=====================================\n");
                break;
            case 3:
                printf("\n=============== DO WHILE ===============\n");
                a=1;
                do{
                    b=1;
                    do{
                        if(a+b==7){
                            printf("\n------------");
                            printf("\n Dado 1: %d\n Dado 2: %d", a, b);
                            printf("\n------------");
                            cont++;
                        }
                        b++;
                    }while(b<=6);
                    printf("\n");
                    a++;
                }while(a<=6);
                printf("\n Nº de possibilidades: %d\n", cont);
                printf("=====================================\n");
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
