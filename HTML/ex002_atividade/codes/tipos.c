#include <stdio.h>

int main(void)
{
    int idade = 20;
    float dinheiro = 12.34f;
    char cifrao = '$';
    char nome[] = "Cristian";

    printf("Nome: %s \n", nome);
    printf("Idade: %i \n", idade);
    printf("Dinheiro: R%c%g \n", cifrao, dinheiro);

    return 0;
}
