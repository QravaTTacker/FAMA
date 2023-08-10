#include <stdio.h>
#include <stdlib.h>

    /* Operadores.

    = Operador de atribui��o.
    == Operador de compara��o positiva (se � igual).
    != Operador de compara��o negativa (se � diferente).
    ! Operador de nega��o.

    */

int main()
{
    printf("I parte: Operadores I e Valor de Condi...\n\n");

        //Quando imprimimos a valor de uma condi��o, temos os seguintes resultados:
        //Se o valor for verdade -> 1
        //Se o valor for falso -> 0

        //Para compara��o positiva...

        int i = 10;

        printf("%i\n", i==1); //Estamos imprimindo o valor de uma condi��o.
        printf("%i\n", i==10);

        //Para compara��o negativa...

        printf("%i\n", i!=1);
        printf("%i\n\n", i!=10);

        //Para NEGA��O (!) de condi��es...

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

        /* Resultado na nega��o.

        Na nega��o ele ser�:

        1
        0
        0
        1

        */

        //obs: Nota-se que o valor � invertido na nega��o de condi��es.

    printf("II Parte: Escolhas.\n\n");

        /*

        if(condi��o){ ----> Se for isso ent�o...

        [...] ----> Fa�a isso.

        }else{ ----> Se n�o for, ent�o...

        [...] ----> Fa�a isso.

        }

        */

        float x;
        printf("Digite um valor diferente (!=) de 5: ");
            scanf("%f", &x);
                if(x == 5){           //Se x fosse uma vari�vel de um caractere, colocamos o seu valor entre ''.

                    printf("\nFalso\n");

                }else{

                    printf("\nVerdadeiro\n");
                }

    return 0;
}
