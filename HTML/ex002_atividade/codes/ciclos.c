#include <stdio.h>
#include <math.h>

int main(void)
{

    for (int cont = 0; cont < 100; cont++)
    {
        if (!fmod(cont, 7))
        {
            printf("%i\n", cont);
        }
    }

    return 0;
}
