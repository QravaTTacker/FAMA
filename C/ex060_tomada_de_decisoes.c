#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

    // Na biblioteca ctype nos possibilita manipular caracteres.

int main()
{
    char i;
    printf("Digite um caractere em letra de caixa baixa: ");
        scanf("%c", &i);

        if(i >= 'a')
        {
            printf("\nSegue a letra que vc digitou em caixa alta: %c\n", toupper(i));

        }else {

            printf("\nVc digitou uma letra em caixa alta ou outro caractere :(\n");
        }

        // A instru��o toupper () deixa qualquer caractere em caixa alta, basta colocar a letra que representa a vari�vel de caractere.
        // Nesse programa, se o usu�rio colocar em caixa alta o primeiro caractere, o programa n�o usa a fun��o if.

    return 0;
}
