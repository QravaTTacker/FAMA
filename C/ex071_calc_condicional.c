#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main(){

    double n, m;
    char k;
    do{
        n = m = 0;
        printf("\n------------------------------------\n");
        printf("(1) Somar\n(2) Subtrair\n(3) Multiplicar\n(4) Dividir\n(k) Sair\n");
        printf("\nEscolha: ");
        scanf("%s", &k);
        printf("------------------------------------\n");

        if(k == '1'){
        printf("\nPrimeiro valor: ");
        scanf("%lf", &n);
        printf("Segundo valor: ");
        scanf("%lf", &m);
        printf("\n%.2lf + %.2lf = %.2lf\n\n", n, m, n+m);

        }else if (k == '2'){
        printf("\nPrimeiro valor: ");
        scanf("%lf", &n);
        printf("Segundo valor: ");
        scanf("%lf", &m);
        printf("\n%.2lf - %.2lf = %.2lf\n\n", n, m, n-m);

        }else if (k == '3'){
        printf("\nPrimeiro valor: ");
        scanf("%lf", &n);
        printf("Segundo valor: ");
        scanf("%lf", &m);
        printf("\n%.2lf * %.2lf = %.2lf\n\n", n, m, n*m);

        }else if (k == '4'){
        printf("\nPrimeiro valor: ");
        scanf("%lf", &n);
        printf("Segundo valor: ");
        scanf("%lf", &m);
        printf("\n%.2lf / %.2lf = %.2lf", n, m, n/m);
        printf("\n%.2lf / %.2lf = %.2lf\n\n", m, n, m/n);
        }else if (k == 'k') printf("\n\tSaindo...\n\n");
        else printf("\n\tFalso\n\n");

        printf("------------------------------------\n");
        if(k != 'k'){
        printf("\nDeseja continuar? [s/n] ");
        scanf("%s", &k);
        system("cls");
        }

        /*
        getche (); --> Recebe um valor e mostra na tela
        getch (); --> Recebe um valor, mas não mostra da tela
        system("pause");   Para o programa e manda o usuário interagir para continuar
        system("cls");  Limpa a tela do terminal
        */

    }while(k != 'k' && k != 'n');
    return 0;
}
