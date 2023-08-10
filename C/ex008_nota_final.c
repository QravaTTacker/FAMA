#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{

    // Nota Final
    setlocale(LC_ALL, "portuguese");
    system("color 2");

    float n1 = 0, n2 = 0, tra = 0, m = 0;

    printf("\n______________________ Registro De Notas Bimestrais ______________________\n");
    printf("\nObs: Peso de cada prova: 0 a 8 pontos. // Peso do trabalho: 0 a 2 pontos.");
    printf("\n__________________________________________________________________________\n");
    printf("\n\n-----------------------------");
    printf("\nNota da Primeira Prova: ");
    scanf("%f", &n1);
    printf("-----------------------------\n");
    printf("Nota da Segunda Prova: ");
    scanf("%f", &n2);
    printf("-----------------------------\n");
    printf("Nota do Trabalho: ");
    scanf("%f", &tra);
    printf("-----------------------------\n");

    m = ((n1 + n2) / 2) + tra;

    if ((m >= 7) && (m <= 10) && (tra >= 0) && (tra <= 2) && (n1 <= 8) && (n1 >= 0) && (n2 <= 8) && (n2 >= 0))
    {
        printf("\n_____________________ Mensagem _____________________\n\n");
        printf("\nNota final: %.2f\n", m);
        printf("\n\n\t   Parabéns, você está aprovado! \1\n");
        printf("\n____________________________________________________\n\n");
    }
    else if ((m < 7) && (m >= 0) && (tra >= 0) && (tra <= 2) && (n1 <= 8) && (n1 >= 0) && (n2 <= 8) && (n2 >= 0))
    {
        printf("\n_____________________ Mensagem _____________________\n\n");
        printf("\nNota final: %.2f\n", m);
        printf("\n\n\t\tVocê está reprovado :/\n");
        printf("\n____________________________________________________\n\n");
    }
    else if ((n1 > 8) || (n2 > 8) || (tra > 2) || (m > 10))
    {
        printf("\n________________________ Mensagem ________________________\n\n");
        printf("\nO valor de uma das avaliações está maior que o esperado...\n");
        printf("\n__________________________________________________________\n\n");
    }
    else
    {
        printf("\n________________________ Mensagem ________________________\n\n");
        printf("\n                           Falso                              \n");
        printf("\n___________________________________________________________\n\n");
    }

    return 0;
}
