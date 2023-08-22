#include <stdio.h>
#include <stdlib.h>

int main()
{
    int resp;
    do
    {
        int num = 0;
        printf(" Tamanho = ");
        scanf("%d", &num);
        fflush(stdin);
        puts("\x1b[31;1m");
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < i; j++)
                printf(" ");
            for (int j = 0; j < i; j++)
                printf(" $");
            printf("\n");
        }
        for (int i = 0; i < num; i++)
        {
            for (int j = num; j > i; j--)
                printf(" ");
            for (int j = num; j > i; j--)
                printf(" $");
            printf("\n");
        }
        puts("\x1b[m");
        printf("\nPara? \n S - 1\n N - 0\n >>> ");
        scanf("%i", &resp);
        fflush(stdin);
        system("cls");
    } while (resp != 1);
    return 0;
}
