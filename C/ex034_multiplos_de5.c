#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    system("color 6");
    int x;
    printf(" Informe um valor: ");
    scanf("%i", &x);
    if(x%5==0)
        printf("\n %i é multiplo de 5!\n", x);
    else
        printf("\n %i não é multiplo de 5 :/\n", x);
    return 0;
}
