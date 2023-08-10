#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
// #include <conio2.h>
#include <string.h>

int main(){
    setlocale(LC_ALL, "portuguese");
    system("color 2");
    char resp;
    do{
        int caso, i, j, n, k, l, y, x=1;
        printf("==============================================================\n\n");
        printf("Quadrado Preenchido........................................[1]\n");
        printf("Quadrado Vazio.............................................[2]\n");
        printf("Bandeira Preenchida........................................[3]\n");
        printf("Bandeira Vazia.............................................[4]\n");
        printf("Tri�ngulo Ret�ngulo Preenchido.............................[5]\n");
        printf("Tri�ngulo Ret�ngulo Vazio..................................[6]\n");
        printf("Tri�ngulo Ret�ngulo Revertido Preenchido...................[7]\n");
        printf("Tri�ngulo Ret�ngulo Revertido Vazio........................[8]\n");
        printf("Tri�ngulo Ret�ngulo Invertido Preenchido...................[9]\n");
        printf("Tri�ngulo Ret�ngulo Invertido Vazio.......................[10]\n");
        printf("Tri�ngulo Ret�ngulo Revertido e Invertido Preenchido......[11]\n");
        printf("Tri�ngulo Ret�ngulo Revertido e Invertido Vazio...........[12]\n");
        printf("Paralelogramo \"A\" Preenchido..............................[13]\n");
        printf("Paralelogramo \"A\" Vazio...................................[14]\n");
        printf("Paralelogramo \"B\" Preenchido..............................[15]\n");
        printf("Paralelogramo \"B\" Vazio...................................[16]\n");
        printf("Paralelogramo \"A\" Com Diagonais...........................[17]\n");
        printf("Paralelogramo \"B\" Com Diagonais...........................[18]\n");
        printf("Paralelogramo \"A\" Deitado.................................[19]\n");
        printf("Paralelogramo \"B\" Deitado.................................[20]\n");
        printf("Ret�ngulo Preenchido......................................[21]\n");
        printf("Ret�ngulo Vazio...........................................[22]\n");
        printf("Trap�zio \"A\" Preenchido...................................[23]\n");
        printf("Trap�zio \"A\" Vazio........................................[24]\n");
        printf("Trap�zio \"B\" Preenchido...................................[25]\n");
        printf("Cora��o...................................................[26]\n");
        printf("Pir�mide \"A\" Preenchida...................................[27]\n");
        printf("Pir�mide \"A\" Vazia........................................[28]\n");
        printf("Pir�mide \"B\" Vazia........................................[29]\n");
        printf("Pir�mide \"B\" Preenchida ..................................[30]\n");
        printf("\n--------------------------------------------------------------\n");
        printf("Op��o: \n\t\t\t   >>> ");
        scanf("%i", &caso);
        printf("\n==============================================================\n");
        switch(caso){
            case 1:
                printf("\t\t >>> Quadrado Preenchido <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=n;j++)printf(" # ");
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 2:
                printf("\t\t   >>> Quadrado Vazio <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=n;j++){
                            if((i==1)||(j==1)||(j==n)||(i==n))printf(" # ");
                            else printf("   ");
                        }
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 3:
                printf("\t\t >>> Bandeira Preenchida <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=n;j++){
                            if((i==1)||(j==1)||(j==n)||(i==n)||(j==i)||(j+i==n+1))printf(" # ");
                            else printf(" . ");
                        }
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 4:
                printf("\t\t   >>> Bandeira Vazia <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=n;j++){
                            if((i==1)||(j==1)||(j==n)||(i==n)||(j==i)||(j+i==n+1)) printf(" # ");
                            else printf("   ");
                        }
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 5:
                printf("\t    >>> Tri�ngulo Ret�ngulo Preenchido <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=i;j++)printf(" # ");
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 6:
                printf("\t      >>> Tri�ngulo Ret�ngulo Vazio <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=i;j++){
                            if((j==1)||(j==i)||(i==n))printf(" # ");
                            else printf("   ");
                        }
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 7:
                printf("       >>> Tri�ngulo Ret�ngulo Revertido Preenchido <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=i;j<n;j++)printf("   ");
                        for(j=1;j<=i;j++)printf(" # ");
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 8:
                printf("          >>> Tri�ngulo Ret�ngulo Revertido Vazio <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=i;j<n;j++)printf("   ");
                        for(j=1;j<=i;j++){
                            if((j==i)||(j==1)||(i==n))printf(" # ");
                            else printf("   ");
                        }
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 9:
                printf("        >>> Tri�ngulo Ret�ngulo Invertido Preenchido <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=i;j<=n;j++)printf(" # ");
                        //for(j=1;j<=i;j++)printf("   ");
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 10:
                printf("\t  >>> Tri�ngulo Ret�ngulo Invertido Vazio <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=n;j++){
                            if((i==1)||(j==1)||(j+i==n+1))printf(" # ");
                            else printf("   ");
                        }
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 11:
                printf(" >>> Tri�ngulo Ret�ngulo Revertido e Invertido Preenchido <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=n;j++){
                            if(j>=i)printf(" # ");
                            else printf("   ");
                        }
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 12:
                printf("    >>> Tri�ngulo Ret�ngulo Revertido e Invertido Vazio <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=n;j++){
                            if((j==i)||(j==n)||(i==1))printf(" # ");
                            else printf("   ");
                        }
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 13:
                printf("\t     >>> Paralelogramo \"A\" Preenchido <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        for(j=1;j<=i;j++)printf("  ");
                        for(j=1;j<=n;j++)printf("# ");
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 14:
                printf("\t\t>>> Paralelogramo \"A\" Vazio <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        for(j=1;j<=i;j++)printf("  ");
                        for(j=1;j<=n;j++){
                            if((j==1)||(i==1)||(j==n)||(i==n))printf("# ");
                            else printf("  ");
                        }
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 15:
                printf("\t     >>> Paralelogramo \"B\" Preenchido <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        for(j=i;j<=n;j++)printf("  ");
                        for(j=1;j<=n;j++)printf("# ");
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 16:
                printf("\t\t>>> Paralelogramo \"B\" Vazio <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        for(j=i;j<=n;j++)printf("  ");
                        for(j=1;j<=n;j++){
                            if((j==1)||(i==1)||(j==n)||(i==n))printf("# ");
                            else printf("  ");
                        }
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 17:
                printf("\t   >>> Paralelogramo \"A\" Com Diagonais <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        for(j=1;j<=i;j++)printf("  ");
                        for(j=1;j<=n;j++){
                            if((j==1)||(i==1)||(j==n)||(i==n)||(i==j)||(j+i==n+1))printf("# ");
                            else printf("  ");
                        }
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 18:
                printf("\t   >>> Paralelogramo \"B\" Com Diagonais <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        for(j=i;j<=n;j++)printf("  ");
                        for(j=1;j<=n;j++){
                            if((j==1)||(i==1)||(j==n)||(i==n)||(i==j)||(j+i==n+1))printf("# ");
                            else printf("  ");
                        }
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 19:
                printf("\t      >>> Paralelogramo \"A\" Deitado <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n/1.6;i++){
                        for(j=1;j<=i;j++)printf("  ");
                        for(j=1;j<=n*1.7;j++)printf("# ");
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 20:
                printf("\t      >>> Paralelogramo \"B\" Deitado <<<\n\n");
                printf("Tamanho: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n/1.6;i++){
                        for(j=i;j<=n/1.6;j++)printf("  ");
                        for(j=1;j<=n*1.7;j++)printf("# ");
                        printf("\n");
                    }
                }else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 21:
                printf("\t\t >>> Ret�ngulo Preenchido <<<\n\n");
                printf("Tamanho da base: ");
                scanf("%i", &n);
                printf("Tamanho da altura: ");
                scanf("%i", &k);
                printf("\n");
                if((n>=2)&&(k>=2)&&(n!=k)){
                    for(i=1;i<=k;i++){
                        printf("   ");
                        for(j=1;j<=n;j++)printf(" # ");
                        printf("\n");
                    }
                }else if((n>=2)&&(k>=2)&&(n==k))printf("\t  Quadrado � um caso especial de\n\t  ret�ngulo, mas aqui, geramos\n\t  quadril�teros com lados diferentes .-.\n");
                else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 22:
                printf("\t\t   >>> Ret�ngulo Vazio <<<\n\n");
                printf("Tamanho da base: ");
                scanf("%i", &n);
                printf("Tamanho da altura: ");
                scanf("%i", &k);
                printf("\n");
                if((n>=2)&&(k>=2)&&(n!=k)){
                    for(i=1;i<=k;i++){
                        printf("   ");
                        for(j=1;j<=n;j++){
                            if((i==1)||(j==1)||(j==n)||(i==k))printf(" # ");
                            else printf("   ");
                        }
                        printf("\n");
                    }
                }else if((n>=2)&&(k>=2)&&(n==k))printf("\t  Quadrado � um caso especial de\n\t  ret�ngulo, mas aqui, geramos\n\t  quadril�teros com lados diferentes .-.\n");
                else printf("\t\t Imposs�vel formar a figura :/\n");
                printf("\n");
            break;
            case 23:
                printf("\t\t >>> Trap�zio \"A\" Preenchido <<<\n\n");
                printf("Tamanho da altura (h): ");
                scanf("%i", &n);
                printf("Tamanho da base menor (b): ");
                scanf("%i", &k);
                printf("\n\tB = h + (b-1)\n\tB = %i + (%i-1)", n, k);
                printf("\n\tB = %i + (%i)", n, k-1);
                printf("\n\tB = %i\n", n+k-1);
                printf("\n");
                if(n>=2 && k>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=k+i-1;j++)printf(" # ");
                        printf("\n");
                    }
                }else printf("\t\tImposs�vel formar um trap�zio!\n");
                printf("\n");
            break;
            case 24:
                printf("\t\t   >>> Trap�zio \"A\" Vazio <<<\n\n");
                printf("Tamanho da altura (h): ");
                scanf("%i", &n);
                printf("Tamanho da base menor (b): ");
                scanf("%i", &k);
                printf("\n\tB = h + (b-1)\n\tB = %i + (%i-1)", n, k);
                printf("\n\tB = %i + (%i)", n, k-1);
                printf("\n\tB = %i\n", n+k-1);
                printf("\n");
                if(n>=2 && k>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=k+i-1;j++){
                            if((i==1)||(j==1)||(j==k+i-1)||(i==n))printf(" # ");
                            else printf("   ");
                        }
                        printf("\n");
                    }
                }else printf("\t\tImposs�vel formar a figura!\n");
                printf("\n");
            break;
            case 25:
                printf("\t\t   >>> Trap�zio \"B\" Preenchida <<<\n\n");
                printf("Altura: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        if (i == 1)
                            i += 3;
                        for(j=i;j<=n;j++)
                            printf(" ");
                        for(j=1;j<=i;j++){
                            printf("# ");
                        }
                        printf("\n");
                    }
                }else printf("\t\tImposs�vel formar a figura!\n");
                printf("\n");
            break;
            case 26:
                system("color 4");
                printf("\t\t       >>> Cora��o <<<\n\n");
                for(i=1;i<=5;i++){
                    printf("         ");
                    for(j=5;j>=i;j--)printf("  ");
                    for(k=1;k<=i;k++)printf("**");
                    for(l=1;l<=i;l++)printf("**");
                    for(n=4;n>=i;n--)printf("    ");
                    for(k=1;k<=i;k++)printf("**");
                    for(l=1;l<=i;l++)printf("**");
                    printf("\n");
                }
                for(i=10;i>=1;i--){
                    printf("          ");
                    for(j=10;j>=i;j--)printf("  ");
                    for(l=1;l<=i;l++)printf("**");
                    for(n=i;n>=2;n--)printf("**");
                    printf("\n");
                }
                printf("\n");
            break;
            case 27:
                printf("\t\t>>> Pir�mide \"A\" Preenchida <<<\n\n");
                printf("Altura: ");
                scanf("%i", &n);
                printf("\n");
                y = n-1;
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=y;j++)
                            printf("   ");
                        y--;
                        for(j=1;j<=x;j++)
                            printf(" # ");
                        x += 2;
                        printf("\n");
                    }
                }else printf("\t\tImposs�vel formar a figura!\n");
                printf("\n");
                break;
            case 28:
                printf("\t\t  >>> Pir�mide \"A\" Vazia <<<\n\n");
                printf("Altura: ");
                scanf("%i", &n);
                printf("\n");
                y = n-1;
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=1;j<=y;j++)
                            printf("   ");
                        y--;
                        for(j=1;j<=x;j++){
                            if((j==1)||(j==x)||(i==n))printf(" # ");
                            else printf("   ");
                        }
                        x += 2;
                        printf("\n");
                    }
                }else printf("\t\tImposs�vel formar a figura!\n");
                printf("\n");
                break;
            case 29:
                printf("\t\t >>> Pir�mide \"B\" Preenchida <<<\n\n");
                printf("Altura: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=i;j<=n;j++)
                            printf(" ");
                        for(j=1;j<=i;j++){
                            printf("# ");
                        }
                        printf("\n");
                    }
                }else printf("\t\tImposs�vel formar a figura!\n");
                printf("\n");
                break;
            case 30:
                printf("\t\t   >>> Pir�mide \"B\" Vazia <<<\n\n");
                printf("Altura: ");
                scanf("%i", &n);
                printf("\n");
                if(n>=2){
                    for(i=1;i<=n;i++){
                        printf("   ");
                        for(j=i;j<=n;j++)
                            printf(" ");
                        for(j=1;j<=i;j++){
                            if((j==1)|(j==i)|(i==n))printf("# ");
                            else printf("  ");
                        }
                        printf("\n");
                    }
                }else printf("\t\tImposs�vel formar a figura!\n");
                printf("\n");
                break;
            default:
                printf("\n\t\t\tOp��o Inv�lida :/\n\n");
        }
        printf("����������������������\n");
        printf("Deseja parar? ");
        scanf("%s", &resp);
        system("color 2");
        //system("cls");
        //clrscr();
    }while(resp != 's');
    system("pause");
    return 0;
}
