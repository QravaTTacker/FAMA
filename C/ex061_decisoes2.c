#include <stdio.h>
#include <stdlib.h>

    /* Operadores.

    = Operador de atribuição.
    == Operador de comparação positiva (se é igual).
    != Operador de comparação negativa (se é diferente).
    ! Operador de negação.

    */

int main()
{
    printf("I parte: Operadores I e Valor de Condi...\n\n");

        //Quando imprimimos a valor de uma condição, temos os seguintes resultados:
        //Se o valor for verdade -> 1
        //Se o valor for falso -> 0

        //Para comparação positiva...

        int i = 10;

        printf("%i\n", i==1); //Estamos imprimindo o valor de uma condição.
        printf("%i\n", i==10);

        //Para comparação negativa...

        printf("%i\n", i!=1);
        printf("%i\n\n", i!=10);

        //Para NEGAÇÃO (!) de condições...

        /* Resultado.

        O resultado anterior foi:

        0
        1
        1
        0

        */

        printf("%i\n", !(i==1));
        printf("%i\n", !(i==10));
        printf("%i\n", !(i!=1));
        printf("%i\n\n", !(i!=10));

        /* Resultado na negação.

        Na negação ele será:

        1
        0
        0
        1

        */

        //obs: Nota-se que o valor é invertido na negação de condições.

    printf("II Parte: Escolhas.\n\n");

        /*

        if(condição){ ----> Se for isso então...

        [...] ----> Faça isso.

        }else{ ----> Se não for, então...

        [...] ----> Faça isso.

        }

        */

        float x;
        printf("Digite um valor diferente (!=) de 5: ");
            scanf("%f", &x);
                if(x == 5){           //Se x fosse uma variável de um caractere, colocamos o seu valor entre ''.

                    printf("\nFalso\n");

                }else{

                    printf("\nVerdadeiro\n");
                }

    return 0;
}
