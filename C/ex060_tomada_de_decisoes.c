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

        // A instrução toupper () deixa qualquer caractere em caixa alta, basta colocar a letra que representa a variável de caractere.
        // Nesse programa, se o usuário colocar em caixa alta o primeiro caractere, o programa não usa a função if.

    return 0;
}
