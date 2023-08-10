#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio2.h>

long fib(long);
void msg(void);

int main()
{
    setlocale(LC_ALL, "portuguese");
    textcolor(GREEN);
    char resp;
    do
    {
        int lim = 0;
        printf(" N�mero de termos: ");
        scanf("%d", &lim);
        clrscr();
        msg();
        long F = 0, x = 0, y = 1;
        for (int i = 0; i < lim; i++)
        {
            if (i == 0)
                printf(" %2d� %8s %10d ", i + 1, "termo ->", x);
            else if (i == 1)
                printf(" %2d� %8s %10d ", i + 1, "termo ->", y);
            else
            {
                F = x + y;
                x = y;
                y = F;
                printf(" %2d� %8s %10d ", i + 1, "termo ->", F);
            }
            printf("      ||      ");
            printf(" %2d� %8s %10d ", i + 1, "termo ->", fib(i));
            printf("\n");
        }
        msg();
        printf("\n Para? [s/n] ");
        scanf("%s", &resp);
        clrscr();
    } while (resp != 's');
    return 0;
}

long fib(long h)
{
    if (h == 0 || h == 1)
        return h;
    else
        return fib(h - 1) + fib(h - 2);
}

void msg(void)
{
    for (int i = 0; i < 65; i++)
        printf("-");
    printf("\n");
}
