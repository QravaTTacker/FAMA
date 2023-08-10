#include <stdio.h>
#include <stdlib.h>

int main(){

    int n1, n2;
    n1 = 5;
    n2 = 10;

    int soma = n1 + n2;
    printf("5 + 10 = %i\n", soma);

    int sub = n1 - n2;
    printf("5 - 10 = %i\n", sub);

    int sub2 = n2 - n1;
    printf("10 - 5 = %i\n", sub2);

    int mul = n1 * n2;
    printf("5 x 10 = %i\n", mul);

    int div = n2 / n1;
    printf("10 / 5 = %i\n", div);

    int div2 = 25 / 10;
    printf("25 / 10 = %i (apenas o valor inteiro)\n", div2);
    printf("25 / 10 = %i (apenas o resto da div...)\n", 25%10);

    return 0;
}
