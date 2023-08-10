#include <stdio.h>
#include <stdlib.h>

int main(){

    /*
        switch � uma estrutura semelhante ao comando if,
        ou seja, trabalha com condi��es. Cada else if �
        alterado para case ():

                Estutura do switch:

                switch (vari�vel){
                    case(condi��o 1/valor 1):
                        instru��es
                    break;
                    case(condi��o 2/valor 2):
                        instru��es
                    break;
                    default:
                }

        --> a instru��o default ser� executada se:
        a) Nenhum dos casos forem satisfat�rio
        b) N�o tiver a instru��o "break" em algum dos casos
    */

    int op;
    printf("Esolha: ");
    scanf("%i", &op);
    switch(op){
        case 1:
            printf("\nop = 1");
            break;
        case 2:
            printf("\nop = 2");
            break;
        default:
            printf("\nop = x");

    }
    printf("\n");
    printf("\n");

    /*

    Quando n�o colocamos um break e nenhuma instru��o, o caso "case" de baixo se comporta como
    uma condi��o composta, ou seja, um intervalo de valores:

    */

    printf("Esolha: ");
    scanf("%i", &op);
    switch(op){
        case 1:
            printf("\nop = 1");
            break;
        case 2:
        case 3:
        case 4:
        case 5:
            printf("\nop = 2 a 5");
            break;
        default:
            printf("\nop = x");

    }
    printf("\n");
    printf("\n");

    /*

    Todavia, se colocarmos um valor/instru��o no caso, a situa��o muda, ao digitar
    o valor do primeiro "case" teremos a execu��o de todos os outros casos abaixo,
    por�m se digitar o valor do �ltimo caso, teremos apenas uma execu��o:

    */

    printf("Esolha: ");
    scanf("%i", &op);
    printf("\n");
    switch(op){
        case 1: printf("Caso 1 ");
        case 2: printf("Caso 2 ");
        case 3: printf("Caso 3 ");
            break;
        case 4:
            printf("op = 4");
            break;
        default:
            printf("op = x");

    }
    printf("\n");

    return 0;
}
