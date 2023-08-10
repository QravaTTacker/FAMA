#include <time.h>
#include <stdio.h>
#include <windows.h>

#define myRand(min, max) (rand() % (int)(max + 1) - min) + min
#define SIZE 30

int main()
{
    SetConsoleOutputCP(CP_UTF8);
    srand(time(NULL));
    puts("\x1B[2J\x1B[H");

    int min = 1;
    int max = 100;
    int pontos = 0;
    int vidas = 3;
    int ope = 0;
    int sort1 = 0;
    int sort2 = 0;

    float resultado = 0.0f;
    char nome[SIZE] = {'\0'};
    char opes[4] = {'\0'};
    char continuar = 'S';

    opes[0] = '+';
    opes[1] = '-';
    opes[2] = '*';
    opes[3] = '/';

    printf("----------------------------------\n");
    printf("\nInforme o nome do jogador: ");
    fgets(nome, SIZE, stdin);
    printf("\n----------------------------------\n");

    while (continuar != 'n' && continuar != 'N' && vidas > 0)
    {
        ope = myRand(0, 3);
        sort1 = myRand(min, max);
        sort2 = myRand(min, max);

        fflush(stdin);
        printf("\nQuanto é %i %c %i = ", sort1, opes[ope], sort2);
        scanf("%f", &resultado);

        if (opes[ope] == '+')
        {
            if (resultado == (sort1 + sort2))
                pontos += 10;
            else
                vidas--;
        }
        else if (opes[ope] == '-')
        {
            if (resultado == (sort1 - sort2))
                pontos += 10;
            else
                vidas--;
        }
        else if (opes[ope] == '*')
        {
            if (resultado == (sort1 * sort2))
                pontos += 10;
            else
                vidas--;
        }
        else if (opes[ope] == '/')
        {
            if (resultado == (sort1 / sort2))
                pontos += 10;
            else
                vidas--;
        }
        printf("Pontos: %d Vidas: %d", pontos, vidas);

        fflush(stdin);
        printf("\nDeseja continuar s/n: ");
        scanf("%c", &continuar);
    }
    printf("\n-----------------------------\n");
    printf("\nNome do jogador: %s \nTotal de pontos: %d\n", nome, pontos);
    printf("\n-----------------------------\n");
    return 0;
}
