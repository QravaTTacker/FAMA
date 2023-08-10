#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");

    int op = 0;
    float n1 = 0.0, n2 = 0.0;

    printf("\n---------------- Calculadora - Versão 1 -----------------\n\n");
    printf("Digite (1) para soma.\nDigite (2) para subtração.\nDigite (3) para multiplicação.\nDigite (4) para divisão.\n\n");
    printf("Deseja fazer que tipo de operação? ");
    scanf("%i", &op);

    if (op == 1)
    {
        float soma = 0;

        printf("\n---------------- SOMA -----------------\n\n");

        printf("Digite uma parcela: ");
        scanf("%f", &n1);
        printf("Digite outra parcela: ");
        scanf("%f", &n2);

        soma = n1 + n2;
        printf("\n%.2f somado com %.2f resulta em: %.2f\n", n1, n2, soma);
        printf("\n---------------------------------------\n\n");
    }
    else if (op == 2)
    {
        float sub = 0;

        printf("\n---------------- SUBTRAÇÃO -----------------\n\n");

        printf("Digite o valor do minuendo: ");
        scanf("%f", &n1);
        printf("Digite o valor do subtraendo: ");
        scanf("%f", &n2);

        sub = n1 - n2;
        printf("\n%.2f subtraindo por %.2f resulta em: %.2f\n", n1, n2, sub);
        printf("\n--------------------------------------------\n\n");
    }
    else if (op == 3)
    {
        float mult = 0;

        printf("\n---------------- MULTIPLICAÇÃO -----------------\n\n");

        printf("Digite um fator: ");
        scanf("%f", &n1);
        printf("Digite outro fator: ");
        scanf("%f", &n2);

        mult = n1 * n2;
        printf("\n%.2f multiplicado por %.2f resulta em: %.2f\n", n1, n2, mult);
        printf("\n------------------------------------------------\n\n");
    }
    else if (op == 4)
    {
        float div = 0;

        printf("\n---------------- DIVISÃO -----------------\n\n");

        printf("Digite o valor do dividendo: ");
        scanf("%f", &n1);
        printf("Digite o valor do divisor: ");
        scanf("%f", &n2);

        if (n2 != 0)
        {
            div = n1 / n2;
            printf("\n%.2f dividido por %.2f resulta em: %.2f\n", n1, n2, div);
            printf("\n------------------------------------------\n\n");
        }
        else
        {
            printf("\nDivisor igual 0 resulta em erro :/\n");
            printf("\n------------------------------------------\n\n");
        }
    }
    else
    {
        printf("\n----------------------------------------\n");
        printf("\n\t\tFalso\n");
        printf("\n----------------------------------------\n");
    }
    return 0;
}
