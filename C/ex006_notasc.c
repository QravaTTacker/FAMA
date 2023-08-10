#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    // Exemplo do livro
    setlocale(LC_ALL, "portuguese");

    float nota = 0;

    printf("--------- Aproveitamento De Aluno ---------");
    printf("\n\nInforme a sua última nota (exemplo: 8.7): ");
    scanf("%f", &nota);

    if ((nota <= 10) && (nota >= 9))
    {
        printf("\nAproveitamento: A \n\n\tPleno! \2\n");
    }
    else if ((nota < 9) && (nota >= 8))
    {
        printf("\nAproveitamento: B \n\n\tParcialmente pleno!\n");
    }
    else if ((nota < 8) && (nota >= 7))
    {
        printf("\nAproveitamento: C \n\n\tSuficiente!\n");
    }
    else if ((nota < 7) && (nota >= 6))
    {
        printf("\nAproveitamento: D \n\n\tBaixo :/\n");
    }
    else if ((nota < 6) && (nota >= 0))
    {
        printf("\nAproveitamento: F \n\n\tVocê estudou?\n");
    }
    else
    {
        printf("\n                  Falso                   \n");
    }
    printf("\n-------------------------------------------");
    return 0;
}
