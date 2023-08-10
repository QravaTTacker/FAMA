#include <stdio.h>

int main()
{

    float s = 560.00;
    float x, ss;
    int o;

    printf("Saldo atual: %.2f R$\n", s);
    printf("Digite (1) para: Deposito.\n");
    printf("Digite (2) para: Saque.\n");
    scanf("%i", &o);

    if (o == 1)
    {
        printf("\nInforme o valor do deposito: \n");
        scanf("%f", &x);
        ss = s + x;
        printf("Saldo atual: %.2f R$\n", ss);
    }
    else if (o == 2)
    {
        printf("\nInforme o valor do saque: \n");
        scanf("%f", &x);
        ss = s - x;
        printf("Saldo atual: %.2f R$\n", ss);
    }
    else
    {
        printf("\nFalso :/ \n");
    }

    return 0;
}
