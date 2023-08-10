#include <stdio.h>

int main()
{
    // Declaração de variáveis
    float n1, n2;

    // Iniciação de variáveis
    n1 = 7.5;
    n2 = 4.85;

    // Saída de dados
    printf("Valores: %.2f e %.2f\n", n1, n2);
    printf("\n----------------------");

    float n3;

    printf("\nDigite uma nota: ");

    // Entrada de dados (variável dinâmica)
    scanf("%f", &n3);
    printf("\nValores: %.2f, %.2f e %.2f\n", n1, n2, n3);

    // Variável Estática = sempre possui o mesmo valor (atribuição estática)
    // Variável Dinâmica = seu valor irá mudara cada execução (atribuição dinâmica)

    return 0;
}
