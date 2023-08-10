#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main()
{
    setlocale(LC_ALL, "portuguese");
    int x = 0, y = 0;
    printf(" X = ");
    scanf("%d", &x);
    printf(" Y = ");
    scanf("%d", &y);
    if (x % y == 0 || y % x == 0)
        printf("\n S�o m�ltiplos\n");
    else
        printf("\n N�o s�o m�ltiplos\n");
    return 0;
}
