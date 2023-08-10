#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio2.h>

int validar(int A, int B);

int main(void){

    textcolor(GREEN);
    setlocale(LC_ALL, "portuguese");

    int a = 0, b = 0;

    printf(" A = ");
    scanf("%d", &a);
    printf(" B = ");
    scanf("%d", &b);

    printf(" O retorno da função validar é %d \n", validar(a, b));

    if(validar(a, b))
        printf("\n A é maior que B\n");
    else
        printf("\n A NÃO é maior que B\n");
    return 0;
}

int validar(int A, int B){
    printf("\n Analisando... \n");
    if(A > B)
        return 1;
    return 0;
}
