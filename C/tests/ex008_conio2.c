#include <stdio.h>
#include <conio2.h>
void main()
{
    float a, b;
    clrscr();
    printf(" Prova I: ");
    scanf("%f", &a);
    printf(" Prova II: ");
    scanf("%f", &b);
    if((a+b)/2 >= 7.0)
    {
        textcolor(GREEN);
        cprintf("\n Aprovado, Nota %.2f :)\n", (a+b)/2);
    }
    else
    {
        textcolor(RED);
        cprintf("\n Reprovado, Nota %.2f :(\n", (a+b)/2);
    }
    textcolor(WHITE);
}
