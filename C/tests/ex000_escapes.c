#include <stdio.h>

int main()
{
    printf("\t1\n");
    printf("\t\t2\n");
    printf("3\n");
    printf("4\a");
    printf("t5\b");
    printf("\n6");
    printf("7\n");

    for (int i = 0; i < 10000; i++)
    {
        printf("%*d\r", (i / 100), i);
    }
    return 0;
}
