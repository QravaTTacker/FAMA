#include <stdio.h>
#include <stdlib.h>
#include <conio2.h>

int main()
{
    int resp;
    do
    {
        int num = 0;
        printf(" Tamanho = ");
        scanf("%d", &num);
        fflush(stdin);
        textcolor(GREEN);
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
        textcolor(WHITE);
        printf("\nPara? \n S - 1\n N - 0\n >>> ");
        scanf("%i", &resp);
        fflush(stdin);
        system("cls");
    } while (resp != 1);
    return 0;
}
