#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>
#include <conio.h>
#include <string.h>

int main(){

    system("color 6");
    setlocale(LC_ALL,"portuguese");

    int i, j, n, op;
    float a11, a21, a12, a22;
    char resp;

    do{
        printf(" ================================\n");
        printf("             Matrizes            \n");
        printf(" ================================\n");
        printf("\n%5s %25s\n\n", "[Nomes]", "[Opções]");
        printf("Matriz Nula...................[1]\n");
        printf("Matriz Identidade.............[2]\n");
        printf("Matriz Triangular Inferior....[3]\n");
        printf("Matriz Triangular Superior....[4]\n");
        printf("Determinante De Ordem 2.......[5]\n");
        printf("\n---------------------------------\n\n\t  Opção >> ");
        scanf("%d", &op);
        printf("\n---------------------------------\n\n");
        switch(op){
            case 1:
                printf(" 1. Matriz Nula\n\n Ordem >> ");
                scanf("%i",&n);
                printf("\n");
                for(i=1;i<=n;i++){
                    printf("  ");
                    for(j=1;j<=n;j++){
                        printf(" 0 ");
                    }
                    printf("\n");
                }
                printf("\n--------------------------------\n\n");
                break;
            case 2:
                printf(" 2. Matriz Identidade\n\n Ordem >> ");
                scanf("%i",&n);
                printf("\n");
                for(i=1;i<=n;i++){
                    printf("  ");
                    for(j=1;j<=n;j++){
                        if(i==j)
                            printf(" 1 ");
                        else
                            printf(" 0 ");
                    }
                    printf("\n");
                }
                printf("\n--------------------------------\n\n");
                break;
            case 3:
                printf(" 3. Matriz Triangular Inferior\n\n Ordem >> ");
                scanf("%i",&n);
                printf("\n");
                for(i=1;i<=n;i++){
                    printf("  ");
                    for(j=1;j<=n;j++){
                        if(i>=j)
                            printf(" %3.f ", (float)i+pow(j,2));
                        else
                            printf(" %3.f ", (0.0));
                    }
                    printf("\n");
                }
                printf("\n Lei de formação: aij = i+(j^2)\n");
                printf("\n--------------------------------\n\n");
                break;
            case 4:
                printf(" 4. Matriz Triangular Superior\n\n Ordem >> ");
                scanf("%i",&n);
                printf("\n");
                for(i=1;i<=n;i++){
                    printf("  ");
                    for(j=1;j<=n;j++){
                        if(j>=i)
                            printf(" %3.f ", (float)pow(i,3)+j);
                        else
                            printf(" %3.f ", (0.0));
                    }
                    printf("\n");
                }
                printf("\n Lei de formação: aij = (i^2)+j\n");
                printf("\n---------------------------------\n\n");
                break;
            case 5:
                printf(" 5. Determinante De Ordem 2\n\n");
                printf(" a[11] -> ");
                scanf("%f", &a11);
                printf(" a[12] -> ");
                scanf("%f", &a12);
                printf(" a[21] -> ");
                scanf("%f", &a21);
                printf(" a[22] -> ");
                scanf("%f", &a22);
                printf("\n  Det(A) = |%4.2f   %4.2f|\n\t   |%4.2f   %4.2f|\n", a11, a21, a12, a22);
                printf("\n  Det(A) = %.2f - %.2f", a11*a22, a21*a12);
                printf("\n  Det(A) = %.2f\n", (a11*a22)-(a21*a12));
                if((a11*a22)-(a21*a12) != 0)
                    printf("\n O sistema possui solução! \1\n");
                else
                    printf("\n O sistema NÃO possui solução :/\n");
                printf("\n--------------------------------\n\n");
                break;
            default:
                printf("\n Valor inválido :/\n");
                printf("\n--------------------------------\n\n");
        }
        printf("Para? [s/n] ");
        scanf("%s", &resp);
        system("cls");
    }while(resp != 's');

    /*for(i=1;i<=2;i++){
        for(j=1;j<=2;j++){
            printf(" %i ", i+j*4);
            if(i==j){
                ds *=i+j*4;
            }
                dp *= i+j*4;
            }else{
        }
        printf("\n");
    }
    printf("\n");
    printf("det = %i - %i\n", dp, ds);
    printf("det = %i\n", dp-ds);*/

    return 0;
}
