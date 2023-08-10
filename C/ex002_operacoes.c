#include <stdio.h>
#include <stdlib.h>

int main()
{
    float x = 0.0f, f = 0.0f, y = 0.0f, o = 0.0f;

    printf("Digite um valor: ");
    scanf("%f", &x);
    printf("Digite um segundo valor: ");
    scanf("%f", &y);

    if ((x == 0) && (y == 0))
    {
        printf("\n-----------------------");
        printf("\nx e y = 0\n");
        o = x + y;
        printf("\n(%.2f) + (%.2f) = (%.2f)\n", x, y, o);
        o = x - (y);
        printf("(%.2f) - (%.2f) = (%.2f)\n", x, y, o);
        o = y - (x);
        printf("(%.2f) - (%.2f) = (%.2f)\n", y, x, o);
        o = x * y;
        printf("(%.2f) * (%.2f) = (%.2f)\n", x, y, o);
        printf("(%.2f) / (%.2f) = Falso\n", x, y);
    }
    else if (x == 0)
    {
        printf("\n-----------------------");
        printf("\nx = 0\n");
        o = x + y;
        printf("\n(%.2f) + (%.2f) = (%.2f)\n", x, y, o);
        o = x - (y);
        printf("(%.2f) - (%.2f) = (%.2f)\n", x, y, o);
        o = y - (x);
        printf("(%.2f) - (%.2f) = (%.2f)\n", y, x, o);
        o = x * y;
        printf("(%.2f) * (%.2f) = (%.2f)\n", x, y, o);
        o = x / y;
        printf("(%.2f) / (%.2f) = (%.2f)\n", x, y, o);
        printf("(%.2f) / (%.2f) = Falso\n", y, x);
    }
    else if (y == 0)
    {
        printf("\n-----------------------");
        printf("\ny = 0\n");
        o = x + y;
        printf("\n(%.2f) + (%.2f) = (%.2f)\n", x, y, o);
        o = x - (y);
        printf("(%.2f) - (%.2f) = (%.2f)\n", x, y, o);
        o = y - (x);
        printf("(%.2f) - (%.2f) = (%.2f)\n", y, x, o);
        o = x * y;
        printf("(%.2f) * (%.2f) = (%.2f)\n", x, y, o);
        o = y / x;
        printf("(%.2f) / (%.2f) = (%.2f)\n", y, x, o);
        printf("(%.2f) / (%.2f) = Falso\n", x, y);
    }
    else
    {
        printf("\n-----------------------");
        o = x + y;
        printf("\n(%.2f) + (%.2f) = (%.2f)\n", x, y, o);
        o = x - (y);
        printf("(%.2f) - (%.2f) = (%.2f)\n", x, y, o);
        o = y - (x);
        printf("(%.2f) - (%.2f) = (%.2f)\n", y, x, o);
        o = x * y;
        printf("(%.2f) * (%.2f) = (%.2f)\n", x, y, o);
        o = x / y;
        printf("(%.2f) / (%.2f) = (%.2f)\n", x, y, o);
        o = y / x;
        printf("(%.2f) / (%.2f) = (%.2f)\n", y, x, o);
    }
    return 0;
}
