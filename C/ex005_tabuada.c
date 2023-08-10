#include <stdio.h>

int main()
{
    int ch = 0;
    int var = 0;
    do
    {
        printf("Escreva um valor: ");
        scanf("%i", &var);
        printf("Tabuada do %i:\n", var);
        for (int i = 0; i < 10; i++)
        {
            printf("\n%i x %i = %i", var, i, (var * i));
        }
        printf("\n\nEncerrar?\n0 - No\n1 - Yes\nR: ");
        fflush(stdin);
        scanf("%i", &ch);
    } while (ch == 0);
    return 0;
}
