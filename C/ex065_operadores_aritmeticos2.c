#include <stdio.h>
#include <stdlib.h>

int main(){

    float x = 0;
    float y = 0;

    printf("Um valor: ");
    scanf("%f", &x);

    printf("-----------------------\n");
    printf("\t%.2f\n", x);
    printf("-----------------------\n");

    x *= 5;

    printf("\t%2f\n", x);

    // var += 5 <==> var = var + 5
    // var <operador aritmético>= <valor para a operação>

    printf("-----------------------\n");

    printf("Um valor: ");
    scanf("%f", &y);

    y++;

    printf("\t%.2f (var++)\n", y);

    // y++ = y + 1

    printf("-----------------------\n");

    printf("Um valor: ");
    scanf("%f", &y);

    y--;

    printf("\t%.2f (var--)\n", y);

    // y-- = y - 1

    printf("-----------------------\n");

    return 0;
}
