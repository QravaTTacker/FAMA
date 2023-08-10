#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    // Imposto de renda
    system("color 2");
    setlocale(LC_ALL, "portuguese");

    float salario = 0, imposto = 0, aliquota = 0, parcela = 0;

    printf("_______________ Imposto De Renda _______________\n\n");
    printf("\nInforma a sua renda: ");
    scanf("%f", &salario);
    printf("\n-------------------------\n");

    if ((salario >= 0) && (salario <= 1499.15))
    {
        imposto = (salario * aliquota) - parcela;
        printf("\nValor do imposto: R$%.2f \n", imposto);
    }
    else if ((salario >= 1499.16) && (salario <= 2246.75))
    {
        aliquota = 7.5;
        parcela = 112.43;
        imposto = (salario * aliquota) - parcela;
        printf("\nValor do imposto: R$%.2f\n", imposto);
    }
    else if ((salario >= 2246.76) && (salario <= 2995.70))
    {
        aliquota = 15;
        parcela = 280.94;
        imposto = (salario * aliquota) - parcela;
        printf("\nValor do imposto: R$%.2f\n", imposto);
    }
    else if ((salario > 2995.70) && (salario <= 3743.19))
    {
        aliquota = 22.5;
        parcela = 505.64;
        imposto = (salario * aliquota) - parcela;
        printf("\nValor do imposto: R$%.2f\n", imposto);
    }
    else if (salario > 3743.19)
    {
        aliquota = 27.5;
        parcela = 692.78;
        imposto = (salario * aliquota) - parcela;
        printf("\nValor do imposto: R$%.2f\n", imposto);
    }
    else
    {
        printf("\nInforme um valor válido\n");
    }
    printf("________________________________________________\n\n");
    return 0;
}
