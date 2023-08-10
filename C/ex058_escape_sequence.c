#include <stdio.h>
#include <stdlib.h>

int main()
{
    // A linguagem C possui algumas constantes pré-definidas como as escape sequence.
    // A escape sequence (sequência de escapes: são códigos de barras invertidas.
    // \n é um exemplo que tem como função pular para a linha seguinte.
    // \t insere uma tabulação.

    printf("Eu sou o Code::Block!\n");
    printf("\tEu sou o Code::Block!\n");

    // Ao colocar duas barras invertidas "\\" iremos colocar a própria barra "\".
    printf("2\\2\n");

    // No caso das aspas, basta colocar \" ou \'.
    printf("Que \"legal\" rsrs.\n");

    // Por ultimo \0 indica ao programa para de imprimir.
    printf("Como foi o seu dia?\n\0 hoje?");

    return 0;
}
