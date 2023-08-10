#include <stdio.h>

int main(void)
{
    const double media = 7.0;
    double nota = 0.0;

    printf("Sua nota: ");
    scanf("%lf", &nota);

    if (nota >= media)
    {
        puts("Aprovado");
    }
    else if (nota >= 5.0)
    {
        puts("Fazer Substitutiva!");
    }
    else
    {
        puts("Reprovado");
    }
    return 0;
}
