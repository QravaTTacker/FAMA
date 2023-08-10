#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <windows.h>

#define myRand(min, max) (rand() % (int)(max + 1 - min)) + min
#define SEM_COR "\x1b[m"

int main()
{
    SetConsoleTitle("Linguagem C");
    char test_frase[30];

    printf("INPUT TESTE: ");
    fgets(test_frase, 30, stdin);

    HANDLE h = GetStdHandle(STD_OUTPUT_HANDLE);
    DWORD out = 0;
    GetConsoleMode(h, &out);
    out |= ENABLE_VIRTUAL_TERMINAL_PROCESSING;
    SetConsoleMode(h, out);
    puts("\x1B[32m");

    srand((unsigned int)time(NULL));
    int valor_random = 0;

    while (!(valor_random == 151))
    {
        valor_random = myRand(0, 150);
        printf("\x1B[48;5;%dm", valor_random);
        printf("%*d%s\n", valor_random, valor_random, SEM_COR);
        Sleep(50LU);
    }
    return 0;
}
